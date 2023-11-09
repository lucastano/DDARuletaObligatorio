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
        //0 al 36 directa 
        //40 primera docena  41 segunda docena y 42 tercera docena // por docena 
        //43 rojo y 44 negro //color 
        this.tipoApuesta=insertarTipoApuesta(ucc);
        agregarNumeros();
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
    //esto se usa para mostrar por consola , solo para probar 
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
    //segun el tipo de apuesta agrega los numeros correspondientes a la lista de numeros
    public void agregarNumeros(){
        this.numeros=tipoApuesta.crearCasilleros(ucc);
    }
    
    //esto se usa solo para mostrar los numeros de cada casillero 
    //borrar antes de entregar(
    public void mostrarNumerosDelCasillero(){
        for(Numero n:numeros){
            System.out.println(n.getNumero());
        }
    }

    private TipoApuesta insertarTipoApuesta(int ucc) {
        //0 al 36 directa 
        //40 primera docena  41 segunda docena y 42 tercera docena // por docena 
        //43 rojo y 44 negro //color 
        //apuesta directa  codigo 3 , color 2 , docena 1 
        if(ucc>=0 && ucc<=36){
            //apuesta directa 
            for(TipoApuesta tp:Fachada.getInstancia().getTiposApuesta()){
                if(tp.getCodigo()==3){
                    return tp;
                }
            }
        }
        if(ucc >= 40 && ucc <= 42){
            for(TipoApuesta tp:Fachada.getInstancia().getTiposApuesta()){
                if(tp.getCodigo()==1){
                    return tp;
                }
            }
        }
        if(ucc == 43 || ucc == 44){
            for(TipoApuesta tp:Fachada.getInstancia().getTiposApuesta()){
                if(tp.getCodigo()==2){
                    return tp;
                }
            }
        }
        
        return null;
    }
    
    public int pagarApuestas(){
        int total = 0;
        
        for(Apuesta a:apuestas){
            
            int ganancia = 0;
            
            if(this.tipoApuesta.getNombre() == "ApuestaDirecta"){
                ganancia = a.getMonto()*36;
            } else if (this.tipoApuesta.getNombre() == "ApuestaDocena"){
                ganancia = a.getMonto()*3;
            } else {
                ganancia = a.getMonto()*2;
            }
            
            total += ganancia;
            a.getJugador().setSaldo(ganancia);
        }
        return total;
    }
    
}
