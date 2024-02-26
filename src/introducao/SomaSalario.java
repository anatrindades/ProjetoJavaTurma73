package introducao;

import java.util.Scanner;

public class SomaSalario {

	public static void main(String[] args) {
		
		//Variaveis
		float salario;
		float abono;
		float novoSalario;
		
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		//Soma de salario com abono
		novoSalario = salario + abono;
		
		System.out.println("O novo salário é: " + novoSalario);
		

	}

}
