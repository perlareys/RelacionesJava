/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.Entidades;

/**
 *
 * @author Perla
 */
public class Jugador {

    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id) {
        this.id = id;
        String ids = id.toString();
        ids = "Jugador ".concat(ids);
        this.nombre = ids;
        this.mojado = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
}
