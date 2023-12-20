package vetor;

import java.util.Scanner;

public class Vetor10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[]vect = new double[n];
		double mediaPar = 0;
		double somaPar = 0;
		double quantidadePar = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Escreva o numero: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			if(vect[i] % 2 == 0) {
				somaPar += vect[i];
				++quantidadePar;
			}
		}
		
		mediaPar = somaPar / quantidadePar ;
		
		if(quantidadePar == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			System.out.println("MEDIA DOS PARES = " + mediaPar);		
		}

		sc.close();
	}
}
