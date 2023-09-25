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
import org.example.model.Producto;

/**
 *
 * @author ericp
 */
public class ProductoJpaController implements Serializable {
    private ProveedorJpaController proveedorJpaController;
    private CategoriaProductoJpaController categoriaProductoJpaController;

    public ProductoJpaController(EntityManagerFactory emf, ProveedorJpaController proveedorJpaController, CategoriaProductoJpaController categoriaProductoJpaController) {
        this.emf = emf;
        this.proveedorJpaController = proveedorJpaController;
        this.categoriaProductoJpaController = categoriaProductoJpaController;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

        public void upLoad() {

            Producto p1 = new Producto("1", "Monitor", 0.5, 0.6, 1, 3, categoriaProductoJpaController.findCategoriaProducto(1l), proveedorJpaController.findProveedor(1l));
            Producto p2 = new Producto("2", "Mouse", 0.01, 0.005, 2, 0.198, categoriaProductoJpaController.findCategoriaProducto(2l), proveedorJpaController.findProveedor(2l));
            Producto p3 = new Producto("3", "Pava eléctrica", 0.5, 0.04, 3, 2, categoriaProductoJpaController.findCategoriaProducto(3l), proveedorJpaController.findProveedor(3l));
            Producto p4 = new Producto("4", "Peluche oso", 0.9, 1, 2, 0.6, categoriaProductoJpaController.findCategoriaProducto(4l), proveedorJpaController.findProveedor(4l));
            Producto p5 = new Producto("5", "Escoba", 0.03, 2, 2, 0.5, categoriaProductoJpaController.findCategoriaProducto(5l), proveedorJpaController.findProveedor(5l));
            Producto p6 = new Producto("6", "Silla", 1, 1.4, 2, 6.4, categoriaProductoJpaController.findCategoriaProducto(6l), proveedorJpaController.findProveedor(1l));
            Producto p7 = new Producto("7", "Toalla", 1, 2, 2, 0.1, categoriaProductoJpaController.findCategoriaProducto(6l), proveedorJpaController.findProveedor(2l));
            Producto p8 = new Producto("8", "Sábana", 2, 2.4, 2, 0.7, categoriaProductoJpaController.findCategoriaProducto(6l), proveedorJpaController.findProveedor(3l));
            Producto p9 = new Producto("9", "Teclado", 0.05, 0.005, 5, 1, categoriaProductoJpaController.findCategoriaProducto(2l), proveedorJpaController.findProveedor(4l));
            Producto p10 = new Producto("10", "Estante", 2, 1.1, 2, 10, categoriaProductoJpaController.findCategoriaProducto(6l), proveedorJpaController.findProveedor(5l));
            Producto p11 = new Producto("11", "Detergente", 0.4, 0.05, 2, 0.2, categoriaProductoJpaController.findCategoriaProducto(3l), proveedorJpaController.findProveedor(1l));
            Producto p12 = new Producto("12", "Peluche Barney", 0.7, 1.7, 1, 0.4, categoriaProductoJpaController.findCategoriaProducto(4l), proveedorJpaController.findProveedor(2l));
            Producto p13 = new Producto("13", "Mousepad", 0.4, 2, 2, 0.01, categoriaProductoJpaController.findCategoriaProducto(2l), proveedorJpaController.findProveedor(3l));
            Producto p14 = new Producto("14", "Bombilla", 0.0001, 3, 2, 0.01, categoriaProductoJpaController.findCategoriaProducto(5l), proveedorJpaController.findProveedor(4l));
            Producto p15 = new Producto("15", "Maceta", 0.5, 3, 2, 1.3, categoriaProductoJpaController.findCategoriaProducto(6l), proveedorJpaController.findProveedor(5l));
            Producto p16 = new Producto("16", "Gnomo de jardín", 1, 3, 2, 3, categoriaProductoJpaController.findCategoriaProducto(6l), proveedorJpaController.findProveedor(1l));
            Producto p17 = new Producto("17", "Licuadora", 0.3, 3, 2, 2.5, categoriaProductoJpaController.findCategoriaProducto(3l), proveedorJpaController.findProveedor(2l));
            Producto p18 = new Producto("18", "Cafetera", 0.2, 3, 2, 2, categoriaProductoJpaController.findCategoriaProducto(3l), proveedorJpaController.findProveedor(3l));
            Producto p19 = new Producto("19", "Muñeco Goku", 1.2, 3, 2, 1, categoriaProductoJpaController.findCategoriaProducto(4l), proveedorJpaController.findProveedor(4l));
            Producto p20 = new Producto("20", "Muñeco Pikachu", 0.09, 3, 2, 0.6, categoriaProductoJpaController.findCategoriaProducto(4l), proveedorJpaController.findProveedor(5l));

            this.create(p1);
            this.create(p2);
            this.create(p3);
            this.create(p4);
            this.create(p5);
            this.create(p6);
            this.create(p7);
            this.create(p8);
            this.create(p9);
            this.create(p10);
            this.create(p11);
            this.create(p12);
            this.create(p13);
            this.create(p14);
            this.create(p15);
            this.create(p16);
            this.create(p17);
            this.create(p18);
            this.create(p19);
            this.create(p20);


    }
    public void create(Producto producto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            producto = em.merge(producto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = producto.getId();
                if (findProducto(id) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
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
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + id + " no longer exists.", enfe);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
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

    public Producto findProducto(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
