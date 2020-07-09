package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		double folhaA = 0;
		double folhaM = 0;
		double salario = 0;
		int countador = 0;
		
		System.out.println("Entre com os salarios dos seus funcionarios:\n");
		for (countador = 0; countador < 150; countador++) {

			salario = sc.nextDouble();
			folhaA = folhaA + salario;
			folhaM = salario + (salario * 0.15);
			
		}
		System.out.printf("A folha de pagamento de agora é de R$ %f", folhaA, "\nA folha de pagamento com aumento de 15% é R$%f", folhaM);
		sc.close();
	}

}
