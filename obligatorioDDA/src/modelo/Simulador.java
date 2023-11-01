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
public class Simulador extends Efecto {
    
    public Simulador(String nombre) {
        super(nombre);
    }

    

    @Override
    public int sortear(List<Ronda> rondas) {
        //Modo simulador: la bola sortea únicamente entre los números que tienen Apuesta Directa, más el cero.
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
