 package forr;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
//exemplo

public class For8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o numero: ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.print(i * i * i);
			System.out.println();
		}
		sc.close();
	}
}
