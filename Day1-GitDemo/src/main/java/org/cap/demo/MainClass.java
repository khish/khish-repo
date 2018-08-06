package org.cap.demo;

public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");
		greet();
		SalesClass class1 = new SalesClass();
		System.out.println("Displaying Sales:");
		class1.show();
		Print p = new Print();
		p.print();
		
	}
	
	public static void greet() {
		System.out.println("Hello");
		System.out.println("Welcome");
		System.out.println("To");
		System.out.println("Git");
		System.out.println("Repository");
		
	}

}
