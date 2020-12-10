package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	int get_itemsReceived() {
		return itemsReceived;
	}
	
	void set_itemsReceived(int value) {
		if (value < 0) {
			itemsReceived = 0;
		}
		else {
			itemsReceived = value;
		}
	}
	
	float get_degreesTurned() {
		return degreesTurned;
	}
	
	void set_degreesTurned(float value) {
		if (value < 0) {
			degreesTurned = 0;
		}
		else if (value > 360) {
			degreesTurned = 360;
		}
		else {
			degreesTurned = value;
		}
	}

	String get_nomenclature() {
		return nomenclature;
	}
	
	void set_nomenclature(String value) {
		if (value.equals("")) {
			nomenclature = " ";
		}
		
		else {
			nomenclature = value;
		}
	}
	
	
	Object get_memberObj() {
		return memberObj;
	}
	
	void set_memberObj(Object value) {
		if (value instanceof String) {
			memberObj = new Object();
		}
		
		else {
			memberObj = value;
		}
	}
	
	public static void main(String[] args) {
		
	}
}
