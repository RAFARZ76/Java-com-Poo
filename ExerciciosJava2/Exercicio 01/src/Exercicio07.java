import java.util.Scanner;

//Criar um programa que leia um valor em Real 
//e a cotação do dólar, e converta esse valor em dolares.

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Variavel do valor real, Cota��o Dolar, Convers�o
		double real;
		double dolar = 5.25;
		double res;
		
		//leitura da impress�o
		System.out.println("Digite o valor em R$: ");
		real = leitor.nextDouble();
		
		//Calculo da convers�o 
		res = (1 / dolar) * real;
		
		//Mostra a convers�o em d�lares
		System.out.printf("R$ %.2f equivalente a� $ %.2f", real, res);
	}
}
