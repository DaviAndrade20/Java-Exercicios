package fundamentos;

import java.util.Scanner;

public class SextoExercicio {

	public static void main(String[] args) {
		// Operações aritméticas básicas
		Scanner entrada = new Scanner(System.in);
		int a, b;
		
		System.out.print("Input first number: ");
		a = entrada.nextInt();
		System.out.print("Input second number: ");
		b = entrada.nextInt();
		
		
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d x %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf(a + "mod" + b + " = " + (a%b));
		entrada.close();
		

	}

}
