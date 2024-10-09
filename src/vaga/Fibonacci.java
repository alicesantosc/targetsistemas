package vaga;

import java.util.Scanner;

public class Fibonacci {
	
	public static int funcaoFibonacci(int num) {
		if(num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		}
		
		
		int seq0 = 0, seq1 = 1;
		int seqN = 0;
		int i = 2;	
		
		while(i<=num) {
			seqN = seq0 + seq1;
			seq0 = seq1;
			seq1 = seqN;
			i++;
		}
		
		
		return seqN;
		
	}
	
	public static boolean verificandoFibonacci(int num) {
		int i= 0;
		int valorFib;
		
		while(true) {
			valorFib= funcaoFibonacci(i);
			if(valorFib==num) {
				return true;
			} else if ( valorFib > num) {
				return false;
			}
			
			i++;
		}
	
	}
	
		public static void main(String[] args) {		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			int num = scanner.nextInt();
			scanner.close();
			
			if(verificandoFibonacci(num)) {
				System.out.println("Pertence a sequência fibonacci");
			}else {
				System.out.println("Não pertence a sequência fibonacci");
			}
			
			
			
	}

}
