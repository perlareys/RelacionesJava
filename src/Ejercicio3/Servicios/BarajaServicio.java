/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.Servicios;

import Ejercicio3.Entidades.Cartas;
import Ejercicio3.Entidades.Palo;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class BarajaServicio {

    List<Cartas> baraja;
    List<Cartas> monton;
    private int numeroCarta;
    private Scanner leer;

    public BarajaServicio() {
        leer = new Scanner(System.in);
        baraja = new LinkedList<>();
        monton = new LinkedList<>();
    }

    public void iniciarMesa(){
        for (int numero = 1; numero <= 12; numero++) {
            for (Palo palo : Palo.values()) {
                if (numero != 8 && numero != 9) {
                    baraja.add(new Cartas(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        System.out.println("Barajando cartas");
        Collections.shuffle(baraja);
    }

    public Cartas siguienteCarta() {
        if (baraja.isEmpty()) {
            System.out.println("No hay más cartas que repartir");
            return null;
        }
        Cartas siguienteCarta = baraja.remove(0);
        monton.add(siguienteCarta);
        //numeroCarta++;
        return siguienteCarta;
    }

    public int cartasDisponibles() {
        return baraja.size();
    }

    public void darCartas() {
        System.out.println("¿Cuántas cartas desea?");
        int quiere = leer.nextInt();
        if (quiere < baraja.size()) {
            System.out.println("Se le han entregado" + quiere + " cartas");
            for (int i = 0; i < quiere; i++) {
                Cartas siguienteCarta = siguienteCarta();
                System.out.println(siguienteCarta);
            }
        } else {
            System.out.println("Cartas insuficientes");
        }
    }

    public void cartasMonton() {
        if (monton.size() > 1) {
            for (Cartas sacadas : monton) {
                System.out.println("Las cartas sacadas son: ");
                System.out.println(sacadas);
            }
        } else {
            System.out.println("Aún no se han sacado cartas");
        }
    }

    public void mostrarBaraja() {
        for (Cartas aux : baraja) {
            System.out.println(aux);
        }
    }
}
