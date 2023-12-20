package vetor;

import java.util.Scanner;

public class Vetor4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0; 
		int[] vect = new int[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		int media = soma / n;

		System.out.print("VALORES = ");

	    for (int i=0; i<n; i++) {
	    	System.out.print(vect[i] + " ");
	    }

	    System.out.println("\nSOMA = " + soma);
	    System.out.println("MEDIA = " + media);

		sc.close();
	}
}
