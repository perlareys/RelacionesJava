/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra2;

import Extra2.Entidades.Cine;
import Extra2.Entidades.Espectador;
import Extra2.Servicio.CineServicio;
import java.util.ArrayList;

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineServicio cs = new CineServicio();
        Cine c = cs.abrirCine();
        ArrayList<Espectador> e = cs.posiblesEspectadores();
        cs.recibirEspectadores(c, e);
        cs.verSala(c);
        cs.revisarEspectadores(c);
    }

}
