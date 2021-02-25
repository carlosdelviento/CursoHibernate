package uy.com.cb.ciclovida;

import javax.persistence.*;
import uy.com.cb.domain.Contacto;

public class Estado3ModificarObjetoPersistente {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
		EntityManager em = emf.createEntityManager();
		
		//definimos la variable
		Contacto contacto = null;
		
		//recuperamos el objeto
		//1. transitivo
		contacto = em.find(Contacto.class, 3);
		
		//modificamos el objeto
		contacto.setEmail("clara@mail.com");
		
		em.getTransaction().begin();

		//2. persistente
		//em.persist(contacto);
		em.merge(contacto);
		
		em.getTransaction().commit();
		
		//3. detached
		System.out.println("contacto = " + contacto);
	}
}
