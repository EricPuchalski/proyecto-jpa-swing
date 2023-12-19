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
import org.example.model.CategoriaProducto;

/**
 *
 * @author ericp
 */
public class CategoriaProductoJpaController implements Serializable {

    public CategoriaProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public void upload(){
        CategoriaProducto informatica = new CategoriaProducto("Informatica");
        CategoriaProducto limpieza = new CategoriaProducto("Limpieza");
        CategoriaProducto hogar = new CategoriaProducto("Hogar");
        CategoriaProducto jardin = new CategoriaProducto("Jardin");
        CategoriaProducto electronica = new CategoriaProducto("Electronica");
        CategoriaProducto juguete = new CategoriaProducto("Juguete");
        
        this.create(informatica);
        this.create(hogar);
        this.create(jardin);
        this.create(limpieza);
        this.create(electronica);
        this.create(juguete);
    }

    public void create(CategoriaProducto categoriaProducto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(categoriaProducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CategoriaProducto categoriaProducto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            categoriaProducto = em.merge(categoriaProducto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = categoriaProducto.getId();
                if (findCategoriaProducto(id) == null) {
                    throw new NonexistentEntityException("The categoriaProducto with id " + id + " no longer exists.");
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
            CategoriaProducto categoriaProducto;
            try {
                categoriaProducto = em.getReference(CategoriaProducto.class, id);
                categoriaProducto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The categoriaProducto with id " + id + " no longer exists.", enfe);
            }
            em.remove(categoriaProducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CategoriaProducto> findCategoriaProductoEntities() {
        return findCategoriaProductoEntities(true, -1, -1);
    }

    public List<CategoriaProducto> findCategoriaProductoEntities(int maxResults, int firstResult) {
        return findCategoriaProductoEntities(false, maxResults, firstResult);
    }

    private List<CategoriaProducto> findCategoriaProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CategoriaProducto.class));
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

    public CategoriaProducto findCategoriaProducto(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CategoriaProducto.class, id);
        } finally {
            em.close();
        }
    }

    public int getCategoriaProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CategoriaProducto> rt = cq.from(CategoriaProducto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
