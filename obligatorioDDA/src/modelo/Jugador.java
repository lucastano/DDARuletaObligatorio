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
public class Jugador extends Usuario {
    private String nombre;
    private String cedula;
    private String password;
    private int saldo;
    

    public Jugador(String nombre, String cedula, int saldoInicial, String password) {
        super(nombre, cedula, password);
        this.saldo = saldoInicial;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getPassword() {
        return super.getPassword(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCedula() {
        return super.getCedula(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNombre() {
        return super.getNombre(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public int getSaldoInicial() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void descontarSaldo(int monto){
        this.saldo=saldo-monto;
        
    }
    public void agregarSaldo(int monto){
        this.saldo+=monto;
    }
    
    
    
    
    
    

   

    
    
    
    
}
