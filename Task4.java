Q1) Array Exception

package exceptionDemo;

public class ArrayExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Accessing array elements:");
            // Intentionally going beyond array length
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access an index beyond the array length!");
        }
    }

	}

output: Element at index 2: 30
Element at index 3: 40
Element at index 4: 50
Exception caught: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
You tried to access an index beyond the array length!

Q2) Customer exception 

package exceptionDemo;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
    public class CustomExceptionDemo {

       
        static void checkAge(int age) throws MyCustomException {
            if (age < 18) {
                throw new MyCustomException("Age is less than 18. Access denied!");
            } else {
                System.out.println("Access granted for age " + age);
            }
        }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] ages = {15, 20, 17};

	        for (int age : ages) {
	            try {
	                checkAge(age);
	            } catch (MyCustomException e) {
	                System.out.println("Custom Exception Caught: " + e.getMessage());
	            }
	        }
	    }
	}
}


Output: Custom Exception Caught: Age is less than 18. Access denied!
Access granted for age 20
Custom Exception Caught: Age is less than 18. Access denied!
