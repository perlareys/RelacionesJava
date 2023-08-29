/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.Servicios;

import Ejercicio2.Entidades.Revolver;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class RevolverServicio {

    private Scanner leer;
    private Revolver revolver;

    public RevolverServicio() {
        leer = new Scanner(System.in);
        revolver = new Revolver();
    }

    public void llenarRevolver() {
        revolver.setPosicionActual((int) (Math.random() * 6 + 1));
        revolver.setPosicionAgua((int) (Math.random() * 6 + 1));
    }

    public boolean mojar() {
        if (revolver.getPosicionAgua() == revolver.getPosicionActual()) {
            return true;
        } else {
            return false;
        }
    }

    public void siguienteChorro() {
        if (revolver.getPosicionActual() == 6) {
            revolver.setPosicionActual(1);
        } else {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        }
    }
}
