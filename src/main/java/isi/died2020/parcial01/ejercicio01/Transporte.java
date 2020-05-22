package isi.died2020.parcial01.ejercicio01;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Transporte implements Gasto {
    private int kmAntes;
    private int kmDesp;
    private LocalDate inicio;
    private LocalDate fin;

    public Transporte(int kmAntes, int kmDesp, LocalDate inicio, LocalDate fin) {
        this.kmAntes = kmAntes;
        this.kmDesp = kmDesp;
        this.inicio = inicio;
        this.fin = fin;
    }
    @Override
    public double calcularMonto(){
        return (50 * (kmDesp - kmAntes) + 5000 * ((DAYS.between(inicio, fin))));
    }
}
