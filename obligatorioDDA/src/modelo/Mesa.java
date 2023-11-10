/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static modelo.Mesa.eventos.cambioBalance;
import static modelo.Mesa.eventos.cambioRonda;
import static modelo.Mesa.eventos.salioJugador;
import static modelo.Mesa.eventos.seAgregoJugador;
import observador.Observable;

public class Mesa extends Observable {
    private Croupier operador;
    private List<Efecto>efectosDisponibles;
    private Ronda rondaActual;
    private List<Ronda>rondas= new ArrayList<>();
    private int balanceMesa;
    private int numeroRuleta;
    private static int ultimoNumeroRuleta=1;
    private List<TipoApuesta>tiposApuestaHabilitados;
    private List<Jugador>jugadores=new ArrayList<>();
    private Map<Jugador, Apuesta> historialUltimaApuestaPerdida = new HashMap<>();
    
    public enum eventos{cambioBalance,cambioRonda,seAgregoJugador,salioJugador};

    public Mesa(List<TipoApuesta>tiposApuesta,Croupier croupier, List<Efecto>efectosDisponibles) {
        
        this.operador=croupier;
        this.balanceMesa=0;
        this.numeroRuleta=this.ultimoNumeroRuleta;
        this.ultimoNumeroRuleta++;
        this.tiposApuestaHabilitados=tiposApuesta;
        this.efectosDisponibles = Fachada.getInstancia().getEfectos();
        this.rondaActual=new Ronda();
        rondas.add(rondaActual);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
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

    public Ronda getRondaActual() {
        return rondaActual;
    }
    
    public void unirJugador(Jugador jugador){
        if(!jugadores.contains(jugador)){
            jugadores.add(jugador);
            avisar(seAgregoJugador);
        }
        
    }
    public void quitarJugador(Jugador jugador){
        if(jugadores.contains(jugador)){
            jugadores.remove(jugador);
            avisar(salioJugador);
        }
    }
    
    public void sortearRonda(){
        this.rondaActual.sortear(rondas);
        
    }
    
    public int getBalanceActualizado(){
        this.balanceMesa = rondaActual.actualizarBalance(this.balanceMesa);
        avisar(cambioBalance);
        return getBalanceMesa();
    }
    
    public void nuevaRonda(){
        Ronda ronda = new Ronda();
        this.rondaActual=ronda;
        rondas.add(ronda);
        avisar(cambioRonda);   
        
    }
    
    public void aumentarBalanceMesa(int monto){
        this.balanceMesa+=monto;
    }
    
    public void disminuirBalanceMesa(int monto){
        this.balanceMesa-=monto;
    }
    
    public Ronda obtenerRondaAnterior() {
        if (rondas.size() > 1) {

            return rondas.get(rondas.size() - 2);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Mesa #"+numeroRuleta+ "Rondas disputadas: "+rondas.size()+" Crupier: "+operador.getNombre();
    }
    
}
