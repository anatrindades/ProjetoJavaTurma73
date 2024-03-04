package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		// Vetor
		String cachorros[] = new String[3];
		// int numeros[] =  new int[5];
		
		Scanner leia = new Scanner(System.in);
		int indice;
		
		// Guarda os nomes
		for (indice = 0; indice < 3; indice++) {
			
			//sysout e pressionar CTRL + Espaço
			System.out.println("Digite o " + (indice + 1) + " ° nome:");
			cachorros [indice] = leia.nextLine();
		}
		
		// cachorros.length = 3
		
		// Lista os nomes
		for(indice = 0; indice < cachorros.length; indice++) {
			System.out.println("cachorro [" + indice + "] " + cachorros[indice]);			
		}
		
		leia.close();
	}
	
}
