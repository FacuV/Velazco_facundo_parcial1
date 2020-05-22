package isi.died2020.parcial01.ejercicio01;

import java.time.Month;

public class OrdenPago {
    private long nroOrden;
    private Month mes;
    private double pagoTotal;
    Viajante viajante;

    public OrdenPago(long nroOrden, Month mes, double pagoTotal, Viajante viajante) {
        this.nroOrden = nroOrden;
        this.mes = mes;
        this.pagoTotal = pagoTotal;
        this.viajante = viajante;
    }

}
