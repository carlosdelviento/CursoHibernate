package uy.com.cb.ciclovida;

import javax.persistence.*;
import uy.com.cb.domain.Contacto;

public class Estado4EliminarObjeto {
	public static void main(String[] args) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
			EntityManager em = emf.createEntityManager();
	
			// definimos la variable
			Contacto contacto = null;
	
			// recuperamos el objeto
			// 1. transitivo
			contacto = em.find(Contacto.class, 3);
			if (contacto != null) {
	
				em.getTransaction().begin();
		
				// 2. remove
				em.remove(em.merge(contacto));
		
				em.getTransaction().commit();
		
				// 3. transitivo
				System.out.println("contacto = " + contacto);
			}else {
				System.out.println("No existe el contacto " + contacto);
			}
		} catch(Exception ex) {
			ex.printStackTrace(System.out);
		}
	}
}
