/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lucas
 */
public class Croupier {
    private String nombre;
    private String cedula;
    private String password;
    private Mesa mesa;

    public Croupier(String nombre, String cedula, String password) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.password = password;
        this.mesa=null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getPassword() {
        return password;
    }
    
    public void agregarMesa(Mesa mesa){
        this.mesa=mesa;
    }
    
    
    
}
