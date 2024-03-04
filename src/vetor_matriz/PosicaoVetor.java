package vetor_matriz;

import java.util.Scanner;

public class PosicaoVetor {

	public static void main(String[] args) {
		
		//Vetor
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		int posicao = 0, valor;
				
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		valor = leia.nextInt();
		
		//Percorre o Vetor para encontrar o número
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			 
			 if (vetorInteiros[indice] == valor) {
				 posicao = indice;
				 break;				 
			 }
		}
		
		//Mostra o resultado para o usuário
		if (posicao != -1) {
			System.out.println("\nO número " + valor + " está localizado na posição " + posicao);
		}else {
			System.out.println("\nO número " + valor + " não foi encontrado!");
		}
		
		leia.close();
	}

}
