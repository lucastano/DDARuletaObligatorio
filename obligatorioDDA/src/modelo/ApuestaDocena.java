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
public class ApuestaDocena extends TipoApuesta {
    
    public ApuestaDocena(int codigo,int factorPago, String nombre,boolean obligatorio) {
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
       List<Numero>retorno= new ArrayList<>();
        List<Numero>numeros = Fachada.getInstancia().getNumeros();
        //primera docena codigo 40
        if(codigo==40){
          retorno = numeros.subList(1, 12);
        }
        else if(codigo==41){
            retorno = numeros.subList(13, 24);
        }
        else if(codigo ==42)
        {
             retorno = numeros.subList(25, 36);
            
        }
        
        
        return retorno;
    }
    
}
