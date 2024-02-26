package introducao;

import java.util.Scanner;

public class SalarioeAdicionais {

	public static void main(String[] args) {
		
		//Variáveis
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor do Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor das Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		//Soma, multiplicação e subtração para obter valor de Salário Líquido
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O Salário Líquido é: %.1f ", salarioLiquido);
		
	}

}
