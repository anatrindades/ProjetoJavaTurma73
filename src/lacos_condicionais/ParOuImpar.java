package lacos_condicionais;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		//Variáveis
		int num;
		
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		//Comando if else para saber se o número é par ou ímpar, positivo ou negativo
		if (num % 2 == 0 && num >= 0) {
			System.out.println("O número " + num + " é par e positivo!");
		}else if (num % 2 == 0 && num < 0 ) {
			System.out.println("O número " + num + " é par e negativo!");
		}else if (num % 2 == 1 && num >= 0) {
			System.out.println("O número " + num + " é impar e positivo!");
		}else {
			System.out.println("O número " + num + " é ímpar e negativo!");
		}

	}

}
