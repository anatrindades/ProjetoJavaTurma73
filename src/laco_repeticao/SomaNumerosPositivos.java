package laco_repeticao;

import java.util.Scanner;

public class SomaNumerosPositivos {

	public static void main(String[] args) {
		
		// Variavel
		int numero, soma = 0;
		
		// Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite números inteiros: ");
		System.out.println("(Digite o número 0 para encerrar o programa)\n");
		
		// Comando DO...WHILE 
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
		// += atualiza o valor da variavel com base na operação aritimética que nesse caso é o + que retorna os
		// números positivos	
			if (numero > 0) {
				soma += numero;
			}
		// != condição verifica se o valor digitado é diferente de zero, enquanto for verdadeiro continua lendo os
		// números.	
		} while (numero != 0);
		
		System.out.println("\nA soma dos números positivos é: " + soma);
	
	}

}
