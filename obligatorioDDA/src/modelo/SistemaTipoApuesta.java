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
public class SistemaTipoApuesta {
    List<TipoApuesta>tiposApuesta= new ArrayList<>();
    //List<Casillero>casilleros=new ArrayList<>();
    List<Numero>numeros=new ArrayList<>();

    public List<TipoApuesta> getTiposApuesta() {
        return tiposApuesta;
    }

//    public List<Casillero> getCasilleros() {
//        return casilleros;
//    }

    public List<Numero> getNumeros() {
        return numeros;
    }
    
    public void agregarNumero(int numero , String color){
        numeros.add(new Numero(numero,color));
        
    }
//    
//    public void agregarCasillero(int ucc,int tipoApuesta){
//        casilleros.add(new Casillero(ucc,obtenerTipoApuestaPorCodigo(tipoApuesta)));
//    }
    
    public void agregarTipoApuesta(int codigo,int factorPago,String nombre,boolean obligatorio){
        //capas que podemos sacar el nombre al tipoApuesta
        if(nombre.equals("ApuestaDocena")){
             tiposApuesta.add(new ApuestaDocena(codigo,factorPago,nombre,obligatorio));
        }
        if(nombre.equals("ApuestaColor")){
            tiposApuesta.add(new ApuestaColor(codigo,factorPago,nombre,obligatorio));
        }
        if(nombre.equals("ApuestaDirecta")){
            tiposApuesta.add(new ApuestaDirecta(codigo,factorPago,nombre,obligatorio));
        }
    }
    //obtiene la apuesta segun el codigo , esta funcion solo la uso en agregarCasillero en este mismo subsistema
    public TipoApuesta obtenerTipoApuestaPorCodigo(int codigo){
       
        for(TipoApuesta tp:tiposApuesta){
            if(tp.getCodigo()==codigo){
                return tp;
            }
        }
        
        return null;
    }
    
    
    
}
