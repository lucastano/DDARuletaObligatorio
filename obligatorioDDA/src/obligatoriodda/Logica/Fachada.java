/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriodda.Logica;

import java.util.List;

/**
 *
 * @author Lucas
 */
public class Fachada {
    private static Fachada instancia=new Fachada();
    private SistemaAcceso sAcceso= new SistemaAcceso();
    private SistemaMesa sMesa = new SistemaMesa();
    private SistemaTipoApuesta sTipoApuesta= new SistemaTipoApuesta();
    private SistemaEfecto sEfectos=new SistemaEfecto();

    public static Fachada getInstancia() {
        return instancia;
    }

    private Fachada() {
    }

    //hay una mejor forma de hacerlo , unificando los login , ver como se hace 
    public Croupier loginCroupiers(String cedula, String password) {
        return sAcceso.loginCroupiers(cedula, password);
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

    public void agregarTipoApuesta(int factorPago, String nombre) {
        sTipoApuesta.agregarTipoApuesta(factorPago, nombre);
    }

    public List<TipoApuesta> getTiposApuesta() {
        return sTipoApuesta.getTiposApuesta();
    }

    public List<Efecto> getEfectos() {
        return sEfectos.getEfectos();
    }

    public void agregarEfecto(String nombre) {
        sEfectos.agregarEfecto(nombre);
    }
    
    
    
    
}
