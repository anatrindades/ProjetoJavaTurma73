package laco_repeticao;

import java.util.Scanner;

public class IdadeDePessoas {

	public static void main(String[] args) {
		
		//Variavel
		int menor = 0, maior = 0, idade;

		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite idades diferentes para saber menores de 21 e maiores de 50 anos: ");
		System.out.println("(Digite uma idade negativa para encerrar o programa)\n");
		
		//Comando While = Enquanto a idade for de acordo com as regras citadas abaixo com o if o programa irá pedir 
		//para digitar uma idade
		while (true) {
			System.out.print("\nDigite uma idade: ");
			idade = leia.nextInt();
			
			if (idade < 0) {
				break;
			}
			
			if (idade < 21) {
				menor++;
			} else if (idade > 50) {
				maior++;
			}
		}
		
		System.out.println("\n Total de pessoas menores de 21 anos: " + menor );
		System.out.println("\n Total de pessoas maiores de 50 anos: " + maior);
	}

}
