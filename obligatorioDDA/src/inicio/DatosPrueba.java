/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio;

import modelo.Fachada;

/**
 *
 * @author Lucas
 */
public class DatosPrueba {
    public static void Cargar(){
       Fachada logica =Fachada.getInstancia();
       //precarga croupiers
       logica.agregarCroupier("101", "aaa", "Esteban");
       logica.agregarCroupier("102", "bbb", "Claudia");
       logica.agregarCroupier("103", "ccc", "Ricardo");
       
       //precarga jugadores
       logica.agregarJugador("201", "aaa","Andres",1000);
       logica.agregarJugador("202", "bbb","Nicolas",500);
       logica.agregarJugador("203", "ccc","Claudia",100);
       logica.agregarJugador("204", "ddd","Carolina",50);
       logica.agregarJugador("205", "eee","Simon",10);
       
       //precarga tipos apuesta
       logica.agregarTipoApuesta(10, "ApuestaDocena",false);
       logica.agregarTipoApuesta(10, "ApuestaColor",false);
       logica.agregarTipoApuesta(10, "ApuestaDirecta",true);
       
       //precarga efectos
       logica.agregarEfectoAleatorioCompleto("Modo aleatorio completo");
       logica.agregarEfectoParcial("Modo aleatorio parcial");
       logica.agregarEfectoSimulador("Modo simulador");
       
       
    }
    
}
