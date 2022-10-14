package tarefa_wrapper;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		Scanner numericValue = new Scanner(System.in);
		System.out.println("Enter a numeric value: ");
		
		long number = numericValue.nextLong();
		
		Long number_wrapper = Long.valueOf(number);
		
		System.out.print(number_wrapper);

	}

}
