package vetor;

import java.util.Scanner;

public class Vetor6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]vect = new int[n];
		int numPares = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if(vect[i] % 2 == 0) {
				++numPares;
			}
		}
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(" " + vect[i]);
			}
		}
		System.out.println("\nQUANTIDADE DE NUMEROS PARES = " + numPares);
		
		sc.close();
	}
}
