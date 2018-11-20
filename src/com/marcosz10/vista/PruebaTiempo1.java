/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosz10.vista;

import com.marcosz10.modelo.Tiempo1;
import javax.swing.JOptionPane;

/**
 *
 * @author Flia. Carrera
 */
public class PruebaTiempo1 {
    public static void main(String[] args) {
        Tiempo1 tiempo = new Tiempo1();
        String salida= " la hora universal es: "+ tiempo.aStringUniversal()+"\n la hora estandar es: "
                +tiempo.aStringEstandar();
        tiempo.establecerHora(99, 99, 99);
        salida+="\n\n La hora universal despues de establecerHora es; "+tiempo.aStringUniversal()+
                "\n\n La hora estandar despues de establecerHora es; "+tiempo.aStringEstandar();
        tiempo.establecerHora(99, 99, 99);
        salida+="\n\n Despues de intentar ajustes invalidos: "+
                "\n La hora universal  es; "+tiempo.aStringUniversal()+
                "\n La hora estandar es: "+tiempo.aStringEstandar();
        JOptionPane.showMessageDialog(null, salida, "Prueba de la clase Tiempo1",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
    }
    
}
