/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class SistemaEfecto {
    
    private List<Efecto>efectos=new ArrayList<>();

    public List<Efecto> getEfectos() {
        return efectos;
    }
    
    public void agregarEfecto(String nombre){
        //controlar que el efecto no este repetido
        efectos.add(new Efecto(nombre));
    }
    
    
}
