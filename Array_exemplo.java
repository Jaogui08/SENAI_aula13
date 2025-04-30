package Projetos_LPA.aula13;

import java.util.Scanner;

public class Array_exemplo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i=0; i<=4; i++) {
			System.out.print("Informe o " + (i+1) + "° número: ");
			num[i] = scanner.nextInt();
		}
		System.out.println("\nValores recebidos: \n");
		
		for (int i=0; i<=4; i++) {
			System.out.println((i+1) + "° número: " + num[i]);
		}
		scanner.close();

	}

}
