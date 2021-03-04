package uy.com.cb.ciclovida;

import javax.persistence.*;
import uy.com.cb.domain.Contacto;

public class Estado2RecuperarObjetoPersistente {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
		EntityManager em = emf.createEntityManager();
		
		//definimos la variable
		Contacto contacto = null;
		
		em.getTransaction().begin();
		//recuperamos el objeto
		contacto = em.find(Contacto.class, 3);
		
		em.getTransaction().commit();
		
		//detached
		System.out.println("contacto = " + contacto);
	}
}
