package forr;

import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores

public class For9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o numero: ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
