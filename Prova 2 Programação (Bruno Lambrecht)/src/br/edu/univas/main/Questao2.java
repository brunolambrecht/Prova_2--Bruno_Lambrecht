package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nota = new int[7];
		int notas = 0;
		
		
		
		do {
			System.out.println("Digite as notas");
			notas = sc.nextInt();

			if (notas == 1) {
				System.out.println("Dó");
			}else if (notas == 2) {
				System.out.println("Ré");
			}else if (notas == 3) {
				System.out.println("Mi");
			}else if (notas == 4) {
				System.out.println("Fa");
			}else if (notas == 5) {
				System.out.println("Sol");
			}else if (notas == 6) {
				System.out.println("La");
			}else if (notas == 7) {
				System.out.println("Si");
			} else if (notas == 0) {
				break;
			}
			
		}while (true);
		
		sc.close();
	}

}
