package br.com.JavacomPOO2.SubRotinas;

import java.util.Scanner;
//Criar um m�todo que preencha o vetor de inteiros de 10 valores, utilizando o Scanner.
//Em seguida crie um programa que utilize o m�todo para preencher o vetor e, logo depois
//Imprima a Somat�ria dos valores do vetor.

public class Exemplosubrotina03 {

	//m�todo principal
	public static void main(String[] args) {
	//Variavel int --> numeros para preencher o vetor	
	int numeros[] = new int[10];
	prencherVetor(numeros);
	
	int somatorio = 0;
			
	for (int i = 0; i < numeros.length; i++) {
		somatorio = somatorio + numeros[i];
	}
		System.out.printf("A somatoria dos valores do vetor �: %d", somatorio);
	}
	
	//M�todo de preencher vetor
	//Variavel --> int vetor
	public static void prencherVetor(int vetor[]) {
    Scanner leitor = new Scanner(System.in);
    
    //Calculo do vetor
    for (int i = 0; i <vetor.length; i++) { 
    
   	// impress�o e leitura do vetor	
    System.out.printf("v[%d] = ", i);
    vetor[i] = leitor.nextInt();
    
    }
    leitor.close();
    }
}
   
  		