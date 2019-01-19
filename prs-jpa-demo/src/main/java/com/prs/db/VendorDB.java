package com.prs.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.prs.business.Vendor;


public class VendorDB {
	// get method
		public static Vendor getVendorById(int vendorID) {
			EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
			try {
				Vendor vendor = em.find(Vendor.class, vendorID); // finds the specific Vendor id # - first argument is entityClass,
															// second argument is primaryKey
				return vendor;
			} finally {
				em.close(); // closing connection stream
			}

		}

		// getAll method
		@SuppressWarnings("unchecked")
		public static List<Vendor> getAll() {
			EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
			List<Vendor> Vendors = new ArrayList<>();
			String query = "SELECT v FROM Vendor v";
			try {
				Query q = em.createQuery(query, Vendor.class); // step 2, Create SQL statement
				Vendors = q.getResultList();
				if (Vendors == null || Vendors.isEmpty())
					Vendors = null;
			} finally {
				em.close();
			}
			return Vendors;
		}

		// add method
		public static boolean add(Vendor v) {
			boolean success = false;
			EntityManager em = DBUtil.getEmFactory().createEntityManager(); // create EntityManager object - similar to
																			// getConnection object in JDBC
			EntityTransaction trans = em.getTransaction(); // create EntityTransaction to "commit" and f fail we can
			trans.begin();												// "rollback" changes
			try {
				
				em.persist(v); // persist method - inserts an entity into the database
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
		public static boolean delete(Vendor v) {
			boolean success = false;
			EntityManager em = DBUtil.getEmFactory().createEntityManager();
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			try {
//				u = getVendorById(u.getId());
//				em.merge(u); // updates an entity in the database and returns an attached entity
//				em.remove(u); // deletes an entity from the database
				em.remove(em.merge(v)); // merges new Vendor object into existing object based on deletedID argument
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
		public static boolean update(Vendor v) {
			boolean success = false;
			EntityManager em = DBUtil.getEmFactory().createEntityManager();
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			try {
//				u = getVendorById(u.getId());
				em.merge(v); // updates an entity in the database and returns an attached entity
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
	
	
	
}
	