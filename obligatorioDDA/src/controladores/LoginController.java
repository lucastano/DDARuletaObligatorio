/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import vistaEscritorio.LoginCrupier;

/**
 *
 * @author Constanza
 */
public class LoginController {
    private LoginCrupier vista;

    public LoginController() {
        this.vista = new LoginCrupier(new javax.swing.JFrame(), true);
        vista.setVisible(true);
    }
}
