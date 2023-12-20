package vetor;

import java.util.Scanner;

public class Vetor5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[]nome = new String[n];
		int[]idade = new int[n];
		double[]altura = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("idade: ");
			idade[i] = sc.nextInt();
			System.out.print("altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double somaAlt = 0;
		
		for (int i = 0; i < n; i++) {
			somaAlt += altura[i];
		}
		double mediaAlt = somaAlt / n;
		
		int nmenores = 0;
		for (int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				++nmenores;
			}
		}
		System.out.println(nmenores);
		double percentualMenores = ((double)nmenores / (double)n) * 100.0;
		
		System.out.println("altura media = " + mediaAlt);
		System.out.println("pessoas com menos de 16 anos:  " + percentualMenores);
		
		for(int i=0; i<n; i++) {
	        if (idade[i] < 16) {
	        	System.out.printf("%s\n", nome[i]);
	        }
	    }
		
		sc.close();
	}
}



