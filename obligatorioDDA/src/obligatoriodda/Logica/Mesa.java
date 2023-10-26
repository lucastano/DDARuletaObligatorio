/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriodda.Logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class Mesa {
    private Croupier operador;
    private List<Efecto>efectosDisponibles;
    private List<Ronda>rondas= new ArrayList<>();
    private int balanceMesa;
    private int numeroRuleta;
    private static int ultimoNumeroRuleta=1;
    private List<TipoApuesta>tiposApuestaHabilitados;

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
    
    


    
    
    
    
    
}
