package vetor;

import java.util.Scanner;

public class Vetor7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[]vect = new int[n];
		int maior = 0;
		int posmaior = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o numero " + (i + 1) + ": ");
			vect[i] = sc.nextInt();			
		}
		
		for (int i = 0; i < n; i++) {
			if (vect[i] > maior) {
		            maior = vect[i];
		            posmaior = i;
		        }
		}
		posmaior = posmaior + 1;
		
		System.out.print("Maior numero: " + maior);
		
		System.out.print("\nPosição do maior numero: " + posmaior);
		sc.close();
	}
}
