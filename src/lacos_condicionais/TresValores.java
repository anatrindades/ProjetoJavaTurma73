package lacos_condicionais;

import java.util.Scanner;

public class TresValores {

	public static void main(String[] args) {
		
		//Variáveis
		int nA, nB, nC, soma;
		
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		nA = leia.nextInt();
		
		System.out.println("Digite o número B ");
		nB = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		nC = leia.nextInt();
		
		//Soma de adição
		soma = nA + nB;
		
		//Comando if else para saber se a Soma é maior ou menor que o número em C
		if (soma > nC) {
			System.out.println("A soma de A + B é Maior que C");
		}else if (soma < nC) {
			System.out.println("A Soma de A + B é Menor que C");
		}else { 
			System.out.println("A Soma de A + B é igual a C");
			
		}
		
	}

}
