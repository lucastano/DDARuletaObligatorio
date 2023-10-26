/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lucas
 */
public class Jugador {
    private String nombre;
    private String cedula;
    private String password;
    private int saldoInicial;

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getPassword() {
        return password;
    }

    public Jugador(String nombre, String cedula, String password,int saldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.password = password;
        this.saldoInicial=saldo;
    }
    
    
    
}
