package com.masai.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String args[]) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("projectUnit");
		EntityManager em=emf.createEntityManager();
		System.out.println(em);
	}
}
