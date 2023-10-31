/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import inicio.DatosPrueba;
import vistaEscritorio.Inicio;

/**
 *
 * @author digregor
 */
public class AppEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatosPrueba.Cargar();
        new Inicio().setVisible(true);
//       new VentanaMesa().setVisible(true);
    }
    
}
