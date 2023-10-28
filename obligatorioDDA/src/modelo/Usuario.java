/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lucas
 */
public abstract class Usuario {
    private String nombre;
    private String cedula;
    private String password;

    public Usuario(String nombre, String cedula, String password) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.password = password;
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

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", cedula=" + cedula + ", password=" + password + '}';
    }
    
    
    
}
