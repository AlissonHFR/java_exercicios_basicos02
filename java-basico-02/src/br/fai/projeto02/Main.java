package br.fai.projeto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		

	}

	private void start() {
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Digite um valor: ");
	 double valor = ler.nextDouble();
	 
	 int valorComCast = (int) valor;
	 
	 System.out.println("valor com casas: " + valor +
			 " | valor inteiro: " + valorComCast);
	 
		
	}

}
