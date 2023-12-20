package vetor;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Vetor2Product[] vect = new Vetor2Product[N];
		
		for (int i = 0; i < N; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Vetor2Product(name, price);
		}
		
		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / N;
		
		System.out.println(media);
		
		sc.close();
	}
}
