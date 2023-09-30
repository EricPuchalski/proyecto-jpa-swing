/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.dao;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.example.dao.exceptions.NonexistentEntityException;
import org.example.dao.exceptions.PreexistingEntityException;
import org.example.model.Empleado;
import org.example.util.EntityManagerFactoryUTIL;

/**
 *
 * @author ericp
 */
public class EmpleadoJpaController implements Serializable {

    public EmpleadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
        public void upLoad() {
        Empleado empleado1 = new Empleado("1235433", "Juan", "Perez", "Calle 273", "232323");
        Empleado empleado2 = new Empleado("4562324", "María", "López", "Avenida 45", "454545");
        Empleado empleado3 = new Empleado("7896754", "Pedro", "Gómez", "Calle 67", "676767");
        Empleado empleado4 = new Empleado("1067515", "Laura", "Rodríguez", "Avenida 819", "898989");
        Empleado empleado5 = new Empleado("1217665", "Carlos", "Sánchez", "Calle 110", "101010");
        Empleado empleado6 = new Empleado("1238767", "Juan", "Perez", "Calle 213", "232323");
        Empleado empleado7 = new Empleado("4564325", "María", "López", "Avenida 45", "454545");
        Empleado empleado8 = new Empleado("7891234", "Pedro", "Gómez", "Calle 67", "676767");
        Empleado empleado9 = new Empleado("1015423", "Laura", "Rodríguez", "Avenida 89", "898989");
        Empleado empleado10 = new Empleado("2122145", "Carlos", "Sánchez", "Calle 140", "101010");
        Empleado empleado11 = new Empleado("1223764", "Juan", "Perez", "Calle 223", "232323");
        Empleado empleado12 = new Empleado("4563435", "María", "López", "Avenida 45", "454545");
        Empleado empleado13 = new Empleado("7896544", "Pedro", "Gómez", "Calle 67", "676767");
        Empleado empleado14 = new Empleado("1051141", "Laura", "Rodríguez", "Avenida 829", "898989");
        Empleado empleado15 = new Empleado("1241111", "Carlos", "Sánchez", "Calle 170", "101010");

        try {
            this.create(empleado1);
            this.create(empleado2);
            this.create(empleado3);
            this.create(empleado4);
            this.create(empleado5);    
                        this.create(empleado6);
            this.create(empleado7);
            this.create(empleado8);
            this.create(empleado9);
            this.create(empleado10);  
                        this.create(empleado11);
            this.create(empleado12);
            this.create(empleado13);
            this.create(empleado14);
            this.create(empleado15);  
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoJpaController.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }


    public void create(Empleado empleado) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEmpleado(empleado.getId()) != null) {
                throw new PreexistingEntityException("Empleado " + empleado + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Empleado empleado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            empleado = em.merge(empleado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = empleado.getId();
                if (findEmpleado(id) == null) {
                    throw new NonexistentEntityException("The empleado with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empleado empleado;
            try {
                empleado = em.getReference(Empleado.class, id);
                empleado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The empleado with id " + id + " no longer exists.", enfe);
            }
                    // Elimina todos los productos asociados al proveedor en una sola transacción
            em.createQuery("UPDATE Deposito d SET d.empleado = NULL WHERE d.empleado.id = :idEmpleado")
              .setParameter("idEmpleado", id)
              .executeUpdate();

            // Finalmente, elimina el proveedor

            em.remove(empleado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Empleado> findEmpleadoEntities() {
        return findEmpleadoEntities(true, -1, -1);
    }

    public List<Empleado> findEmpleadoEntities(int maxResults, int firstResult) {
        return findEmpleadoEntities(false, maxResults, firstResult);
    }

    private List<Empleado> findEmpleadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Empleado.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Empleado findEmpleado(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Empleado.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmpleadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Empleado> rt = cq.from(Empleado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
        public List<Empleado> buscarPorCuitParcial(String cuitPrefix) {
        EntityManager em = getEntityManager();
        try{
            TypedQuery<Empleado> query = em.createQuery(
                "SELECT e FROM Empleado e WHERE e.cuit LIKE :cuitPrefix", Empleado.class);
            query.setParameter("cuitPrefix", cuitPrefix);
        return query.getResultList();
        } finally{
            em.close();
        }

    }
    
}
