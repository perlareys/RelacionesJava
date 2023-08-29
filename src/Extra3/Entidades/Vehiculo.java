/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra3.Entidades;

/**
 *
 * @author Perla
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private Integer anio;
    private Integer numeroMotor;
    private String chasis;
    private String color;
    //Camioneta, Sedan, etc
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio, Integer numeroMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(Integer numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{"
                + "marca=" + marca
                + ", modelo=" + modelo
                + ", anio=" + anio
                + ", numeroMotor=" + numeroMotor
                + ", chasis=" + chasis
                + ", color=" + color
                + ", tipo=" + tipo
                + '}';
    }
}


