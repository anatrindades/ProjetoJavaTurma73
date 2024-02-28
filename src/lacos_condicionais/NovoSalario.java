package lacos_condicionais;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		
		//Variáveis
		String nome;
		int codigo;
		float salario, reajuste, novoSalario;
		
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("Cargo: ");
		codigo = leia.nextInt();
		
		System.out.print("Salário: ");
		salario = leia.nextFloat();
		
		//Comando Switch para escolha do código do cargo
        switch (codigo) {
		
        //0.10f representa 10% o f significa que o valor é do tipo float
		case 1: System.out.println("Nome do colaborador: " + nome);
	    System.out.println("Cargo: Gerente");
	    reajuste = 0.10f;
	    novoSalario = salario + (reajuste * salario);
	    System.out.printf("Novo Salário: R$ %.2f", novoSalario);
		break;
		
		case 2: System.out.println("Nome do colaborador: " + nome);
	    System.out.println("Cargo: Vendedor");
	    reajuste = 0.07f;
	    novoSalario = salario + (reajuste * salario);
	    System.out.printf("Novo Salário: R$ %.2f", novoSalario);
		break;
		
		case 3: System.out.println("Nome do colaborador: " + nome);
	    System.out.println("Cargo: Supervisor");
	    reajuste = 0.09f;
	    novoSalario = salario + (reajuste * salario);
	    System.out.printf("Novo Salário: R$ %.2f", novoSalario);
		break;
		
		case 4: System.out.println("Nome do colaborador: " + nome);
	    System.out.println("Cargo: Motorista");
	    reajuste = 0.06f;
	    novoSalario = salario + (reajuste * salario);
	    System.out.printf("Novo Salário: R$ %.2f", novoSalario);
		break;
		
		case 5: System.out.println("Nome do colaborador: " + nome);
	    System.out.println("Cargo: Estoquista");
	    reajuste = 0.05f;
	    novoSalario = salario + (reajuste * salario);
	    System.out.printf("Novo Salário: R$ %.2f", novoSalario);
		break;
		
		case 6: System.out.println("Nome do colaborador: " + nome);
	    System.out.println("Cargo: Técnico de TI");
	    reajuste = 0.08f;
	    novoSalario = salario + (reajuste * salario);
	    System.out.printf("Novo Salário: R$ %.2f", novoSalario);
		break;
		
		//em caso do cliente não escolher uma opção que esteja indicada no menu
		default: System.out.println("Escolha uma opção válida");
		}
		
	}

}
