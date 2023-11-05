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
public class ApuestaColor extends TipoApuesta {
    
    public ApuestaColor(int codigo,int factorPago, String nombre,boolean obligatorio) {
        super(codigo,factorPago, nombre,obligatorio);
    }

    @Override
    public String getNombre() {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getFactorPago() {
        return super.getFactorPago(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean aplicarRestriccion(Apuesta a, Mesa m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Numero> crearCasilleros(int codigo) {
        List<Numero>numeros = Fachada.getInstancia().getNumeros();
        List<Numero>rojos = new ArrayList<>();
        List<Numero>negros = new ArrayList<>();
        //43 rojo 44 negro
        
        for(Numero n:numeros){
            
            if(codigo==43){
                if(n.getColor().equals("Rojo")){
                    rojos.add(n);
                }
                else{
                    negros.add(n);
                }
            }
            
        }
        
        return codigo==43 ? rojos :negros;
        
        
    }
    
}
