/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelo.Jugador;
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
        mostrarDatos();
    }
    
    

    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void mostrarDatos() {
        vista.mostrarDatos(mesa, jugador);
    }
    
    public void salir(){
        mesa.quitarJugador(jugador);
    }
    
}
