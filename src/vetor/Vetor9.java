package vetor;

import java.util.Scanner;

public class Vetor9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[]vect = new double[n];
		double media = 0;
		double soma = 0;
		
		System.out.println("Digite os valores do vetor: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o numero " + (i + 1) + ": ");
			vect[i] = sc.nextDouble();			
		}
		
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		media = soma / n;
		
		System.out.println("Elementos abaixo da media: ");
		for (int i = 0; i < n; i++) {
			if(vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
