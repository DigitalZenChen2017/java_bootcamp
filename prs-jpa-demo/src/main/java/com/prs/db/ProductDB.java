package com.prs.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.prs.business.Product;

public class ProductDB {
	// get method
	public static Product getProductById(int ProductID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		try {
			Product Product = em.find(Product.class, ProductID); // finds the specific Product id # - first argument is
																	// entityClass, second argument is primary keyy
			return Product;
		} finally {
			em.close(); // closing connection stream
		}

	}

	// getAll method
	@SuppressWarnings("unchecked")
	public static List<Product> getAll() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		List<Product> Products = new ArrayList<>();
		try {
			String query = "SELECT p FROM Product p";
			Query q = em.createQuery(query, Product.class); // step 2, Create SQL statement
			Products = q.getResultList();
			if (Products == null || Products.isEmpty())
				Products = null;
		} finally {
			em.close();
		}
		return Products;
	}

	// add method
	public static boolean add(Product p) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // create EntityManager object - similar to
																		// getConnection object in JDBC
		EntityTransaction trans = em.getTransaction(); // create EntityTransaction to "commit" and if fail we can
		trans.begin(); // "rollback" changes
		try {
			em.persist(p); // persist method - inserts an entity into the database
			trans.commit();
			success = true;
		} catch (Exception ex) {
			trans.rollback();
		} finally {
			em.close();
		}
		return success;
	}

	// delete method
	public static boolean delete(Product p) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.remove(em.merge(p)); // merges new Product object into existing object based on deletedID argument
			trans.commit();
			success = true;
		} catch (Exception e) {
			System.out.println(e);
			trans.rollback();
		} finally {
			em.close();
		}

		return success;
	}

	// update method
	public static boolean update(Product p) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.merge(p); // updates an entity in the database and returns an attached entity
			trans.commit();
			success = true;
		} catch (Exception e) {
			System.out.println(e);
			trans.rollback();
		} finally {
			em.close();
		}
		return success;
	}

	// getAllProductsByVendorID
	@SuppressWarnings("unchecked")
	public static List<Product> getAllProductsByVendorID(int vid) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		List<Product> Product = new ArrayList<>();
		try {
			String query = "SELECT p FROM Product p" + " WHERE p.vendor.id = :inVid"; // inVid is a new variable
			TypedQuery<Product> tq = em.createQuery(query, Product.class); // step 2, Create SQL statement
			tq.setParameter("inVid", vid);
			Product = tq.getResultList();
			if (Product == null || Product.isEmpty())
				Product = null;
		} finally {
			em.close();
		}
		return Product;
	}
}
