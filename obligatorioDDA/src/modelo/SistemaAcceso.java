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
public class SistemaAcceso {
    private List<Croupier> croupiers= new ArrayList<>();
    private List<Jugador>jugadores=new ArrayList<>();

    public List<Croupier> getCroupier() {
        return croupiers;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void agregarCroupier(String cedula,String password,String nombre){
        Croupier c= new Croupier(nombre,cedula,password);
        if(!croupiers.contains(c)){
            croupiers.add(c);
        }
        
        
    }
    public void agregarJugador(String cedula,String password,String nombre,int montoInicial){
        Jugador j = new Jugador(nombre,cedula,password,montoInicial);
        if(!jugadores.contains(j)){
            jugadores.add(j);
        }
        
    }
    
    public Croupier loginCroupier(String cedula,String password){
        
        for(Croupier c:croupiers){
            if(c.getCedula().equals(cedula) && c.getPassword().equals(password)){
                return c;
            }
        }
        return null;
        
        
    }
    public Jugador loginJugador(String cedula,String password){
        // ver si hay que comparar con equals o ==
        for(Jugador j:jugadores){
            if(j.getCedula().equals(cedula) && j.getPassword().equals(password)){
                return j;
            }
        }
        return null;
        
    }

    
    
    
    
}
