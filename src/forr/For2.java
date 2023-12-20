package forr;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola");
		
		for (int i = 4; i >= 0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		sc.close();
	}
}
