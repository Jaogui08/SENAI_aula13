package Projetos_LPA.aula13;

import java.util.Scanner;

public class Array_nomes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nomes = new String[5];
		
		for (int i=0; i<=4; i++) {
			System.out.print("Informe o " + (i+1) + "° nome: ");
			nomes[i] = scanner.nextLine();
		}
		
		System.out.println("\nNomes recebidos:\n");
		
		for (int i=0; i<=4; i++) {
			System.out.println((i+1) + "° nome: " + nomes[i]);
		}
		scanner.close();
	}

}
