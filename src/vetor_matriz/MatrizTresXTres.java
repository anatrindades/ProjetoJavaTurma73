package vetor_matriz;

import java.util.Scanner;

public class MatrizTresXTres {
	
	static final int linha = 3;
	static final int coluna = 3;

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		int[][] matrizInteiros = new int[linha][coluna];
		int diagonalPrincipal = 0;
		int diagonalSecundaria;
		
		// Comando For para percorrer as linhas da matriz e fazer a leitura 
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
		    System.out.println("Digite um valor para a posição: ");
		    matrizInteiros[i][j] = leia.nextInt();
		    }
		}
		
		// Apresentação
		System.out.println("\nMatriz:");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print("[" + matrizInteiros[i][j] + "]");
		    }
			System.out.println();
		}
		
		System.out.println("\nElementos da Diagonal Principal: " + matrizInteiros[0][0] + " " +  matrizInteiros[1][1] + " " + matrizInteiros[2][2]);
		
		System.out.println("Elementos da Diagonal Secundária: " + matrizInteiros[0][2] + " " +  matrizInteiros[1][1] + " " + matrizInteiros[2][0]);
		
		// Somar a Diagonal Principal
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if(i == j) {
					diagonalPrincipal = diagonalPrincipal + matrizInteiros[i][j];
				}
		    }
		}
		 
		System.out.println("\nSoma dos Elementos da Diagonal Principal : " + diagonalPrincipal);
		
		// Somar a Diagonal Secundaria
		diagonalSecundaria = matrizInteiros[0][2] + matrizInteiros[1][1] + matrizInteiros[2][0];
		
		System.out.println("\nSoma dos Elementos da Diagonal Secundaria : " + diagonalSecundaria);
		
		leia.close();
	}
}