package com.prs.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.prs.business.PurchaseRequest;

public class PurchaseRequestDB {
	// get method
	public static PurchaseRequest getPurchaseRequestById(int PurchaseRequestID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		try {
			PurchaseRequest PurchaseRequest = em.find(PurchaseRequest.class, PurchaseRequestID); // finds the specific PurchaseRequest id # - first argument is
																	// entityClass, second argument is primary key
			return PurchaseRequest;
		} finally {
			em.close(); // closing connection stream
		}

	}

	// getAll method
	@SuppressWarnings("unchecked")
	public static List<PurchaseRequest> getAll() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		List<PurchaseRequest> PurchaseRequests = new ArrayList<>();
		try {
			String query = "SELECT p FROM PurchaseRequest p";
			Query q = em.createQuery(query, PurchaseRequest.class); // step 2, Create SQL statement
			PurchaseRequests = q.getResultList();
			if (PurchaseRequests == null || PurchaseRequests.isEmpty())
				PurchaseRequests = null;
		} finally {
			em.close();
		}
		return PurchaseRequests;
	}

	// add method
	public static boolean add(PurchaseRequest p) {
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
	public static boolean delete(PurchaseRequest p) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.remove(em.merge(p)); // merges new PurchaseRequest object into existing object based on deletedID argument
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
	public static boolean update(PurchaseRequest p) {
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

	// getAllPurchaseRequestsByUserID
	@SuppressWarnings("unchecked")
	public static List<PurchaseRequest> getAllPurchaseRequestsByUserID(int uid) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		List<PurchaseRequest> PurchaseRequest = new ArrayList<>();
		try {
			String query = "SELECT pr FROM PurchaseRequest pr" + " WHERE pr.user.id = :inUid"; // inUid is a new variable
			TypedQuery<PurchaseRequest> tq = em.createQuery(query, PurchaseRequest.class); // step 2, Create SQL statement
			tq.setParameter("inUid", uid);
			PurchaseRequest = tq.getResultList();
			if (PurchaseRequest == null || PurchaseRequest.isEmpty())
				PurchaseRequest = null;
		} finally {
			em.close();
		}
		return PurchaseRequest;
	}
}
