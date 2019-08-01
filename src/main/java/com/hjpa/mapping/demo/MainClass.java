package com.hjpa.mapping.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Crud");
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Address address = new Address(0,"Chala","Vapi","396191");
		
		Mobile mobile1 = new Mobile(0, "Vivo", "V5s", null);
		Mobile mobile2 = new Mobile(0, "One Plus", "7 Pro", null);
		
		Vehicle vehicle1 = new Vehicle(0, "activa", null);
		Vehicle vehicle2 = new Vehicle(0, "amaze", null);
		Vehicle vehicle3 = new Vehicle(0, "tovera", null);
		
		Employee employee = new Employee();
		employee.setEname("Hinal");
		employee.setAddress(address);
		employee.getMobile().add(mobile1);
		employee.getMobile().add(mobile2);
		
		mobile1.setEmployee(employee);
		mobile2.setEmployee(employee);
		
		employee.getVehicle().add(vehicle1);
		employee.getVehicle().add(vehicle2);
		employee.getVehicle().add(vehicle3);
		
		/*entityManager.persist(address);
		entityManager.persist(vehicle1);
		entityManager.persist(vehicle2);
		entityManager.persist(vehicle3);
		entityManager.persist(employee);
		entityManager.persist(mobile1);
		entityManager.persist(mobile2);
		*/
		
		/*
		 Address address2 = entityManager.find(Address.class, 1);
		 address2.setStreet("Chala-Daman Road");
		 entityManager.persist(address2);
		*/
		Mobile mobile = entityManager.find(Mobile.class,7);
		entityManager.remove(mobile);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		emFactory.close();

	}

}
