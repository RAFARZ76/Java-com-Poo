import java.util.Scanner;

import java.util.Scanner;

// Criar um programa que leia 2 números reais, efetuar 
// as 4 operações matemáticas e mostrar os resultados.
public class Exercicio06 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		// Variaveis dos 2 n�s reais
		double a, b, res;
		
		//Fazer leitura e imprimir os 2 n�s reais
		System.out.println("Digite o valor A: ");
		a = leitor.nextDouble();
		
		System.out.println("Digite o valor B: ");
		b = leitor.nextDouble();
		
		//calculo das variaveis e imprimi as 4 opera��es
		res = a + b;
		System.out.println("SOMA: " + res);
		
		res = a - b;
		System.out.println("SUBTRAÇÃO: " + res);
		
		res = a * b;
		System.out.println("MULTIPLICAÇÃO: " + res);
		
		res = a / b;
		System.out.println("DIVIS�O: " + res);
		
	}
}