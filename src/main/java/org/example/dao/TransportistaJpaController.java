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
import org.example.model.Transportista;

/**
 *
 * @author ericp
 */
public class TransportistaJpaController implements Serializable {
    private TipoTransportistaJpaController tipoTransportistaJpaController;

    public TransportistaJpaController(TipoTransportistaJpaController tipoTransportistaJpaController,EntityManagerFactory emf) {
        this.emf = emf;
        this.tipoTransportistaJpaController = tipoTransportistaJpaController;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

        public void upLoad() {
            
            Transportista t1 = new Transportista("12321","Correo Argentino","12342", "correo_argentino@gmail.com",tipoTransportistaJpaController.findTipoTransportista(1l));
            Transportista t2 = new Transportista("3213","OCA","4352", "oca@gmail.com",tipoTransportistaJpaController.findTipoTransportista(2l));
            Transportista t3 = new Transportista("232","OCASA","7653432", "oacasa@gmail.com",tipoTransportistaJpaController.findTipoTransportista(3l));
            Transportista t4 = new Transportista("34","AMAZON","4235234", "amazon@gmail.com",tipoTransportistaJpaController.findTipoTransportista(1l));
            Transportista t5 = new Transportista("676","DHL","12321", "dhl@gmail.com",tipoTransportistaJpaController.findTipoTransportista(2l));
            Transportista t6 = new Transportista("6762","FedEx","123321", "fedex@gmail.com",tipoTransportistaJpaController.findTipoTransportista(3l));
            
            this.create(t1);
            this.create(t2);
            this.create(t3);
            this.create(t4);
            this.create(t5);
            this.create(t6);
            

    }
    public void create(Transportista transportista) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(transportista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Transportista transportista) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            transportista = em.merge(transportista);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = transportista.getId();
                if (findTransportista(id) == null) {
                    throw new NonexistentEntityException("The transportista with id " + id + " no longer exists.");
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
            Transportista transportista;
            try {
                transportista = em.getReference(Transportista.class, id);
                transportista.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The transportista with id " + id + " no longer exists.", enfe);
            }
            em.remove(transportista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Transportista> findTransportistaEntities() {
        return findTransportistaEntities(true, -1, -1);
    }

    public List<Transportista> findTransportistaEntities(int maxResults, int firstResult) {
        return findTransportistaEntities(false, maxResults, firstResult);
    }

    private List<Transportista> findTransportistaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Transportista.class));
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

    public Transportista findTransportista(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Transportista.class, id);
        } finally {
            em.close();
        }
    }

    public int getTransportistaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Transportista> rt = cq.from(Transportista.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
