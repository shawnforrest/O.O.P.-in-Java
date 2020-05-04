package javaOOP;

/**
 * 
 * @author Shawn Forrest
 * @since 2020-04-30
 * @version 1.0
 * 
 *          The Animal class is the Super class for all the other classes. All
 *          the other classes will implement inheritance to be able to inherit
 *          the Animal class: Attributes and Methods. Inheritance is great for
 *          code reusing code. It makes the application cleaner and more
 *          understandable.
 *
 */

// class Animal is the super class or parent class, but it does
// also extend the Object class in java.
// the Object class is the super class for all java applications.
public class Animal {

	// create a constructor method for the Animal class.
	// constructor initializes or creates the object.
	public Animal() {
		breed = "-------";
		color = "-------";
		weight = -1;
	}

	// attributes for the Animal class. These attributes are also
	// available to all the sub classes or child classes through the
	// extends keyword.
	// this is an example of a technique called encapsulation where we
	// hide the attributes in this class and use public methods(getters/setters)
	// to retrieve the attributes from other classes.
	private String breed;
	private String color;
	private int weight;

	// getters and setters are used for the child classes to be able
	// to access the private attributes of the Animal class.
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		// this. is a keyword used so java understands that the
		// private attribute is what we are referring to.
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// This method is an example of dynamic polymorphism.
	// This is another technique used in OOP and what it does is
	// over rides the toString method from the Object class.
	public String toString() {
		String toReturn = getBreed();
		toReturn += "\n" + getBreed() + " color: " + getColor();
		toReturn += "\n" + getBreed() + " weight: " + getWeight() + " pounds";

		return toReturn;
	}
}
