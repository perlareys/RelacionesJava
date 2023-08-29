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
public class Cuotas {

    private Integer numeroDeCuota;
    private Integer montoTotal;
    private boolean pagada;
    private Date fechaVencimiento;
    //Efectivo, transferencia, etc.
    private String formaPago;
    private Poliza poliza;

    public Cuotas() {
    }

    public Cuotas(Integer numeroDeCuota, Integer montoTotal, boolean pagada, Date fechaVencimiento, String formaPago, Poliza poliza) {
        this.numeroDeCuota = numeroDeCuota;
        this.montoTotal = montoTotal;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
        this.poliza = poliza;
    }

    public Integer getNumeroDeCuota() {
        return numeroDeCuota;
    }

    public void setNumeroDeCuota(Integer numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Cuotas{"
                + "numeroDeCuota=" + numeroDeCuota
                + ", montoTotal=" + montoTotal
                + ", pagada=" + pagada
                + ", fechaVencimiento=" + fechaVencimiento
                + ", formaPago=" + formaPago
                + ", poliza=" + poliza
                + '}';
    }

}
