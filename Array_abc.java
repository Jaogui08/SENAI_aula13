package Projetos_LPA.aula13;

import java.util.Scanner;

public class Array_abc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] valor1 = new int[5];
		int[] valor2 = new int[5];
		int[] valor3 = new int[10];
		
		for (int i=0; i<=4; i++) {
			System.out.print("Informe o " + (i+1) + "° valor do vetor A: ");
			valor1[i] = scanner.nextInt();
		}	
			
		System.out.println(" ");
		for (int i=0; i<=4; i++) {
			System.out.print("Informe o " + (i+1) + "° valor do vetor B: ");
			valor2[i] = scanner.nextInt();
		}
		
		for (int i=0; i<=4; i++) {
			valor3[i] = valor1[i];
			valor3[i+5] = valor2[i];
		}
		
		System.out.println("\nVetor A: ");
		for (int i=0; i<=4; i++) {
			System.out.println((i+1) + "° valor do vetor A: " + valor1[i]);
		}
		System.out.println("\nVetor B: ");
		for (int i=0; i<=4; i++) {
			System.out.println((i+1) + "° valor do vetor B: " + valor2[i]);
		}
		System.out.println("\nVetor C: ");
		for (int i=0; i<=9; i++) {
			System.out.println((i+1) + "° valor do vetor C: " + valor3[i]);
		}
		scanner.close();
	}

}
