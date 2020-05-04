package javaOOP;

public class Cat extends Animal {

	public Cat() {
		super();
		declawed = true;
	}

	private boolean declawed;

	public boolean isDeclawed() {
		return declawed;
	}

	public void setDeclawed(boolean declawed) {
		this.declawed = declawed;

		if (!declawed)
			setDeclawed(true);
	}

	// Over ride method of the toString Object class method.
	public String toString() {
		String toReturn = super.toString();
		toReturn += "\nThe Cat is declawed: " + isDeclawed();
		return toReturn;
	}
}
