package introducao;

import java.util.Scanner;

public class SomaNota {

	public static void main(String[] args) {
		
		//Variaveis
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float MediaFinal;
		
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		System.out.println("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Nota 4: ");
		nota4 = leia.nextFloat();

		//Soma de notas e divisão das mesmas para Média Final
		MediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Media final: %.1f ", MediaFinal);
				
				
	}

}
