package uy.com.cb.servicio;

import java.util.List;

import uy.com.cb.dao.PersonaDAO;
import uy.com.cb.domain.Persona;

public class ServicioPersonas {
	
	private PersonaDAO personaDao;
	
	public ServicioPersonas() {
		this.personaDao = new PersonaDAO();
	}
	
	public List<Persona> listarPersonas(){
		return this.personaDao.listar();
	}
}
