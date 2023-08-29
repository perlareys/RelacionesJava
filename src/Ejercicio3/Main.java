/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Ejercicio3.Servicios.BarajaServicio;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarajaServicio nuevaBaraja = new BarajaServicio();
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("-----------BIENVENIDO-----------");

        do {
            System.out.println("1. Repartir cartas");
            System.out.println("2. Ver cartas repartidas");
            System.out.println("3. Ver baraja");
            System.out.println("4. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    nuevaBaraja.iniciarMesa();
                    nuevaBaraja.darCartas();
                    break;
                case 2:
                    nuevaBaraja.cartasMonton();
                    break;
                case 3:
                    nuevaBaraja.mostrarBaraja();
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 4);
    }

}
