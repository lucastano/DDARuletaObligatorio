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
       logica.agregarTipoApuesta(1,10, "ApuestaDocena",false);
       logica.agregarTipoApuesta(2,10, "ApuestaColor",false);
       logica.agregarTipoApuesta(3,10, "ApuestaDirecta",true);
       
       //precarga efectos
       logica.agregarEfectoAleatorioCompleto("Modo aleatorio completo");
       logica.agregarEfectoParcial("Modo aleatorio parcial");
       logica.agregarEfectoSimulador("Modo simulador");
       
       //agrego casilleros de apuesta directa, su numero corresponde a su codigo
       // del 0 al 36
       for(int i =0; i<=36;i++){
           logica.agregarCasillero(i, 3);
       }
       
       //casilleros apuesta color
       logica.agregarCasillero(43, 2); //rojo 
       logica.agregarCasillero(44, 2);//negro
       
       //casilleros apuesta docena 
       logica.agregarCasillero(40, 1);//primera docena
       logica.agregarCasillero(41, 1);//segunda docena
       logica.agregarCasillero(42, 1);//tercera docena
       
       //numeros con sus respectivos colores
       logica.agregarNumero(0, "verde");
       for(int i =1;i<=36;i++){
           if(i%2==0){
               logica.agregarNumero(i, "Negro");
           }else{
               logica.agregarNumero(i, "Rojo");
           }
       }
    }
    
}
