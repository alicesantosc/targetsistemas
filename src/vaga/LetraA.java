package vaga;

import java.util.Scanner;

public class LetraA {

	public static int contandoLetrasA(String input) {

		int quantidadeA = 0;
		String letras = input.toLowerCase();

		for (int i = 0; i < letras.length(); i++) {
			if (letras.charAt(i) == 'a') {
				quantidadeA++;
			}
		}
		
		return quantidadeA;
	
	}
	
	public static void resultado(int quantidadeA) {
		System.out.println("Há " + quantidadeA + " letras A" );
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o texto: ");
		String input = scanner.nextLine();
		
		
		int quantidadeA = contandoLetrasA(input);
		resultado(quantidadeA);
		scanner.close();
		
	}

}
