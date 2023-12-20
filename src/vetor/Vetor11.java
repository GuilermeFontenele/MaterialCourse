package vetor;

import java.util.Scanner;

public class Vetor11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[]vect1 = new String[n];
		int[]vect2 = new int[n];
		int maisVelha;
		int maiorIdade;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.println("Nome: ");
			vect1[i] = sc.next();
			System.out.println("Idade: ");
			vect2[i] = sc.nextInt();
		}
		
		maiorIdade = vect2[0];
	    maisVelha = 0;
	    
		for (int i = 1; i < n; i++) {
			if(vect2[i] > maiorIdade) {
				maiorIdade = vect2[i];
				maisVelha = i;
			}
		}
		System.out.println(maisVelha);
		System.out.printf("PESSOA MAIS VELHA: %s\n", vect1[maisVelha]);
		
		sc.close();
	}
}
