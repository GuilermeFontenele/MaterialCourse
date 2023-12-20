package vetor;

import java.util.Scanner;

public class Vetor3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você vai digitar?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("NUMEROS NEGATIVOS");
		for (int i = 0; i < n; i++) {
		if(vect[i] < 0) {
			System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
