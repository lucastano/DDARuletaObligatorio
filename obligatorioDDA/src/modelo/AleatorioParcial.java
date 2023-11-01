/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Lucas
 */
public class AleatorioParcial extends Efecto{
    
    public AleatorioParcial(String nombre) {
        super(nombre);
    }

    @Override
    public int sortear(List<Ronda>rondas) {
        int ganador;
        Random random = new Random();
        List<Integer>numerosSorteados=new ArrayList<>();
        List<Integer>ultimosTresElementos=new ArrayList<>();
        if(rondas.size()>=1){
            for(Ronda r:rondas){
            numerosSorteados.add(r.getNumeroGanador());
           }
            int tamano = numerosSorteados.size();
            int cantidadElementos = 3;

        for (int i = tamano - 1; i >= Math.max(tamano - cantidadElementos, 0); i--) {
            ultimosTresElementos.add(numerosSorteados.get(i));
        }
            
            do{
            ganador= random.nextInt(0, 37);
            
           }while(ultimosTresElementos.contains(ganador));
            
            
        }
        else
        {
             ganador= random.nextInt(0, 37);
            
            
        }

        return ganador;
 
    }
    
}
