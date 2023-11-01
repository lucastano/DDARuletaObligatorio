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
public abstract class Efecto {
    private String nombre;
    //aca deberia ir la bola sorteada , y segun el efecto seleccionado , este genere el numero que sale 

    public Efecto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public abstract int sortear(List<Ronda>rondas);
    
    
    
    
}
