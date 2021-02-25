package uy.com.cb.ciclovida;

import javax.persistence.*;

import uy.com.cb.domain.Contacto;

public class Estado1Persistido {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
		EntityManager em = emf.createEntityManager();
		
		//1. estado transitivo
		Contacto contacto = new Contacto();
		contacto.setEmail("clara");
		contacto.setTelefono("11223344");
		
		//2. estado persistente del objeto
		em.getTransaction().begin();
		
		em.persist(contacto);
		
		em.getTransaction().commit();
		
		//3. detached (separado)
		System.out.println("contacto = " + contacto);
	}
	
}
