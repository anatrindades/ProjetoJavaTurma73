package metodos_Exemplo;

import metodos_Exemplo.ExemploMetodo02;

public class ExemploMetodo01 {

	public static void main(String[] args) {
		
		int resultado = somar(2,5); // resultado = 7
		//String texto = mensagem(); não retorna informação
		
		System.out.println("O primeiro resultado é: " + resultado);
		
		System.out.println("O segundo resultado é: " + somar(8,3));
		
		mensagem();
		
		saudacao("Oi, sei lá");

	}
	
	//valor1 + valor2 = resultado
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

	public static void mensagem() {
		System.out.println("Olá, Turma 73");
	}
	
	public static void saudacao(String mensagem) {
		System.out.println(mensagem);
	}
	
}
