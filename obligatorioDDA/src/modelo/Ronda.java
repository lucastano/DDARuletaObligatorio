/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import static modelo.Ronda.eventos.agregoApuesta;

import observador.Observable;

/**
 *
 * @author Lucas
 */
public class Ronda extends Observable {
    private int numeroRonda;
    private static int ultimoNumero=1;
    private Efecto efectoSeleccionado;
    private int numeroGanador;
    private List<Casillero>casillerosApostados= new ArrayList<>();
    
    public enum eventos{agregoApuesta};

    public Ronda() {
        
        this.numeroRonda=ultimoNumero;
        this.ultimoNumero++;
    }

    public void setEfectoSeleccionado(Efecto efectoSeleccionado) {
        this.efectoSeleccionado = efectoSeleccionado;
    }
    
    
    public void sortear(List<Ronda>rondas){
        this.numeroGanador=efectoSeleccionado.sortear(rondas);
    }

    public int getNumeroRonda() {
        return numeroRonda;
    }

    public int getNumeroGanador() {
        return numeroGanador;
    }
    
    public void nuevaApuesta( int monto,Jugador jugador,int codigo){
        Apuesta apuesta = new Apuesta(monto,jugador); 
        Casillero casillero = new Casillero(codigo);
        if(!existe(casillero)){
            casillero.agregarApuesta(apuesta);
            casillerosApostados.add(casillero);
            avisar(agregoApuesta);
        }else{
            Casillero obtenido=obtenerCasillero(casillero);
            obtenido.agregarApuesta(apuesta);
            avisar(agregoApuesta);
            
        }
    }
    
    
    
    public boolean existe (Casillero casillero){
        if(casillerosApostados.isEmpty()){
            return false;
        }else{
             return this.casillerosApostados.contains(casillero);
        }
       
    }

    private Casillero obtenerCasillero(Casillero casillero) {
        for(Casillero c:casillerosApostados){
            if(c.equals(casillero)){
                return c;
            }
        }
        
        return null;
    }
    
    public void mostrarApuestas(){
        for(Casillero c:casillerosApostados){
            c.mostrarApuestas();
                    
        }
    }
    public int cantidadApuestasEnRonda(){
        int cantidad =0;
        for(Casillero c:casillerosApostados){
            cantidad+=c.cantidadApuestasDelCasillero();
        }
        return cantidad;
    }
    
    public int montoTotalApostadoEnRonda(){
        int cantidad =0;
        for(Casillero c:casillerosApostados){
            cantidad+=c.montoTotalApuestas();
        }
        return cantidad;
    }
    
    
    
}
