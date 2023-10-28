/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import modelo.Croupier;
import modelo.Fachada;


/**
 *
 * @author Constanza
 */
public class LoginService {
    public Croupier loginCroupier(String cedula, String password) {
    return Fachada.getInstancia().loginCroupier(cedula, password);
    }
}
