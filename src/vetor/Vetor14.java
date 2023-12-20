package vetor;

import java.util.Scanner;

public class Vetor14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Vetor14Product[] v = new Vetor14Product[10];
		
		System.out.println("Escreva quantidade de quartos: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Cadastro #"+ (1+i) +":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int numero = sc.nextInt();
			
			v[numero] = new Vetor14Product(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if(v[i] != null) {
				System.out.println(i + ":" + v[i]);
			}
		}
		
		sc.close();
	}
}
