package com.segundalista.faesa;


/* Construa um algoritmo que leia dois números inteiros e verifique se a divisão seja indeterminada
 * (denominador igual a zero). Em caso afirmativo, imprima
 *  contrário, imprima o resultado da divisão. Considere a divisão do primeiro pelo segundo.
 */
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite um número: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite um outro número: ");
		num2 = scan.nextInt();
		
		if(num2 == 0) {
			System.out.println("A divisão é indeterminada.");
		} else {
			System.out.println(num1/num2);
		}
		
		scan.close();

	}

}
