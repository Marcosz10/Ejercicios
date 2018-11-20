/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosz10.vista;

import com.marcosz10.modelo.HoraSimple;
import javax.swing.JOptionPane;

/**
 *
 * @author Flia. Carrera
 */
public class PruebaThis {
    public static void main(String[] args) {
        HoraSimple hora= new HoraSimple(12, 30, 19);
        JOptionPane.showMessageDialog(null, hora.crearCadena(),"Demostracion",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}
