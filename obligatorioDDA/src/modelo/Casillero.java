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
public class Casillero {
    private int ucc;
    private TipoApuesta tipoApuesta;
    private List<Numero>numeros= new ArrayList<>();

    public Casillero(int ucc,TipoApuesta tipoApuesta) {
        this.ucc = ucc;
        this.tipoApuesta = tipoApuesta;
        
    }

    public int getUcc() {
        return ucc;
    }

    public TipoApuesta getTipoApuesta() {
        return tipoApuesta;
    }

    public List<Numero> getNumeros() {
        return numeros;
    }
    
    
    
    
            
    
}
