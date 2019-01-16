package com.prs.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.db.DBUtil;

public class UserDB {
	public static User getUserById(int userID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			User user = em.find(User.class, userID);
			
			return user;
		}
		finally {
			em.close();
			//DBUtil.closeEMF();
		}
		
	}

	public static List<User> getAll() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		List<User> users = new ArrayList<>();
		try {
			Query q = em.createQuery("SELECT u FROM User u"); // step 2, Create SQL statement
			users = q.getResultList();
			
		}
		finally {
			em.close();
			//DBUtil.closeEMF();
		}
		return users;
	}
}
