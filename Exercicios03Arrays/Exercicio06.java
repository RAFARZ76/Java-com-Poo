package br.com.arrays;
import java.util.Scanner;

//Dado um vetor V = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9}, 
//criar um programa que leia um n�mero e informe na tela quantas vezes este n�mero 
//foi encontrado no vetor.


public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		 
		//Variavel vetor, int -> n (numero) e int -> contador pra mostrar qtas vezes o n� foi encontrado no vetor
		int v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
		 int n;
		 int contador = 0;
		
		 //Leitura e impress�o do numero
		System.out.println("Digite um n�mero!");
		 n = leitor.nextInt();
		 
		 // Calculo pra mostrar qtas vezes o n� foi encontrado
		 for (int i = 0; i < v.length; i++) {
			 
			 if (n == v[i]) {
				 contador++;
			 }
	             }
		 // Mostra e imprimi qtas vezes foi encontrado o n�
		   System.out.printf("%d foi encontrado %d vez(es)!" , n, contador);		 
           
		   
	}
	  

}
