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
import org.example.model.Cliente;

/**
 *
 * @author ericp
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void upLoad(){
        Cliente c1 = new Cliente("123","Eric", "Puch", "Josesito 232","3243242");
        Cliente c2 = new Cliente("32323","Juan", "Mendez", "San jose 34354","23435");
        Cliente c3 = new Cliente("234324","Elric", "Jalil", "Calle 150","34543543");
        Cliente c4 = new Cliente("3453","Carlos", "Perez", "Calle 32","653634");
        Cliente c5 = new Cliente("54634","Gustavo", "Lopez", "calle 09","6435345");
        Cliente c6 = new Cliente("534534","Pablo", "Gonzalez", "Bolivar 232","43543");
        Cliente c7 = new Cliente("543534","Martin", "Khea", "Calle 90","65454");
        Cliente c8 = new Cliente("1234", "John", "Doe", "Street 123", "1234567");
        Cliente c9 = new Cliente("5678", "Jane", "Smith", "Avenue 456", "9876543");
        Cliente c10 = new Cliente("9012", "Michael", "Johnson", "Road 789", "5678901");
        Cliente c11 = new Cliente("3456", "Emily", "Davis", "Lane 321", "1098765");
        Cliente c12 = new Cliente("7890", "David", "Anderson", "Court 654", "4321098");
        Cliente c13 = new Cliente("2345", "Sarah", "Wilson", "Plaza 987", "8765432");
        Cliente c14 = new Cliente("6789", "Daniel", "Taylor", "Square 654", "2109876");
        Cliente c15 = new Cliente("0123", "Olivia", "Thomas", "Circle 321", "5432109");
        Cliente c16 = new Cliente("4567", "Matthew", "Roberts", "Park 789", "8901234");
        Cliente c17 = new Cliente("8901", "Sophia", "Clark", "Garden 123", "5678901");
        Cliente c18 = new Cliente("2345", "James", "Lewis", "Drive 456", "4321098");
        Cliente c19 = new Cliente("6789", "Emma", "Lee", "Boulevard 789", "8765432");
        Cliente c20 = new Cliente("0123", "Benjamin", "Walker", "Highway 321", "2109876");
        Cliente c21 = new Cliente("4567", "Ava", "Hall", "Lane 654", "5432109");
        Cliente c22 = new Cliente("8901", "William", "Young", "Street 987", "8901234");
        Cliente c23 = new Cliente("2345", "Mia", "Allen", "Avenue 123", "5678901");
        Cliente c24 = new Cliente("6789", "Alexander", "King", "Road 456", "4321098");
        Cliente c25 = new Cliente("0123", "Sofia", "Wright", "Court 789", "8765432");
        Cliente c26 = new Cliente("4567", "Charlotte", "Lopez", "Plaza 321", "2109876");
        Cliente c27 = new Cliente("8901", "Joseph", "Hill", "Square 654", "5432109");



        this.create(c1);
        this.create(c2);
        this.create(c3);
        this.create(c4);
        this.create(c5);
        this.create(c6);
        this.create(c7);
        this.create(c8);
        this.create(c9);
        this.create(c10);
        this.create(c11);
        this.create(c12);
        this.create(c13);
        this.create(c14);
        this.create(c15);
        this.create(c16);
        this.create(c17);
        this.create(c18);
        this.create(c19);
        this.create(c20);
        this.create(c21);
        this.create(c22);
        this.create(c23);
        this.create(c24);
        this.create(c25);
        this.create(c26);
        this.create(c27);

    }
    public void create(Cliente cliente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cliente = em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = cliente.getId();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
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
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
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

    public Cliente findCliente(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
