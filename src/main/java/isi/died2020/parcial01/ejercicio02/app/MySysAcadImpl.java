package isi.died2020.parcial01.ejercicio02.app;

import java.util.ArrayList;
import java.util.List;

import isi.died2020.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died2020.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died2020.parcial01.ejercicio02.dominio.*;

import static isi.died2020.parcial01.ejercicio02.dominio.Inscripcion.Estado.PROMOCIONADO;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) {
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		d.agregarInscripcion(insc);
		a.addCursada(insc);
		m.addInscripcion(insc);
		// DESCOMENTAR Y gestionar excepcion
		try{ DB.guardar(insc);
		} catch (BaseDeDatosExcepcion baseDeDatosExcepcion) {
			System.out.println(baseDeDatosExcepcion.getMessage());
			baseDeDatosExcepcion.printStackTrace();
		}
	}

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(e);
	}

	@Override
	public Double promedio(Docente d, Materia m) {
		//Hasta aca llegue profe
		return materia.stream().filter(mat -> mat.getId() == m.getId() && mat.getDocentes().contains(d)).map(m -> m.getExamenes())}

	public void registrarNota(Examen e, Integer nota){
		e.setNota(nota);
		Alumno alumno = e.getAlumno();
		Materia mat = e.getMateria();
		Inscripcion.Estado est = PROMOCIONADO;
		if(nota > 6){
			for(int i=alumno.getMateriasCursadas().size()-1;i >= 0; i--){
				if(alumno.getMateriasCursadas().get(i).getMateria().getId() == mat.getId()){
					alumno.getMateriasCursadas().get(i).setEstado(est);
				}
			}
		}
	}


}
