package br.com.JavaExercicios03Arrays;
import java.util.Scanner;

//05)	Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, 
//criar um programa a que receba um n�mero pelo teclado, verifique e imprima na tela se este n�mero existe no vetor.

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		//Variavel Vetor e Variavel int -> pesquisa pra receber o n� no teclado
		int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
		
		int pesquisa;
		
		//Imprimi o n� inteiro e faz a pesquisa
		System.out.println("Digite um n�mero inteiro: ");
			pesquisa = leitor.nextInt();
		 
		 boolean existe =  false;
		 
		 // Mostra na tela se o n� existe ou n�o no vetor
		for (int i = 0; i < v.length; i++) {
		
			 int n = v[i];
			 
			 if (n == pesquisa) {
				  existe = true;
			}
		 }
	       if (existe == true) {
	    	   System.out.printf("%d existe no vetor!", pesquisa);
	     } else {
	    	 System.out.printf("%d N�o existe no vetor!", pesquisa);
	     }
	}

}
