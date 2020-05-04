package javaOOP;

import java.util.Scanner;

/**
 * 
 * @author Shawn Forrest
 * @since 2020-04-30
 * @version 1.0
 * 
 *          This is a demonstration of Object Oriented Programming using Java.
 *          OOP is based real world object like in our case a Dog and putting
 *          the information into the computer. Each object is an instance of a
 *          class. The object is a real world entity such as a Dog, Cat, Person,
 *          etc. The different techniques of OOP in java are: -Inheritance:
 *          super and sub classes(extends) -Polymorphism: dynamic(overriding)
 *          and static(overloading) -Objects -Classes -Encapsulation -Interface
 *          -Abstraction There are many more but these are just some techniques
 *          used in OOP. It is great for code reuseablility.
 * 
 * 
 *
 */

// class Main will execute all the code.
public class Main {
	// the Main method is where the application will run.
	// this is where we will call the Dog class.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What type object would you like to create: ");
		System.out.println("1.) Animal\n2.) Dog\n3.) Cat");
		System.out.println("Just pick the number: ");
		int pick = Integer.parseInt(scan.nextLine());

		// Create a switch statement and depending on the user's input it will
		// execute that case block.
		switch (pick) {
		// Animal class
		case 1:
			// Creating an Animal object named a with the Animal constructor method.
			Animal a = new Animal();
			getAnimalInformation(a, scan);
			System.out.println(a);
			// break keyword to escape the switch statement
			break;
		case 2:
			Dog d = new Dog();
			getDogInformation(d, scan);
			System.out.println(d);
			break;
		case 3:
			Cat c = new Cat();
			getCatInformation(c, scan);
			System.out.println(c);
			break;
		default:
			System.out.println("The input you entered is invalid!");
		}

	}

	public static void getAnimalInformation(Animal a, Scanner scan) {

		// Get the breed of Animal
		System.out.println("Enter the type of Animal: ");
		a.setBreed(scan.nextLine());

		// Color of Animal
		System.out.println("What color is the Animal: ");
		a.setColor(scan.nextLine());

		// Weight of Animal
		System.out.println("What is the weight of the Animal in pounds: ");
		a.setWeight(Integer.parseInt(scan.nextLine()));

	}

	public static void getDogInformation(Dog d, Scanner scan) {

		// Call the Super Class to inherit the methods and attributes.
		// Example of Modularization!
		getAnimalInformation(d, scan);

		System.out.println("Is your dog a therapy/work dog (1 for yes or 2 for no): ");
		int choice = (Integer.parseInt(scan.nextLine().toLowerCase()));
		if (choice == 1)
			d.setTherapyWork(true);
		else
			d.setTherapyWork(false);
	}

	public static void getCatInformation(Cat c, Scanner scan) {

		getAnimalInformation(c, scan);

		System.out.println("Is your cat declawed (y for yes or n for no): ");
		char choice = scan.nextLine().toLowerCase().charAt(0);
		if (choice == 'y')
			c.setDeclawed(true);
		else
			c.setDeclawed(false);
	}

}
