/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.Servicios;

import Ejercicio2.Entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class JugadorServicio {

    private Scanner leer;
    private Jugador jugador;

    public JugadorServicio() {
        leer = new Scanner(System.in);
        jugador = new Jugador();
    }

    public boolean disparo(RevolverServicio revolver) {
        boolean vof = false;
        if (revolver.mojar()) {
            jugador.setMojado(true);
            vof = true;
        }
        revolver.siguienteChorro();
        return vof;
    }
}
