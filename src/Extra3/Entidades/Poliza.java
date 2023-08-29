/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra3.Entidades;

import java.util.Date;

/**
 *
 * @author Perla
 */
public class Poliza {

    private Vehiculo vehiculo;
    private Cliente cliente;
    private Integer numeroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer cuotas;
    private String formaPago;
    private Integer montoTotalAsegurado;
    private boolean granizo;
    private Integer montoMaximoGranizo;
    //Total,contra terceros, etc
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, Integer numeroPoliza, Date fechaInicio, Date fechaFin, Integer cuotas, String formaPago, Integer montoTotalAsegurado, boolean granizo, Integer montoMaximoGranizo, String tipoCobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Integer montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public Integer getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(Integer montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{"
                + "vehiculo=" + vehiculo
                + ", cliente=" + cliente
                + ", numeroPoliza=" + numeroPoliza
                + ", fechaInicio=" + fechaInicio
                + ", fechaFin=" + fechaFin
                + ", cuotas=" + cuotas
                + ", formaPago=" + formaPago
                + ", montoTotalAsegurado=" + montoTotalAsegurado
                + ", granizo=" + granizo
                + ", montoMaximoGranizo=" + montoMaximoGranizo
                + ", tipoCobertura=" + tipoCobertura
                + '}';
    }

}
