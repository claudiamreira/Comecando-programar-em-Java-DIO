package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String [] args ) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digte o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + subtracao);
		System.out.println("A multiplicação é: " + multiplicacao);
		System.out.println("A divisão é: " + divisao);
		
	}
	
	public static int soma (int a, int b) {
		return a + b;
	}
	
	public static int subtracao (int a, int b) {
		return a - b;
	}
	
	public static float divisao (float a, float b) {
		return a / b;
	}
	
	public static int multiplicacao (int a, int b) {
		return a * b;
	}
}
