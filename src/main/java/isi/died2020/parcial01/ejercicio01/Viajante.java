package isi.died2020.parcial01.ejercicio01;

import java.util.ArrayList;

public class Viajante {
    private String nombre;
    private String cuit;
    private String correoElectronico;
    private ArrayList<Gasto> gastos;

    public ArrayList<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList<Gasto> gastos) {
        this.gastos = gastos;
    }

    public Viajante(){
        gastos = new ArrayList<>();
    }
    public Viajante(String nombre,String cuit,String correoElectronico){
        this.nombre = nombre;
        this.cuit = cuit;
        this.correoElectronico = correoElectronico;
        gastos = new ArrayList<>();
    }

}
