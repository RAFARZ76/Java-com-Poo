package JavaExercicios5SubRotinasJavaPOO;

import java.util.Scanner;
/*Dado um vetor V = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9},
//criar um programa que leia um n�mero e informe na tela quantas vezes este n�mero foi encontrado no vetor.
Para isso, dever� considerar os seguintes requisitos:
Criar uma sub-rotina que receba dois par�metros (vetor, e o n�mero a ser pesquisado);
A sub-rotina dever� verificar quantas vezes o n�mero a ser pesquisado aparece no vetor e imprimir uma mensagem informando a quantidade;
Usar a sub-rotina criada no programa principal.*/

public class Exercicio2 {
		
      //m�todo principal

	   private static int contador;

	public static void main(String[] args) {
	Scanner leitor = new Scanner (System.in);
			
		//Variavel Vetor e Variavel int 
		int v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
		
		int n;
		
		int contador = 0;

		pesquisarVetor(v);
		
		  }
     	
      
		//M�todo de pesquisar o n�mero do vetor
		//Variavel --> int vetor
		public static void pesquisarVetor(int vetor[]) {
	    Scanner leitor = new Scanner(System.in);
	    		   
		 //Leitura da pesquisa no vetor e impress�o
			System.out.println("Digite um n�mero!");
			 int n = leitor.nextInt();
			 
			 // Calculo pra mostrar qtas vezes o n� foi encontrado
			 for (int i = 0; i < vetor.length; i++) {
				 
				 if (n == vetor[i]) {
					 contador++;
				 }
		       }
	    	
		 // Mostra e imprimi qtas vezes foi encontrado o n�
		    System.out.printf("%d foi encontrado vez(es)!" , contador);		 

				 
	/* public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		 
		//Variavel vetor, int -> n (numero) e int -> contador pra mostrar qtas vezes o n� foi encontrado no vetor
		int v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
		 int n;
		 int contador = 0;
		
		 //Leitura e impress�o do numero
		System.out.println("Digite um n�mero!");
		 n = leitor.nextInt();
		 
		 // leitura pra mostrar qtas vezes o n� foi encontrado
		 for (int i = 0; i < v.length; i++) {
			 
			 if (n == v[i]) {
				 contador++;
			 }
	     }
		 // Mostra e imprimi qtas vezes foi encontrado o n�
		   System.out.printf("%d foi encontrado %d vez(es)!" , n, contador);	
	    */

      	}
   }
  
 	    