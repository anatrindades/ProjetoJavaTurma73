package introducao;

import java.util.Scanner;

public class EntradaSaida {
	
	public static void main(String[] args) {
		
		//Variáveis
		String nome = "Giovanna";
		int idade;
				
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira o sua idade: ");
		idade = leia.nextInt();
		
		// concatenação: juntar um texto com 1 ou ais variaveis/constantes
		// Saída de Dados
		System.out.println("Bom dia, " + nome);
		System.out.println("A sua idade é " + idade + " anos.");
		
	}

}
