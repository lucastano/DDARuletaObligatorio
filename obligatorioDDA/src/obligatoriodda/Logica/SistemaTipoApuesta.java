/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriodda.Logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class SistemaTipoApuesta {
    List<TipoApuesta>tiposApuesta= new ArrayList<>();

    public List<TipoApuesta> getTiposApuesta() {
        return tiposApuesta;
    }
    
    public void agregarTipoApuesta(int factorPago,String nombre,boolean obligatorio){
        //capas que podemos sacar el nombre al tipoApuesta
        if(nombre.equals("ApuestaDocena")){
             tiposApuesta.add(new ApuestaDocena(factorPago,nombre,obligatorio));
        }
        if(nombre.equals("ApuestaColor")){
            tiposApuesta.add(new ApuestaColor(factorPago,nombre,obligatorio));
        }
        if(nombre.equals("ApuestaDirecta")){
            tiposApuesta.add(new ApuestaDirecta(factorPago,nombre,obligatorio));
        }
    }
    
    
    
}
