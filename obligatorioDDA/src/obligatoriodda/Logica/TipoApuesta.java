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

    public TipoApuesta(int factorPago, String nombre) {
        this.factorPago = factorPago;
        this.nombre = nombre;
    }

    public int getFactorPago() {
        return factorPago;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
    
    
}
