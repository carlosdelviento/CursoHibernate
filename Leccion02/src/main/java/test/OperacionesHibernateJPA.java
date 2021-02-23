package test;

import uy.com.cb.dao.PersonaDAO;
import uy.com.cb.domain.Persona;

public class OperacionesHibernateJPA {
	public static void main(String[] args) {
		PersonaDAO personaDao = new PersonaDAO();
		personaDao.listar();
		
		Persona persona = new Persona();
		persona.setIdPersona(15);
		
		persona = personaDao.buscarPersonaPorId(persona);
		System.out.println("persona encontrada = " + persona);
		
		//persona.setNombre("Carlos");
		//persona.setApellido("Esparza");
		//persona.setEmail("cesparza@mail.com");
		//persona.setTelefono("55443322");
		
		//personaDao.insertar(persona);
		
		//personaDao.modificar(persona);
		
		personaDao.eliminar(persona);
		personaDao.listar();

	}
}
