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
public class SistemaMesa {
    
    private List<Mesa> mesas= new ArrayList<>();

    public List<Mesa> getMesas() {
        return mesas;
    }
    
    public Mesa crearMesa(List<TipoApuesta>tiposApuestasSeleccionadas,Croupier crupier){
        Mesa mesa = new Mesa(tiposApuestasSeleccionadas,crupier);
        mesas.add(mesa);
        
        return mesa;
    }
    
    
    
}
