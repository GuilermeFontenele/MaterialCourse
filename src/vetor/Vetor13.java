package vetor;

import java.util.Scanner;

public class Vetor13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		char[]genero = new char[n];
		double[]altura = new double[n];
		double maior = 0;
		double menor = 0;
		double somaF = 0;
		double mediaF = 0;
		double contadorF = 0;
		int contadorM = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		menor = altura[0];
	    maior = altura[0];

	    for (int i=1; i<n; i++) {
	        if (altura[i] > maior) {
	            maior = altura[i];
	        }
	        if (altura[i] < menor) {
	            menor = altura[i];
	        }
	    }
		
	    for (int i = 0; i < n; i++) {
			if(genero[i] == 'F') {
				somaF += altura[i];
				++contadorF;
			}else {
				++contadorM;
			}
		}
	    
	    
		mediaF = somaF / contadorF;
		
		System.out.printf("Menor altura = %.2f\n", menor);
	    System.out.printf("Maior altura = %.2f\n", maior);
	    System.out.printf("Media das alturas das mulheres = %.2f\n", mediaF);
	    System.out.printf("Numero de homens = %d\n", contadorM);
		
		sc.close();
	}
}
