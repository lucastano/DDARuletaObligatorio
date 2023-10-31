/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import observador.Observable;

/**
 *
 * @author Lucas
 */
public class Mesa extends Observable {
    private Croupier operador;
    private List<Efecto>efectosDisponibles;
    private List<Ronda>rondas= new ArrayList<>();
    private int balanceMesa;
    private int numeroRuleta;
    private static int ultimoNumeroRuleta=1;
    private List<TipoApuesta>tiposApuestaHabilitados;
    
    public enum eventos{cambioBalance,cambioRonda};

    public Mesa(List<TipoApuesta>tiposApuesta,Croupier croupier) {
        this.operador=croupier;
        this.balanceMesa=0;
        this.numeroRuleta=this.ultimoNumeroRuleta;
        this.ultimoNumeroRuleta++;
        this.tiposApuestaHabilitados=tiposApuesta;
        
 
    }

    public Croupier getOperador() {
        return operador;
    }

    public List<Efecto> getEfectosDisponibles() {
        return efectosDisponibles;
    }

    public List<Ronda> getRondas() {
        return rondas;
    }

    public int getBalanceMesa() {
        return balanceMesa;
    }

    public int getNumeroRuleta() {
        return numeroRuleta;
    }

    public List<TipoApuesta> getTiposApuestaHabilitados() {
        return tiposApuestaHabilitados;
    }

    @Override
    public String toString() {
        return "Mesa #"+numeroRuleta+ "Rondas disputadas: "+rondas.size()+" Crupier: "+operador.getNombre();
    }
    
    


    
    
    
    
    
}
