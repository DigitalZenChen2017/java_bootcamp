package com.prs.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.prs.business.User;

public class UserDB {
	// get method
	public static User getUserById(int userID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		try {
			User user = em.find(User.class, userID); // finds the specific user id # - first argument is entityClass,
														// second argument is primaryKey
			return user;
		} finally {
			em.close(); // closing connection stream
		}

	}

	// getAll method
	@SuppressWarnings("unchecked")
	public static List<User> getAll() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // declare EntityManager object
		List<User> users = new ArrayList<>();
		String query = "SELECT u FROM User u";
		try {
			Query q = em.createQuery(query, User.class); // step 2, Create SQL statement
			users = q.getResultList();
			if (users == null || users.isEmpty())
				users = null;
		} finally {
			em.close();
		}
		return users;
	}

	// add method
	public static boolean add(User u) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager(); // create EntityManager object - similar to
																		// getConnection object in JDBC
		EntityTransaction trans = em.getTransaction(); // create EntityTransaction to "commit" and f fail we can
		trans.begin();												// "rollback" changes
		try {
			
			em.persist(u); // persist method - inserts an entity into the database
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
	public static boolean delete(User u) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
//			u = getUserById(u.getId());
//			em.merge(u); // updates an entity in the database and returns an attached entity
//			em.remove(u); // deletes an entity from the database
			em.remove(em.merge(u)); // merges new User object into existing object based on deletedID argument
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
	public static boolean update(User u) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
//			u = getUserById(u.getId());
			em.merge(u); // updates an entity in the database and returns an attached entity
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
