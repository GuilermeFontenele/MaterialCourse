package forr;

import java.util.Scanner;

//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"

public class For6 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva quantos numeros: ");
		int N = sc.nextInt();
		double divisao = 0;
		
		for (int i = 1; i <= N; i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			
			if(num2 == 0) {
				System.out.println("divisao impossivel");
			}else{
				divisao = num1 / num2;
				System.out.println(divisao);
				}
		}
		
		sc.close();
		
	}
}
