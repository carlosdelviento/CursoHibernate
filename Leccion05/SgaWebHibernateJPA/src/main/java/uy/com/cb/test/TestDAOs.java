package uy.com.cb.test;

import java.util.List;

import uy.com.cb.dao.AlumnoDAO;
import uy.com.cb.dao.AsignacionDAO;
import uy.com.cb.dao.ContactoDAO;
import uy.com.cb.dao.CursoDAO;
import uy.com.cb.dao.DomicilioDAO;

public class TestDAOs {
	public static void main(String[] args) {
		AlumnoDAO alumnoDao = new AlumnoDAO();
		System.out.println("Alumnos:");
		imprimir(alumnoDao.listar());
		
		System.out.println("Domicilio");
		DomicilioDAO domicilioDao = new DomicilioDAO();
		imprimir(domicilioDao.listar());
		
		System.out.println("Contacto");
		ContactoDAO ContactoDao = new ContactoDAO();
		imprimir(ContactoDao.listar());
		
		System.out.println("Curso");
		CursoDAO CursoDao = new CursoDAO();
		imprimir(CursoDao.listar());
		
		System.out.println("Asignaciones");
		AsignacionDAO AsignacionesDao = new AsignacionDAO();
		imprimir(AsignacionesDao.listar());
	}

	private static void imprimir(List coleccion) {
		for (Object o : coleccion) {
			System.out.println("valor = " + o);
		}
	}
}