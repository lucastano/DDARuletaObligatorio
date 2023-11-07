/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelo.Jugador;
import modelo.Ronda;
import modelo.Mesa;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author Lucas
 */
public class MesaJugadorController implements Observador {
    private VistaMesaJugador vista;
    private Mesa mesa;
    private Jugador jugador;
    

    public MesaJugadorController(VistaMesaJugador vista, Mesa mesa, Jugador jugador) {
        this.vista = vista;
        this.mesa = mesa;
        this.jugador=jugador;
        this.mesa.agregarObservador(this);
        mostrarDatos();
    }

    
    
    

    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Mesa.eventos.cambioRonda)){
            vista.mostrarDatos(mesa, jugador);
        }
//        else if(evento.equals(Ronda.eventos.agregoApuesta)){
//            
//        }
    }

    private void mostrarDatos() {
        vista.mostrarDatos(mesa, jugador);
    }
    
    public void salir(){
        mesa.quitarJugador(jugador);
    }
    public void realizarApuesta(int monto, int codigo){
        mesa.getRondaActual().nuevaApuesta(monto, jugador, codigo);
        mesa.getRondaActual().mostrarApuestas();
    }
    
}
