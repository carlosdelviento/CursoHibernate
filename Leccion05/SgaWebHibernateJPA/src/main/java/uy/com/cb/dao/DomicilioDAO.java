package uy.com.cb.dao;

import java.util.List;
import javax.persistence.Query;
import static uy.com.cb.dao.GenericDAO.em;
import uy.com.cb.domain.Domicilio;

public class DomicilioDAO extends GenericDAO{
	
	public List<Domicilio> listar() {
		String consulta = "SELECT d FROM Domicilio d";
		em = getEntityManager();
		Query query = em.createQuery(consulta);
		return query.getResultList();
	}

	public void insertar(Domicilio domicilio) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(domicilio);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
		}
		finally {
			if(em != null) {
				em.close();
			}
		}
	}

	public void actualizar(Domicilio domicilio) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(domicilio);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
			em.getTransaction().rollback();
		}
		finally {
			if(em != null) {
				em.close();
			}
		}
	}

	public void eliminar(Domicilio domicilio) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.remove(em.merge(domicilio));
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
			em.getTransaction().rollback();
		}
		finally {
			if(em != null) {
				em.close();
			}
		}
	}
	
	public Object buscarPorId(Domicilio domicilio) {
		em = getEntityManager();
		return em.find(Domicilio.class, domicilio.getIdDomicilio());
	}

}
