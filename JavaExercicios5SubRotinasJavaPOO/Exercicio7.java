package JavaExercicios5SubRotinasJavaPOO;
import java.util.Scanner;
/*Criar um programa que mostre um relat�rio de quantidades de vogais que aparecem em uma sequ�ncia:
Para isso dever�:
Criar uma sub-rotina chamada gerarSequencia(), que:
receba, como par�metro, a quantidade de elementos da sequ�ncia;
crie um vetor de caracteres com base na quantidade recebida pelo par�metro;
preencha o vetor utilizando a entrada padr�o (Scanner);
e retorne este vetor preenchido.
Criar uma sub-rotina chamada imprimirRelatorio(), que:
receba, como par�metro, o vetor de vogais;
analise a quantidade de cada vogal existente no vetor;
e imprima a quantidade de cada vogal.
O programa principal dever� solicitar a entrada do tamanho da sequ�ncia de vogais, e, logo ap�s, dever� utilizar as sub-rotinas criadas acima.
*/

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        
		int vogal;
	    
		//Imprimir a leitura do dia que receba entre 1 e 7
		System.out.printf("Digite um valor entre 1 e 7: ");
		vogal = leitor.nextInt();
		
	
		//	//Usar comando switch (Estrutura de repeti��o) e break para interromper a repeti��o
		    switch (vogal) {
			case 1: System.out.println("Vogal A"); break;
			case 2: System.out.println("Vogal E"); break;
			case 3: System.out.println("Vogal I"); break;
			case 4: System.out.println("Vogal O"); break;
			case 5: System.out.println("Vogal U"); break;
		   		
	  } 
	}
}	