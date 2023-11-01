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
    
    
    
    
    
}
