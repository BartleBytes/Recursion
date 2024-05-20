

	import java.util.Scanner;

	public class RecursiveProduct {
	    
	    // Recursive method to calculate the product of elements in the array
	    public static int product(int[] numbers, int index) {
	        // Base case: if index is 0, return the first element
	        if (index == 0) {
	            return numbers[0];
	        } 
	        // Recursive case: multiply current element with the product of the previous elements
	        else {
	            return numbers[index] * product(numbers, index - 1);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[5];

	        // Prompt user to enter five numbers
	        System.out.println("Enter five numbers:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Number " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        // Calculate the product of the numbers using the recursive method
	        int result = product(numbers, numbers.length - 1);
	        
	        // Display the result
	        System.out.println("The product of the entered numbers is: " + result);
	        
	        scanner.close();
	    }
	}


