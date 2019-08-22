package com.skilldistillery.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Store {
	// TODO: each store has an id
	private int storeID; 
	
	// TODO: each store has 0 or more unique Customers
	private int customersNumb;
	
	// TODO: implement the required methods to:
	
	public Customer(int id, int customersNumb, String firstName, String lastName) {
		this.id = id;
		this.customersNumb = customersNumb;
		this.firstName = firstName;
		this.lastName = lastName;
		numCustomers++;
		rentals = new ArrayList<>();
	}

	public Customer() {}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getCustomersNumb() {
		return customersNumb;
	}
	
	public void setCustomersNumb() {
		this.customersNumb = customersNumb;
	}
	
	public void addRental( Film f) {
		this.rentals.add(f);
	}

	public List<Film> getRentals() {
		return new ArrayList<>(rentals);
	}

	public void setRentals(List<Film> rentals) {
		this.rentals.addAll(rentals);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customers number = " + customersNumb + " ,id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", rentals=" + rentals
				+ "]";
	}
	//       * Add a customer (no duplicates allowed)
	//       * Return the number of customers
	//       * Display all data
}
