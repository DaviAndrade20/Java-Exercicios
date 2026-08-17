package fundamentos;

import java.util.Scanner;

public class QuintoExercicio {

	public static void main(String[] args) {
		// Produto de dois numeros
		Scanner entrada = new Scanner(System.in);
		int num1, num2, product;
		
		System.out.print("Input first number: ");
		num1 = entrada.nextInt();
		
		System.out.println("Input second number: ");
		num2 = entrada.nextInt();
		
		product = num1*num2;
		System.out.printf("%d x %d = %d", num1, num2, product);
		
		entrada.close();

	}

}
