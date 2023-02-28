package application;

import entities.Client;

public class Main {

	public static void main(String[] args) {
		Client c1 = new Client("Viny", "viny@hotmail.com");
		Client c2 = new Client("Sales", "sales@hotmail.com");
		Client c3 = new Client("Viny", "viny@hotmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1 == c2);

	}

}
