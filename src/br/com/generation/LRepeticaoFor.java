package br.com.generation;

public class LRepeticaoFor {

	public static void main(String[] args) {
		
		int n = 20;
		int soma = 0;
		
		for(int i = 0; soma < n; i++) {
			System.out.println("Soma = " + soma + " + " +i);
			
			soma += i;
			
			System.out.println("soma = " + soma + "\n");
		}
	}

}
