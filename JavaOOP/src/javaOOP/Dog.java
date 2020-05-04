package javaOOP;

/**
 * 
 * @author Shawn Forrest
 * @since 2020-04-30
 * @version 1.0
 * 
 *          This class created called Dog is a representation of the type of
 *          dog. The Dog class is a blueprint or template that describes the
 *          details of the dog object.
 *
 */

// class Dog is a blueprint for a Dog object 
public class Dog extends Animal {

	public Dog() {
		super();
		therapyWork = true;

	}

	private boolean therapyWork;

	public boolean isTherapyWork() {
		return therapyWork;
	}

	public void setTherapyWork(boolean therapyWork) {
		this.therapyWork = therapyWork;

		if (!therapyWork)
			setTherapyWork(true);
	}

	// Over ride method of the toString Object class method.
	public String toString() {
		String toReturn = super.toString();
		toReturn += "\nThe dog is a therapy/work animal: " + isTherapyWork();
		return toReturn;
	}
}
