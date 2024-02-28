package lacos_condicionais;

import java.util.Scanner;

public class TabelaDePrecosRestaurante {

	public static void main(String[] args) {
		
		//Variáveis
		int quantidade, codigo;
		float valorTotal;
		
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Código do Produto: ");
		codigo = leia.nextInt();
		
		//Comando Switch para escolha do código do cargo
		switch (codigo) {
		
		//Multiplicação da quantidade vezes o valor do produto
		case 1: System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		valorTotal = quantidade * 10;
		System.out.println("Produto: Cachorro Quente ");
		System.out.printf("Valor Total: %.2f", valorTotal);
		break;
		
		case 2: System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		valorTotal = quantidade * 15;
		System.out.println("Produto: X-Salada ");
		System.out.printf("Valor Total: %.2f", valorTotal);
		break;
		
		case 3: System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		valorTotal = quantidade * 18;
		System.out.println("Produto: X-Bacon ");
		System.out.printf("Valor Total: %.2f", valorTotal);
		break;
		
		case 4: System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		valorTotal = quantidade * 12;
		System.out.println("Produto: Bauru ");
		System.out.printf("Valor Total: %.2f", valorTotal);
		break;
		
		case 5: System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		valorTotal = quantidade * 8;
		System.out.println("Produto: Refrigerante ");
		System.out.printf("Valor Total: %.2f", valorTotal);
		break;
		
		case 6: System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		valorTotal = quantidade * 13;
		System.out.println("Produto: Suco de Laranja ");
		System.out.printf("Valor Total: %.2f", valorTotal);
		break;
		
		//em caso do cliente não escolher uma opção que esteja indicada no cardápio
		default: System.out.println("Escolha uma opção válida");
		
		}
		
		
	}
	

}
