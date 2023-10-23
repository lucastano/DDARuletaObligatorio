/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obligatoriodda;

import obligatoriodda.Logica.Fachada;

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
       logica.agregarJugador("202", "bbb","Andres",500);
       logica.agregarJugador("203", "ccc","Andres",100);
       logica.agregarJugador("204", "ddd","Andres",50);
       logica.agregarJugador("205", "eee","Andres",10);
       
       //precarga tipos apuesta
       logica.agregarTipoApuesta(10, "ApuestaDocena");
       logica.agregarTipoApuesta(10, "ApuestaColor");
       logica.agregarTipoApuesta(10, "ApuestaDirecta");
       
       //precarga efectos
       logica.agregarEfecto("Modo aleatorio completo");
       logica.agregarEfecto("Modo aleatorio parcial");
       logica.agregarEfecto("Modo simulador");
       
       
    }
    
}
