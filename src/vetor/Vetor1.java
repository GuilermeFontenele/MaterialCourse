package vetor;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		
		double[] vect = new double[N];
		
		for (int i = 0; i < N; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			soma += vect[i];
		}
		double media = soma / N;
		
		System.out.println(media);
		
		sc.close();
	}
}