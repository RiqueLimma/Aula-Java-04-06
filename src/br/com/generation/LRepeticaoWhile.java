package br.com.generation;

import java.util.Scanner;

public class LRepeticaoWhile {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner ler = new Scanner(System.in);
		//Enquanto - While
		
		int numero = 10;
		
		//numero = ler.nextInt();
		
		while(numero > 0) {
			System.out.println("Contando ....." + numero);
			numero = numero -1;
			Thread.sleep(1000);
		}
		
		System.out.println("\nContagem Parada");
		}

}
