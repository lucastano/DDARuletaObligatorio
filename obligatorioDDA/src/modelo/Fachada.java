/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import static modelo.Fachada.eventos.cambio;
import observador.Observable;

/**
 *
 * @author Lucas
 */
public class Fachada extends Observable {
    private static Fachada instancia=new Fachada();
    private SistemaAcceso sAcceso= new SistemaAcceso();
    private SistemaMesa sMesa = new SistemaMesa();
    private SistemaTipoApuesta sTipoApuesta= new SistemaTipoApuesta();
    private SistemaEfecto sEfectos=new SistemaEfecto();
    public enum eventos{cambio};

    public static Fachada getInstancia() {
        return instancia;
    }

    private Fachada() {
    }

    public List<Casillero> getCasilleros() {
        return sTipoApuesta.getCasilleros();
    }

    public void agregarCasillero(int ucc, int tipoApuesta) {
        sTipoApuesta.agregarCasillero(ucc, tipoApuesta);
    }

    //hay una mejor forma de hacerlo , unificando los login , ver como se hace 
    public Croupier loginCroupier(String cedula, String password) {
        return sAcceso.loginCroupier(cedula, password);
    }

    public Jugador loginJugador(String cedula, String password) {
        return sAcceso.loginJugador(cedula, password);
    }

    public void agregarCroupier(String cedula, String password, String nombre) {
        sAcceso.agregarCroupier(cedula, password, nombre);
    }

    public void agregarJugador(String cedula, String password, String nombre,int monto) {
        sAcceso.agregarJugador(cedula, password, nombre,monto);
    }

    public void agregarTipoApuesta(int codigo,int factorPago, String nombre,boolean obligatorio) {
        sTipoApuesta.agregarTipoApuesta(codigo,factorPago, nombre,obligatorio);
    }

    public List<TipoApuesta> getTiposApuesta() {
        return sTipoApuesta.getTiposApuesta();
    }

    public List<Efecto> getEfectos() {
        return sEfectos.getEfectos();
    }

    public void agregarEfectoAleatorioCompleto(String nombre) {
        sEfectos.agregarEfectoAleatorio(nombre);
    }

    public void agregarEfectoParcial(String nombre) {
        sEfectos.agregarEfectoParcial(nombre);
    }

    public void agregarEfectoSimulador(String nombre) {
        sEfectos.agregarEfectoSimulador(nombre);
    }
    
    

    public Mesa crearMesa(List<TipoApuesta> tiposApuestasSeleccionadas, Croupier crupier, List<Efecto>efectosDisponibles) {
        avisar(cambio);
        return sMesa.crearMesa(tiposApuestasSeleccionadas, crupier, efectosDisponibles);
    }

    public List<Mesa> getMesas() {
        return sMesa.getMesas();
    }

    public List<Numero> getNumeros() {
        return sTipoApuesta.getNumeros();
    }

    public void agregarNumero(int numero, String color) {
        sTipoApuesta.agregarNumero(numero, color);
    }
    
    
    
    
    
    
    
    
    
}
