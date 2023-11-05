/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author Lucas
 */
public class Ronda {
    private int numeroRonda;
    private static int ultimoNumero=1;
    private Efecto efectoSeleccionado;
    private int numeroGanador;
    private List<Casillero>casillerosApostados;

    public Ronda(Efecto efectoSeleccionado) {
        this.efectoSeleccionado = efectoSeleccionado;
        this.numeroRonda=ultimoNumero;
        this.ultimoNumero++;
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
        }else{
            Casillero obtenido=obtenerCasillero(casillero);
            obtenido.agregarApuesta(apuesta);
            
        }
    }
    
    
    
    public boolean existe (Casillero casillero){
        return this.casillerosApostados.contains(casillero);
    }

    private Casillero obtenerCasillero(Casillero casillero) {
        for(Casillero c:casillerosApostados){
            if(c.equals(casillero)){
                return c;
            }
        }
        
        return null;
    }
    
    
    
}
