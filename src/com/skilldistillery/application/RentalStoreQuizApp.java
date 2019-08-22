package com.skilldistillery.application;

import java.util.Set;

import com.skilldistillery.entities.Customer;
import com.skilldistillery.entities.Film;
import com.skilldistillery.entities.Store;

public class RentalStoreQuizApp {

	public static void main(String[] args) {
		RentalStoreQuizApp rents = new RentalStoreQuizApp();

		// We are creating a film rental store application. 
		// The store can have any number of unique customers.
		
		// create a store instance
		Store s = rents.createStore();

		// Fred Flintstone is excited to join the store as a Customer.
		// Create Fred Flintstone as a customer
		Customer ct = rents.createCustomer("Fred", "Flintstone");

		// Fred rents the movie: "Booleans: even if you are wrong, you are only off by a bit"
		//  ... add the film to Fred's collection of rentals
		ct.addRental(new Film("Booleans: even if wrong, you're only off by a bit"));
		
		// ... and register Fred Flintstone as a member of the store's unique customers
		rents.registerCustomerAtStore(s, ct);
		
		// Elmer Fudd is excited to join the store as a Customer.
		// Create Elmer Fudd as a customer
		Customer ct2 = rents.createCustomer("Elmer", "Fudd");

		// ... and register Elmer Fudd as a member of the store's unique customers
		rents.registerCustomerAtStore(s, ct2);
		
		// display all customer information at this store:
		rents.displayData(s);
	}

	public Store createStore() {
		// TODO: implement the method
		return null;
	}

	public Customer createCustomer(String fn, String ln) {
		// TODO: implement the method
		return null;
	}

	public void registerCustomerAtStore(Store st, Customer ct) {
		// TODO: implement the method
		
	}
	
	public void displayData (Store s) {
		// TODO: implement the method
	
	}
}
