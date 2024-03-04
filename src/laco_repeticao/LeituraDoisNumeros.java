package laco_repeticao;

import java.util.Scanner;

public class LeituraDoisNumeros {

	public static void main(String[] args) {
		
	    //Variavel
		int primeiroNumero, ultimoNumero, intervalo;
		
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		primeiroNumero = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo");
		ultimoNumero = leia.nextInt();
		
		//Comando if para saber se o primeiro número é maior ou igual ao último
		if (primeiroNumero >= ultimoNumero) {
		
		    //Se isso for confirmado, irá retornar com a seguinte mensagem
			System.out.println("Intervalo inválido!");
			System.exit(0);
		}
		
		System.out.println("\n No intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");
		
		//Comando for para receber o valor do primeiro número, verificar se o mesmo é menor ou igual ao ultimoNumero
		//e somar + 1 a cada atualização de acordo com os números informados
		for (intervalo = primeiroNumero; intervalo <= ultimoNumero; intervalo++) {
			if (intervalo % 3 == 0 && intervalo % 5 == 0) {
				System.out.println(intervalo + " é multiplo de 3 e 5");
			}
		}
		
	}

}
