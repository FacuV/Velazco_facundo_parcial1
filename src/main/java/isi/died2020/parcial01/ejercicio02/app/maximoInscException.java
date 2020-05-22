package isi.died2020.parcial01.ejercicio02.app;

import isi.died2020.parcial01.ejercicio02.db.BaseDeDatosExcepcion;

public class maximoInscException extends Exception {
    public maximoInscException(){
        super("Se alcanzo el cupo maximo en esta materia");
    }

}
