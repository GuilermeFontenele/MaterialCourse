package vetor;

import java.util.Scanner;

public class Vetor12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serao digitados?");
		int n = sc.nextInt();
		double[]vect1 = new double[n];
		double[]vect2 = new double[n];
		double[]soma = new double[n];
		double[]media = new double[n];
		String[]nome = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "aluno:");
			nome[i] = sc.next();
			vect1[i] = sc.nextDouble();
			vect2[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			soma[i] = vect1[i] + vect2[i];
		}
		
		for (int i = 0; i < n; i++) {
			media[i] = soma[i] / 2;
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			if(media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}
}
