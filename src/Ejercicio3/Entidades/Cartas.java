/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.Entidades;

/**
 *
 * @author Perla
 */
public class Cartas {

    private Integer numero;
    private Palo palo;

    public Cartas() {
    }

    public Cartas(Integer numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Cartas{" + "numero=" + numero + ", palo=" + palo + '}';
    }
}
