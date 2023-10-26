/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriodda.Logica;

/**
 *
 * @author Lucas
 */
public class TipoApuesta {
    private int factorPago;
    private String nombre;
    private boolean obligatorio;

    public TipoApuesta(int factorPago, String nombre,boolean obligatorio) {
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
    

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
    
    
}
