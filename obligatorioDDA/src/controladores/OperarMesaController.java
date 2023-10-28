/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.List;
import modelo.Croupier;
import modelo.Fachada;
import modelo.Mesa;
import modelo.TipoApuesta;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author Lucas
 */
public class OperarMesaController implements Observador {
    private VistaOperarMesa vista;
    private List<TipoApuesta>tiposApuesta;
    private Croupier croupier;
    private Mesa mesa;

    public OperarMesaController(VistaOperarMesa vista, List<TipoApuesta> tiposApuesta, Croupier croupier) {
        this.vista = vista;
        this.tiposApuesta = tiposApuesta;
        this.croupier = croupier;
        this.mesa=Fachada.getInstancia().crearMesa(tiposApuesta, croupier);
        vista.mostrarBalance(mesa.getBalanceMesa());
        vista.mostrarNumeroRonda(mesa.getRondas().size());
        vista.mostrarNumeroRuleta(mesa.getNumeroRuleta());
        mesa.agregarObservador(this);
    }
    
    

    

    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Mesa.eventos.cambioBalance)){
            vista.mostrarBalance(mesa.getBalanceMesa());
        }
        else if(evento.equals(Mesa.eventos.cambioRonda)){
            vista.mostrarNumeroRonda(mesa.getRondas().size());
        }
    }
    
    
    
}