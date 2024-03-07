package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class CincoCores {

	public static void main(String[] args) {
		
		// ArrayList para armazenar objetos na classe String
		
		List<String> cores = new ArrayList<String>();
		
		// Entrada de Dados
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 5 cores: ");
		for (int i = 0; i < 5; i++ ) {
			String cor = leia.nextLine();
			cores.add(cor);
			
		}
		
		// Exibe as cores adicionadas
		
		System.out.println("\nListar todas as cores: \n");
		for (String cor : cores) {
		System.out.println(cor);
		
		}
		
		// Coloca em ordem as cores em ordem crescente
		
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores: \n");
		for (String cor: cores) {
		System.out.println(cor);
					
		}
		
		leia.close();
		
	}

}
