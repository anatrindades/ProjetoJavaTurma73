package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue {

	public static void main(String[] args) {
		
		Queue <String> filaClientes = new LinkedList<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("\n*****************************");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.println("*****************************");
            System.out.print("\nEntre com a opção desejada: ");
            opcao = leia.nextInt();
            
            switch (opcao) {
            case 1:
                System.out.print("Digite o nome do cliente: ");
                String nomeCliente = leia.next();
                filaClientes.add(nomeCliente);
                System.out.println("\nFila: " + nomeCliente + "\nCliente Adicionado!");
                break;
            case 2:
                System.out.println("Clientes na fila:");
                for (String cliente : filaClientes) {
                    System.out.println(cliente);
                }
                break;
            case 3:
                if (filaClientes.isEmpty()) {
                    System.out.println("A fila está vazia!");
                } else {
                    String clienteChamado = filaClientes.poll();
                    System.out.println("Cliente chamado: " + clienteChamado);
                }
                break;
            case 0:
                System.out.println("Programa finalizado.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
        
        } while (opcao != 0);

        leia.close();
	}

}

