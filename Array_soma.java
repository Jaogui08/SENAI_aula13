package Projetos_LPA.aula13;

import java.util.Scanner;

public class Array_soma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5];
		int soma = 0;
		
		for (int i=0; i<=4; i++) {
			System.out.print("Informe o " + (i+1) + "° número: ");
			nums[i] = scanner.nextInt();
			soma = soma+nums[i];
		}
		if (soma > 15) {
			System.out.println("A soma foi maior que 15 com um resultado: " + soma);
		}
		scanner.close();
	}

}
