package isi.died2020.parcial01.ejercicio01;

import java.time.LocalDate;

public class Alimento implements Gasto{
    private double monto;
    private LocalDate fecha;

    public Alimento(double monto, LocalDate fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }
    @Override
    public double calcularMonto() {
        return monto;
    }
}
