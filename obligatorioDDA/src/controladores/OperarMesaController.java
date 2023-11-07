/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.List;
import modelo.Croupier;
import modelo.Efecto;
import modelo.Fachada;
import modelo.Mesa;
import modelo.Ronda;
import modelo.TipoApuesta;
import observador.Observable;
import observador.Observador;

public class OperarMesaController implements Observador {
    private VistaOperarMesa vista;
    private List<TipoApuesta>tiposApuesta;
    private List<Efecto> efectosDisponibles;
    private Croupier croupier;
    private Mesa mesa;

    public OperarMesaController(VistaOperarMesa vista, List<TipoApuesta> tiposApuesta, Croupier croupier) {
        this.vista = vista;
        this.tiposApuesta = tiposApuesta;
        this.croupier = croupier;
        this.mesa=Fachada.getInstancia().crearMesa(tiposApuesta, croupier, efectosDisponibles);
        this.efectosDisponibles=mesa.getEfectosDisponibles();
        vista.mostrarBalance(mesa.getBalanceMesa());
        vista.mostrarNumeroRonda(mesa.getRondaActual().getNumeroRonda());
        vista.mostrarNumeroRuleta(mesa.getNumeroRuleta());
        vista.mostrarEfectosDisponibles(efectosDisponibles);
        vista.mostrarDatosJugadores(mesa.getJugadores());
        mesa.agregarObservador(this);
        mesa.getRondaActual().agregarObservador(this);
    }
    
    public void cargarEfectos() {
        List<Efecto> efectos = mesa.getEfectosDisponibles(); 
        vista.mostrarEfectos(efectos);
    }
    
    public void lanzar(){
        mesa.getRondaActual().sortear(mesa.getRondas());
        mostrarNumeroGanador();
        mesa.nuevaRonda();
        

    }
    public void mostrarNumeroGanador(){
        vista.mostrarGanador(mesa.getRondaActual().getNumeroGanador());
        vista.mostrarLanzamientos(mesa.getRondaActual().getNumeroGanador());
    }
    
    public void mostrarCantidadApuestas(){
        int cantidad=mesa.getRondaActual().cantidadApuestasEnRonda();
        vista.mostrarCantidadApuestasDeRonda(cantidad);
    }
    public void mostrarMontoTotalRonda(){
        int monto=mesa.getRondaActual().montoTotalApostadoEnRonda();
        vista.mostrarMontoTotalDeRonda(monto);
        
    }


    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Mesa.eventos.cambioBalance)){
            vista.mostrarBalance(mesa.getBalanceMesa());
        }
        else if(evento.equals(Mesa.eventos.cambioRonda)){
            vista.mostrarNumeroRonda(mesa.getRondas().size());
        }
        else if(evento.equals(Mesa.eventos.seAgregoJugador) || evento.equals(Mesa.eventos.salioJugador) ){
            vista.mostrarDatosJugadores(mesa.getJugadores()); // pasar propiedades en lugar de el objeto 
        }
        else if(evento.equals(Ronda.eventos.agregoApuesta)){
            mostrarCantidadApuestas();
            mostrarMontoTotalRonda();
        }
        
    }

    public void setearEfecto(int pos) {
         Efecto efecto=efectosDisponibles.get(pos);
         mesa.getRondaActual().setEfectoSeleccionado(efecto);
    }

}
