/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Lucas
 */
public class AleatorioCompleto extends Efecto {
    
    public AleatorioCompleto(String nombre) {
        super(nombre);
    }
    
    
    

    @Override
    public int sortear(List<Ronda>rondas) {
        //numero aleatorio del 0 al 37 
        Random random = new Random();
        int valorAleatorio= random.nextInt(0, 37);
        return valorAleatorio;
    }

    
}
