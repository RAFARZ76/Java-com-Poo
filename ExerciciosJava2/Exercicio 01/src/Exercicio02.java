// Criar um programa que calcule a média de 2 notas e mostrar essa m�dia na tela.

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Variavel para calculo de 2 notas e m�dia
		
		float nota1, nota2, media;
	
		//Imprimir a digita��o dos 2 n�s na tela
		System.out.println("Digite a nota 1:");
		nota1 = leitor.nextFloat();
		
		System.out.println("Digite a nota 2:");
		nota2 = leitor.nextFloat();
		
		//Calculo da media
		media = (nota1 + nota2) / 2;
		
		//mostrar na tela a impress�o o calculo da media
		System.out.println("Media: " + media);

	}

}