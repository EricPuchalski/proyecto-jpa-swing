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
import org.example.model.LineaPedido;

/**
 *
 * @author ericp
 */
public class LineaPedidoJpaController implements Serializable {

    public LineaPedidoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LineaPedido lineaPedido) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(lineaPedido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LineaPedido lineaPedido) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            lineaPedido = em.merge(lineaPedido);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = lineaPedido.getId();
                if (findLineaPedido(id) == null) {
                    throw new NonexistentEntityException("The lineaPedido with id " + id + " no longer exists.");
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
            LineaPedido lineaPedido;
            try {
                lineaPedido = em.getReference(LineaPedido.class, id);
                lineaPedido.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The lineaPedido with id " + id + " no longer exists.", enfe);
            }
            em.remove(lineaPedido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LineaPedido> findLineaPedidoEntities() {
        return findLineaPedidoEntities(true, -1, -1);
    }

    public List<LineaPedido> findLineaPedidoEntities(int maxResults, int firstResult) {
        return findLineaPedidoEntities(false, maxResults, firstResult);
    }

    private List<LineaPedido> findLineaPedidoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LineaPedido.class));
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

    public LineaPedido findLineaPedido(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LineaPedido.class, id);
        } finally {
            em.close();
        }
    }

    public int getLineaPedidoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LineaPedido> rt = cq.from(LineaPedido.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
