package loops;

import java.util.Scanner;

public class Ex4_ImparPar {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		System.out.println("Digite a quantidade de numeros: ");
		quantNumeros = scan.nextInt();
		
		int count = 0;
		
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) quantPares++;
			else quantImpares++;
			
			count ++;
			
		} while (count < quantNumeros);
		
		System.out.println("Quantidade par: " + quantPares);
		System.out.println("Quantidade ímpar: " + quantImpares);
		
	}

}
