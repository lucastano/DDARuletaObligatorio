/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import static modelo.Fachada.eventos.cambio;
//import static modelo.SistemaMesa.eventos.agrego;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author Lucas
 */
public class SistemaMesa extends Observable {
    
    private List<Mesa> mesas= new ArrayList<>();
    
    //public enum eventos{agrego};

    
    
    public Mesa crearMesa(List<TipoApuesta>tiposApuestasSeleccionadas,Croupier crupier){
        Mesa mesa = new Mesa(tiposApuestasSeleccionadas,crupier);
//        mesa.avisar(Mesa.eventos.cambioBalance);
//        mesa.avisar(Mesa.eventos.cambioRonda);
        mesas.add(mesa);
        //no se si avisar asi esta bien , pero funciona para 
        //actualizar el listado de mesas
        Fachada.getInstancia().avisar(cambio);
        
        return mesa;
    }
    
    public List<Mesa> getMesas() {
        return mesas;
    }
    
}
