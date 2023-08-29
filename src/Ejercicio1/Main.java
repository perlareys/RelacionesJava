/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Ejercicio1.Entidades.Perro;
import Ejercicio1.Entidades.Persona;
import Ejercicio1.Servicios.PerroPersona;
import java.util.ArrayList;
import java.util.List;
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
        PerroPersona nuevaCuenta = new PerroPersona();
        Scanner leer = new Scanner(System.in);

        List<Persona> personas = new ArrayList();
        List<Perro> perrosAdop = new ArrayList();

        System.out.println("Cargar personas en el sistema");
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresarr persona " +i);
            personas.add(nuevaCuenta.crearPersona());
        }
        System.out.println("--------------------------------");

        System.out.println("Cargar perros en el sistema");
        for (int i = 0; i < 2; i++) {
            perrosAdop.add(nuevaCuenta.crearPerro());
        }

        System.out.println("--------ADOPTAR--------");

        for (Persona aux : personas) {
            System.out.println(aux.getNombre()+" "+aux.getApellido());
            System.out.println("Seleccione un perro en adopción");
            for (Perro var : perrosAdop) {
                System.out.println(var);
            }
            String adoptar = leer.next();
            int contador = 0;

            for (int i =1; i <= perrosAdop.size(); i++) {
                if (adoptar.equalsIgnoreCase(perrosAdop.get(i).getNombre())) {
                    aux.setPerro(perrosAdop.get(i));
                    contador++;
                    perrosAdop.remove(i);
                }
            } if(contador==0){
                System.out.println("Opción inválida");
            }
        }
        System.out.println("Las personas que han adoptado son:");
        for (Persona aux : personas) {
            if(aux.getPerro()==null){
                System.out.println(aux.getNombre()+" "+aux.getApellido()+" "+"esta persona no ha adoptado");
            } else{
                System.out.println(aux.getNombre()+" "+aux.getApellido()+" "+"adoptó a: "+aux.getPerro().getNombre()+
                        " de raza "+aux.getPerro().getRaza());
            }
        }
    }
}
