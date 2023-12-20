package vetor;

import java.util.Scanner;

public class Vetor8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[]vect1 = new int[n];
		int[]vect2 = new int[n];
		int[]vectR = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o numero " + (i + 1) + ": ");
			vect1[i] = sc.nextInt();			
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o numero " + (i + 1) + ": ");
			vect2[i] = sc.nextInt();			
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < n; i++) {
			vectR[i] = vect1[i] + vect2[i];
			System.out.println(vectR[i]);
		}
		
		sc.close();
	}
}
