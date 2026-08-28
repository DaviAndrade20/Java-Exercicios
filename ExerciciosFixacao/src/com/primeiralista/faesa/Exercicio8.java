package com.primeiralista.faesa;

// Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		System.out.println("Antecessor: " + (num - 1));
		System.out.println("Sucessor: " + (num + 1));
		
		
		entrada.close();

	}

}
