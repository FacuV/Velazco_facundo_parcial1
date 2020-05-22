package isi.died2020.parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {

    public static ArrayList OrdenesPagoViajantes(ArrayList<Viajante> viajantes){
        ArrayList ordenes = new ArrayList();

        for(int i=0; i < viajantes.size(); i++){
            if(viajantes.get(i).getGastos().size() > 0){
            ordenes.add(new OrdenPago(i+1, LocalDate.now().getMonth(),calcularPago(viajantes.get(i).getGastos()),viajantes.get(i)));
            }
        }
        return ordenes;
    }
    private static double calcularPago(ArrayList<Gasto> gastos){
        double monto = 0;
        for(int i = 0; i < gastos.size(); i++){
            monto += gastos.get(i).calcularMonto();
        }
        return monto;
    }
}
