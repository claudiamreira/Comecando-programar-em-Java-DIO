package loops;

import java.util.Scanner;

public class Ex2_Nota {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Digite a nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota Inválida! Digite novamente: ");
			nota = scan.nextInt();
		}
		
		System.out.println("Obrigada! Até logo.");
	}

}
