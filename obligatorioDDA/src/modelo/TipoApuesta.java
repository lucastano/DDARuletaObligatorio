/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author Lucas
 */
public abstract class TipoApuesta {
    private int codigo;
    private int factorPago;
    private String nombre;
    private boolean obligatorio;

    public TipoApuesta(int codigo,int factorPago, String nombre,boolean obligatorio) {
        this.codigo=codigo;
        this.factorPago = factorPago;
        this.nombre = nombre;
        this.obligatorio=obligatorio;
    }

    public int getFactorPago() {
        return factorPago;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(boolean obligatorio) {
        this.obligatorio = obligatorio;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public abstract boolean aplicarRestriccion(Apuesta a, Mesa m);
    
    public abstract List<Numero> crearCasilleros(int codigo);
    
    

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
    
    
}
