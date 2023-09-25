/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.example.dao.exceptions.NonexistentEntityException;
import org.example.model.Deposito;
import org.example.model.Posicion;

/**
 *
 * @author ericp
 */
public class DepositoJpaController implements Serializable {
    private SectorJpaController sectorJpaController;
    private EmpleadoJpaController empleadoJpaController;

    public DepositoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
        this.sectorJpaController = new SectorJpaController(emf);
        this.empleadoJpaController = new EmpleadoJpaController(emf);
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

        public void upLoad() {
        Deposito deposito1 = new Deposito("1","Deposito China","Calle 1","34543534","depositoCH@gmail.com", "Asia",new Posicion(39.900853,116.399813),empleadoJpaController.findEmpleado(1l));
        Deposito deposito2 = new Deposito("2","Deposito Australia","San martin 2324","1232312","depositoAU@gmail.com", "Oceania", new Posicion(-22.593680,144.544854),empleadoJpaController.findEmpleado(2l));
        Deposito deposito3 = new Deposito("3","Deposito Argentina","San juan 2324","4132","depositoAR@gmail.com", "America",  new Posicion(-34.537211,-58.547629),empleadoJpaController.findEmpleado(3l));
        Deposito deposito4 = new Deposito("4", "Deposito Sudafrica", "Av. Colón 1234", "3512345678", "depositoSA@gmail.com", "Africa", new Posicion(-30.849319,24.201486),empleadoJpaController.findEmpleado(4l));
        Deposito deposito5 = new Deposito("5", "Deposito España", "Av. San Martín 4321", "2612345678", "depositoES@gmail.com", "Europa",new Posicion(39.514578,-2.490630),empleadoJpaController.findEmpleado(5l));


        deposito1.getSectores().addAll(sectorJpaController.findSectorEntities());
        deposito2.getSectores().addAll(sectorJpaController.findSectorEntities());
        deposito3.getSectores().addAll(sectorJpaController.findSectorEntities());
        deposito4.getSectores().addAll(sectorJpaController.findSectorEntities());
        deposito5.getSectores().addAll(sectorJpaController.findSectorEntities());
        
        this.create(deposito1);
        this.create(deposito2);
        this.create(deposito3);
        this.create(deposito4);
        this.create(deposito5);

    }
    public void create(Deposito deposito) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(deposito);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Deposito deposito) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            deposito = em.merge(deposito);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = deposito.getId();
                if (findDeposito(id) == null) {
                    throw new NonexistentEntityException("The deposito with id " + id + " no longer exists.");
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
            Deposito deposito;
            try {
                deposito = em.getReference(Deposito.class, id);
                deposito.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The deposito with id " + id + " no longer exists.", enfe);
            }
            em.remove(deposito);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Deposito> findDepositoEntities() {
        return findDepositoEntities(true, -1, -1);
    }

    public List<Deposito> findDepositoEntities(int maxResults, int firstResult) {
        return findDepositoEntities(false, maxResults, firstResult);
    }

    private List<Deposito> findDepositoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Deposito.class));
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

    public Deposito findDeposito(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Deposito.class, id);
        } finally {
            em.close();
        }
    }

    public int getDepositoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Deposito> rt = cq.from(Deposito.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
