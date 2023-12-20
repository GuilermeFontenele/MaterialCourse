package forr;

import java.util.Scanner;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
//peso 5

public class For5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva quantos numeros: ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Escreva o numero: ");
			double num1 = sc.nextDouble();
			System.out.println("Escreva o numero: ");
			double num2 = sc.nextDouble();
			System.out.println("Escreva o numero: ");
			double num3 = sc.nextDouble();
			
			double media = ((num1 * 2) + (num2 * 3) + (num3 * 5))/10;
			System.out.printf("%.1f\n", media);
		}
		
		sc.close();
		
	}
}
