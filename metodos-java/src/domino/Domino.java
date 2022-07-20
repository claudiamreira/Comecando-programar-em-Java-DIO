package domino;

import java.util.Scanner;

public class Domino {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		
		System.out.println((n+1) * (n+2) / 2);
		
	}
	
}
