package calculator;

public class NewCalculator {

	private int result;
	
	public int add(int firstNumber, int secondNumber) {
		result = firstNumber + secondNumber;
		return result;
	}
	
	//I can do method overloading and make it possible
	
	
	//Overloading existing add method with additional parameter to support addition of 3 integers.
	//method name is same
	//return type is same
	//access modifier is same
	public int add(int firstNumber, int secondNumber, int thirdNumber) {
		result = firstNumber + secondNumber + thirdNumber;
		return result;
	}
	
	//Overloading existing add method with new type of parameters to support addition of 2 decimals.
	//method name is same
	//return type changes to double
	//access modifier is same
	public double add(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	//In order to call a method as overloaded, method name must be same in all overloaded methods
	//Difference can be return type of a method
	//Number of parameters can be different
	//Data type of parameters can be different
	
	
	
	
	
}
