/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra2.Servicio;

import Extra2.Entidades.Asiento;
import Extra2.Entidades.Cine;
import Extra2.Entidades.Espectador;
import Extra2.Entidades.Pelicula;
import Extra2.Enum.Columna;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class CineServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cine abrirCine() {
        Cine nuevoCine = new Cine();
        //creo película
        nuevoCine.setPelicula(new Pelicula("Mulan", 115, 13, "Niki Caro"));
        nuevoCine.setPrecio(20);

        Asiento sala[][] = new Asiento[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Integer a = 8 - i;
                String b = a.toString();

                switch (j) {
                    case 0:
                        b = b.concat("A");
                        break;
                    case 1:
                        b = b.concat("B");
                        break;
                    case 2:
                        b = b.concat("C");
                        break;
                    case 3:
                        b = b.concat("D");
                        break;
                    case 4:
                        b = b.concat("D");
                        break;
                    case 5:
                        b = b.concat("E");
                        break;
                    case 6:
                        b = b.concat("F");
                        break;
                    default:
                        System.out.println("Error");
                }
                sala[i][j] = new Asiento(b, null);
            }
        }
        nuevoCine.setSala(sala);
        ArrayList<String> lista = new ArrayList();

        for (int i = 0; i < 8; i++) {
            for (Columna aux : Columna.values()) {
                String asiento = (8 - i) + aux.toString();
                lista.add(asiento);
            }
        }

        nuevoCine.setAsientosLibres(lista);

        return nuevoCine;
    }

    //cambiar película y precio
    public Cine modificarCine(Cine nuevoCine) {
        System.out.println("--------MENÚ CINE--------");
        System.out.println("En curso: ");
        nuevoCine.setPelicula(new Pelicula("Agente Stone", 115, 16, "Tom Harper"));
        nuevoCine.setPrecio(25);
        return nuevoCine;
    }

    //espectadores  que intentan ingresar al cine
    public ArrayList<Espectador> posiblesEspectadores() {
        ArrayList<Espectador> clientes = new ArrayList();
        int cantidad = 25 + (int) (Math.random() * 60);
        for (int i = 0; i < cantidad; i++) {
            Espectador e = new Espectador("Cliente " + (i + 1), (int) (Math.random() * 70), (int) (Math.random() * 100));
            clientes.add(e);
        }
        System.out.println("Posibles espectadores: " + clientes.size());
        return clientes;
    }

    public Cine recibirEspectadores(Cine nuevoCine, ArrayList<Espectador> clientes) {
        int rechazados = 0;
        int aceptados = 0;

        for (Espectador aux : clientes) {
            if (aux.getEdad() >= nuevoCine.getPelicula().getEdadMinima() && aux.getDinero() >= nuevoCine.getPrecio() && nuevoCine.getAsientosLibres().size() > 0) {
                //cobro(resto dinero al cliente)
                aux.setDinero(aux.getDinero() - nuevoCine.getPrecio());
                //se ubica al cliente
                int posicionLista = (int) (Math.random() * nuevoCine.getAsientosLibres().size());
                String ubicacion = nuevoCine.getAsientosLibres().get(posicionLista);
                nuevoCine.getAsientosLibres().remove(posicionLista);

                Asiento visual[][] = nuevoCine.getSala();
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (visual[i][j].getUbicacion().equalsIgnoreCase(ubicacion)) {
                            visual[i][j].setEspectador(aux);
                        }
                    }
                }
                aceptados++;
            } else {
                rechazados++;
            }
        }
        System.out.println("Clientes aceptados: " + aceptados);
        System.out.println("Clientes rechazados " + rechazados);
        return nuevoCine;
    }

    public void verSala(Cine nuevoCine) {
        System.out.println("");
        System.out.println("Información de la sala");
        System.out.println(nuevoCine.getPelicula());
        System.out.println("Estado de la sala durante la función: ");
        Asiento visual[][] = nuevoCine.getSala();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(visual[i][j].toString());
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void revisarEspectadores(Cine nuevoCine) {
        Asiento visual[][] = nuevoCine.getSala();
        int control = 0;
        System.out.println("Seleccione un asiento para ver su estado");
        String buscar = leer.next();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (visual[i][j].getUbicacion().equalsIgnoreCase(buscar)) {
                    control++;
                    System.out.println("Información del espectador en asiento " + visual[i][j].getUbicacion());
                    System.out.println(visual[i][j].getEspectador().toString());
                    break;
                }
            }
        }
        if (control == 0) {
            System.out.println("Asiento inválido. Ingrese una posición válida");
            revisarEspectadores(nuevoCine);
        }
        System.out.println("¿Desea consultar otro asiento?");
        System.out.println("1.Sí");
        System.out.println("2.No");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            revisarEspectadores(nuevoCine);
        }
    }
}
