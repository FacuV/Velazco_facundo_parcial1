package isi.died2020.parcial01.ejercicio01;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testOrdenesPagoViajantes(){
        ArrayList viajantes = new ArrayList();
        ArrayList gastos = new ArrayList();
        Viajante viajante1 = new Viajante("Juan","11223344567","juan@gmail.com");
        Viajante viajante2 = new Viajante("Jose","99887766554","jose@gmail.com");
        Hospedaje hosp1 = new Hospedaje("hotel1",3,500,2,true);
        Alimento alim1 = new Alimento(20, LocalDate.now());
        Transporte trans1 = new Transporte(100,200,LocalDate.of(2020,5,1),LocalDate.now());
        gastos.add(hosp1);
        gastos.add(alim1);
        gastos.add(trans1);
        viajante1.setGastos(gastos);
        viajante2.setGastos(gastos);
        viajantes.add(viajante1);
        viajantes.add(viajante2);

        ArrayList ordenes = App.OrdenesPagoViajantes(viajantes);
        assertTrue(ordenes.size() == 2);
        //Solo hago este test porque no me da el tiempo.
        }
}
