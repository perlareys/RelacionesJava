/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Perla
 */
public class Juego {

    private Revolver revolver;
    private List<Jugador> jugadores = new ArrayList<>();

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "revolver=" + revolver + ", jugadores=" + jugadores + '}';
    }
    
    
}
