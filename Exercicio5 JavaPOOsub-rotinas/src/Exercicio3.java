import java.util.Scanner;

/*Criar um Programa que mostre qual � o maior e o menor n�mero inteiro digitado em uma sequ�ncia.
O programa dever� receber a quantidade de elementos a serem digitados, bem como entrar com esses elementos. Em seguida, dever� exibir o maior e o menor n�mero!
Para isso dever� adotar os seguintes requisitos:
Criar uma sub-rotina que recebe, como par�metro, o vetor de inteiros, e preencher cada posi��o utilizando entrada padr�o (Scanner);
Criar uma sub-rotina chamada printMaiorNumero(), que recebe o vetor como par�metro, verifique e imprima o maior n�mero;
Criar uma sub-rotina chamada printMenorNumero(), que recebe o vetor como par�metro, verifique e imprima o menor n�mero;
O m�todo  principal (main) dever�:
receber via teclado, a quantidade de elementos a serem preenchidos e criar um vetor de inteiros;
Em seguida, dever� efetuar o preenchimento deste vetor;
Com o uso das sub-rotinas (m�todos) criadas, imprimir o maior e menor n�mero digitado.
*/


public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
         //Recebe a qtd de elementos
		System.out.print("Digite a quantidade de elementos do vetor: ");
		int n = leitor.nextInt();
		
		// Variaveis vetor e int
		int numeros[] = new int[n]; //--> n a variavel sem numeros
		
		preencherVetor(numeros);
		
		printMaiorNumero(numeros);
		
		printMenorNumero(numeros);
		
		leitor.close();
	}
	//m�todo preencher vetor
	public static void preencherVetor(int v[]) {
		Scanner leitor = new Scanner(System.in);
		
		//Calculo do vetor
		for (int i = 0; i < v.length; i++) {
			System.out.printf("v[%d] = ", i);
			v[i] = leitor.nextInt();
		}
		
		leitor.close();
	}
	//M�todo receber vetor printMaiorNumero
	public static void printMaiorNumero(int v[]) {
		
		int maior = 0;
		
		//Calculo do vetor
		for (int i = 0; i < v.length; i++) {
			
			if (i == 0) maior = v[i];
			
			if (v[i] > maior) maior = v[i];
		}
		
		System.out.printf("Maior N�mero digitado: %d\n", maior);
		
	}
	//M�todo receber vetor printMenorNumero
	public static void printMenorNumero(int v[]) {
		
		int menor = 0;
		
		//Calculo do vetor
		for (int i = 0; i < v.length; i++) {
			
			if (i == 0) menor = v[i];
			
			if (v[i] < menor) menor = v[i];
		}
		
		System.out.printf("Menor N�mero digitado: %d\n", menor);
		
	}

}
