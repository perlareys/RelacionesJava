/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Servicios;

import Ejercicio1.Entidades.Perro;
import Ejercicio1.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class PerroPersona {

    private Scanner leer;
    private Perro perro;
    private Persona persona;

    public PerroPersona() {
        leer = new Scanner(System.in);
        perro = new Perro();
        persona = new Persona();
    }

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona");
        persona.setApellido(leer.next());
        System.out.println("Ingresar edad");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingresar DNI");
        persona.setDni(leer.nextInt());

        return persona;
    }

    public Perro crearPerro() {
        System.out.println("Ingrese el nombre del perro");
        perro.setNombre(leer.next());
        System.out.println("Ingresar raza del perro");
        perro.setRaza(leer.next());
        System.out.println("Ingresar edad del perro");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingresar tamaño del perro");
        perro.setTamanio(leer.next());

        return perro;
    }
}
