/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.Servicios;

import Ejercicio2.Entidades.Juego;
import Ejercicio2.Entidades.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class JuegoServicio {

    private Juego juego = new Juego();
    private RevolverServicio revolver = new RevolverServicio();
    private Jugador j= new Jugador();
    private Scanner leer = new Scanner(System.in);
    private List<Jugador> lstJugadores = new ArrayList<>();

    public void llenarJuego() {
        JugadorServicio jugador = new JugadorServicio();
        int cantidadJugadores;
        System.out.println("Ingrese la cantidad de jugadores. (Máximo 6)");
        cantidadJugadores = leer.nextInt();

        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("Ingrese el nombre del jugador " + (i + 1));
            String nombre = leer.nextLine();
            j.setNombre(nombre);
            //lstJugadores.add(nombre);
        }
    }

}
