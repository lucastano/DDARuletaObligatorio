/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.List;
import modelo.Croupier;
import modelo.Efecto;
import modelo.TipoApuesta;

/**
 *
 * @author Lucas
 */
public interface VistaOperarMesa {
    
    public void mostrarEfectos(List<Efecto>efectos);
    public void mostrarBalance(int balance);
    public void mostrarNumeroRuleta(int numero);
    public void mostrarNumeroRonda(int numero);
}
