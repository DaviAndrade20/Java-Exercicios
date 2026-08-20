package com.primeiralista.faesa;

/* Faça um programa que leia o nome de um piloto, uma distância percorrida em km e o tempo que o piloto
 * levou para percorrê-la (em horas). O programa deve calcular a velocidade média em km/h, e exibir a
 * seguinte frase: A velocidade média de XX foi YY km/h, onde XX é o nome do piloto, e YY é a velocidade média. 
 */


import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Declarção de variáveis
		String nome;
		int distancia, tempo, velocidadeMedia;
		
		// Entrada de dados
		System.out.println("Qual o nome do piloto: ");
		nome = entrada.nextLine();
		System.out.println("Qual a distância percorrida: ");
		distancia = entrada.nextInt();
		System.out.println("Qual o tempo percorrido: ");
		tempo = entrada.nextInt();
		
		// Cálculo e exibição de resultado
		velocidadeMedia = distancia/tempo;
		
		System.out.printf("A velocidade média de %s foi %dkm/h", nome, velocidadeMedia);
		
		
		entrada.close();
	}

}
