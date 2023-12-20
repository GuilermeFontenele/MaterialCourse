package forr;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva quantos numeros: ");
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Escreva o numero: ");
			int X = sc.nextInt();
			soma = soma + X;
		}
		System.out.println("A soma é: " + soma);
		
		sc.close();
	}
}
