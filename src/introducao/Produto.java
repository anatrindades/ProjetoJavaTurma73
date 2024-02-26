package introducao;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		
		//Variáveis
		float n1, n2, n3, n4, diferenca;
		
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o numero 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o numero 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o numero 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o numero 4: ");
		n4= leia.nextFloat();
		
		//
		diferenca = (n1*n2)-(n3*n4);
		
		System.out.println("A diferença é: " + diferenca);
				
	}

}
