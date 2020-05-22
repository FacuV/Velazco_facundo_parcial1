package isi.died2020.parcial01.ejercicio01;

public class Hospedaje implements Gasto{
    private String nombre;
    private int estrellas;
    private double precioXnoche;
    private int noches;
    private boolean hotelHabilitado;
    public Hospedaje(String nombre,int estrellas,double precioXnoche,int noches,boolean hotelHabilitado){
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.precioXnoche = precioXnoche;
        this.noches = noches;
        this.hotelHabilitado = hotelHabilitado;
    }
    @Override
    public double calcularMonto() {
        if(hotelHabilitado){return (precioXnoche*noches);}
        else if(estrellas <= 3){return (precioXnoche*noches)*0.75;}
        return (precioXnoche*noches)*0.50;
    }
}
