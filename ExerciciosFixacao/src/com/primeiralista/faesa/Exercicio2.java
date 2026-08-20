package com.primeiralista.faesa;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double somaGasolina, kmPorLitro;
		int kmInicial, kmFinal, kmPercorrido;
		
		// Cálculo da quilômetragem
		System.out.println("Quilômetragem Inicial: ");
		kmInicial = in.nextInt();
		System.out.println("Quilômetragem Final: ");
		kmFinal = in.nextInt();
		
		kmPercorrido = kmFinal - kmInicial;
		
		// Entrada quantidade de gasolina colocada e cálculo da quilômetragem por litro
		System.out.println("Quantos litros de gasolina foi colocado desde o início da viagem até o fim dela? ");
		somaGasolina = in.nextDouble();
		
		kmPorLitro = kmPercorrido/somaGasolina;
		
		// Exibição dos dados da viagem
		System.out.println("==========DADOS DA VIAGEM==========");
		System.out.printf("Quilômetragem total percorrida: %d%n", kmPercorrido);
		System.out.printf("Consumo total de gasolina no percurso: %.1f%n", somaGasolina);
		System.out.printf("Média de quilômetragem por litro de gasolina: %.1f%n", kmPorLitro);
		
		in.close();
		
	}

}
