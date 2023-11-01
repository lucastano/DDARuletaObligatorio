/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelo.Fachada;
import modelo.Jugador;
import modelo.Mesa;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author Lucas
 */
public class MostrarMesasController implements Observador {
    
    private VistaMostrarMesas vista;
    private Fachada modelo;

    public MostrarMesasController(VistaMostrarMesas vista, Fachada modelo) {
        this.vista = vista;
        this.modelo = modelo;
        modelo.agregarObservador(this);
        mostrarMesas();
    }
    public void salir(){
        modelo.quitarObservador(this);
    }
    
    
    public void unirseAMesa(int posMesa,Jugador jugador){
        Mesa mesa= modelo.getMesas().get(posMesa); 
        mesa.unirJugador(jugador);
        
        vista.unirseAMesa(mesa);
        
    }
    
    

    @Override
    public void actualizar(Object evento, Observable origen) {
        if(evento.equals(Fachada.eventos.cambio)){
            vista.mostrarMesas(Fachada.getInstancia().getMesas());
        }
        
    }

    private void mostrarMesas() {
        vista.mostrarMesas(modelo.getMesas());
    }
    
}
