package com.primeiralista.faesa;

/* Realizarei uma viagem de vários dias em meu automóvel, e gostaria de saber a quilometragem média por
 * litro de gasolina. Para isto, anotarei a quilometragem no velocímetro ao sair de viagem, e depois ao chegar.
 * Também vou somar toda a gasolina que comprar para o carro. Você poderia fazer um programa que me
 * desse, com estes dados, quantos km fiz, em média, por litro de gasolina? 
 */


import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double somaGasolina, kmPorLitro;
		int kmInicial, kmFinal, kmPercorrido;
		
		// Cálculo da quilômetragem
		System.out.println("KM Inicial: ");
		kmInicial = in.nextInt();
		System.out.println("KM Final: ");
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
