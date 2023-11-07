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
    private List<Apuesta>apuestas= new ArrayList<>();

    public Casillero(int ucc) {
        this.ucc = ucc;
        
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

    public void setTipoApuesta(TipoApuesta tipoApuesta) {
        this.tipoApuesta = tipoApuesta;
    }

    public void setNumeros(List<Numero> numeros) {
        this.numeros = numeros;
    }
    
    
    public void agregarApuesta(Apuesta apuesta){
        apuestas.add(apuesta);
    }
    
    public void mostrarApuestas(){
        for(Apuesta a:apuestas){
            System.out.println(a.getMonto()+" "+ a.getJugador().getNombre()+" "+this.ucc);
        }
    }
    
    public int cantidadApuestasDelCasillero(){
        return apuestas.size();
    }
    
    public int montoTotalApuestas(){
        int cantidad =0;
        for(Apuesta a:apuestas){
            cantidad+=a.getMonto();
        }
        return cantidad;
    }
            
    
}
