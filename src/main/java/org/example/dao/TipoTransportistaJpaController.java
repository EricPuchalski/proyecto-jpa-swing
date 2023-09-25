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
import org.example.model.TipoTransportista;

/**
 *
 * @author ericp
 */
public class TipoTransportistaJpaController implements Serializable {

    public TipoTransportistaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
        public void upload(){
        TipoTransportista aereo = new TipoTransportista("Aéreo");
        TipoTransportista terrestre = new TipoTransportista("Terrestre");
        TipoTransportista maritimo = new TipoTransportista("Marítimo");
        
        this.create(aereo);
        this.create(terrestre);
        this.create(maritimo);

    }

    public void create(TipoTransportista tipoTransportista) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoTransportista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoTransportista tipoTransportista) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoTransportista = em.merge(tipoTransportista);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = tipoTransportista.getId();
                if (findTipoTransportista(id) == null) {
                    throw new NonexistentEntityException("The tipoTransportista with id " + id + " no longer exists.");
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
            TipoTransportista tipoTransportista;
            try {
                tipoTransportista = em.getReference(TipoTransportista.class, id);
                tipoTransportista.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoTransportista with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoTransportista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoTransportista> findTipoTransportistaEntities() {
        return findTipoTransportistaEntities(true, -1, -1);
    }

    public List<TipoTransportista> findTipoTransportistaEntities(int maxResults, int firstResult) {
        return findTipoTransportistaEntities(false, maxResults, firstResult);
    }

    private List<TipoTransportista> findTipoTransportistaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoTransportista.class));
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

    public TipoTransportista findTipoTransportista(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoTransportista.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoTransportistaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoTransportista> rt = cq.from(TipoTransportista.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
