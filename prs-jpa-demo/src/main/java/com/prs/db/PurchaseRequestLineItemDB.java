package com.prs.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.prs.business.PurchaseRequestLineItem;

public class PurchaseRequestLineItemDB {
	// get method
	public static PurchaseRequestLineItem getPurchaseRequestLineItemById(int PurchaseRequestLineItemID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		try {
			PurchaseRequestLineItem PurchaseRequestLineItem = em.find(PurchaseRequestLineItem.class, PurchaseRequestLineItemID); // finds the specific PurchaseRequestLineItem id # - first argument is
																	// entityClass, second argument is primary key
			return PurchaseRequestLineItem;
		} finally {
			em.close(); // closing connection stream
		}

	}

	// getAll method
	@SuppressWarnings("unchecked")
	public static List<PurchaseRequestLineItem> getAll() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		List<PurchaseRequestLineItem> PurchaseRequestLineItems = new ArrayList<>();
		try {
			String query = "SELECT p FROM PurchaseRequestLineItem p";
			Query q = em.createQuery(query, PurchaseRequestLineItem.class); // step 2, Create SQL statement
			PurchaseRequestLineItems = q.getResultList();
			if (PurchaseRequestLineItems == null || PurchaseRequestLineItems.isEmpty())
				PurchaseRequestLineItems = null;
		} finally {
			em.close();
		}
		return PurchaseRequestLineItems;
	}

	// add method
	public static boolean add(PurchaseRequestLineItem p) {
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
	public static boolean delete(PurchaseRequestLineItem p) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.remove(em.merge(p)); // merges new PurchaseRequestLineItem object into existing object based on deletedID argument
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
	public static boolean update(PurchaseRequestLineItem p) {
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

	// getAllPurchaseRequestLineItemsByPurchaseRequest
	@SuppressWarnings("unchecked")
	public static List<PurchaseRequestLineItem> getAllPurchaseRequestLineItemsByPurchaseRequestID(int prid) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		List<PurchaseRequestLineItem> PurchaseRequestLineItem = new ArrayList<>();
		try {
			String query = "SELECT p FROM PurchaseRequestLineItem p" + " WHERE p.purchaseRequest.id = :inPRid"; // inPRid is a new variable
			TypedQuery<PurchaseRequestLineItem> tq = em.createQuery(query, PurchaseRequestLineItem.class); // step 2, Create SQL statement
			tq.setParameter("inPRid", prid);
			PurchaseRequestLineItem = tq.getResultList();
			if (PurchaseRequestLineItem == null || PurchaseRequestLineItem.isEmpty())
				PurchaseRequestLineItem = null;
		} finally {
			em.close();
		}
		return PurchaseRequestLineItem;
	}
}
