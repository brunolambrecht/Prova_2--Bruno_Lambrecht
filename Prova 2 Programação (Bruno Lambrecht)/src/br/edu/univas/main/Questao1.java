package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float[] contasA = new float[12];
		float[] contasB = new float[12];	
		
		float menor = 0;
		float maior = 0;
		float soma = 0;
		
		float menorB = 0;
		float maiorB = 0;
		float somaB = 0;
		int contador = 0;
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite o valor da conta do marador A:");
			float contaA = sc.nextInt();
			contasA[i] = contaA;
		
			if (i == 0) {
				menor = contaA;
				maior = contaA;
			} else if (contaA < menor) {
				menor = contaA;
			} else if (contaA > maior) {
				maior = contaA;
			}
			
			soma += contasA[i];
			contador++;
		}
		int contadorB = 0;
		for (int j = 0; j < 12; j++) {
			System.out.println("");
			System.out.println("Digite o valor da conta do morador B:");
			float contaB = sc.nextInt();
			contasB[j] = contaB;
		
			if (j == 0) {
				menorB = contaB;
				maiorB = contaB;
			} else if (contaB < menorB) {
				menorB = contaB;
			} else if (contaB > maiorB) {
				maiorB = contaB;
			}
			
			somaB += contasB[j];
			contadorB++;
		}
		
		
		System.out.println("Menor conta do morador A é: "+menor);
		System.out.println("Maior conta do morador A é: "+maior);
		float media = soma / contador;
		System.out.println("A média do morador A é: " + media);

		System.out.println("Menor conta do morador A é: "+menorB);
		System.out.println("Maior conta do morador A é: "+maiorB);
		float mediaB = somaB / contadorB;
		System.out.println("A média do morador A é: " + mediaB);
		
		sc.close();
	}

}
