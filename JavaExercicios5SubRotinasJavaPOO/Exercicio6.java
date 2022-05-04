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

public class Exercicio6 {

	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Variavel int da vogal
        int vogal;
	    
		//Imprimir e faz leitura a vogal que receba entre 1 a 5
		System.out.printf("Digite um valor entre 1 a 5: ");
		vogal = leitor.nextInt();
		
	
		//	//Usar comando switch (Estrutura de repeti��o) e break para interromper a repeti��o
		    switch (vogal) {
			case 1: System.out.println("Vogal A"); break;
			case 2: System.out.println("Vogal E"); break;
			case 3: System.out.println("Vogal I"); break;
			case 4: System.out.println("Vogal O"); break;
			case 5: System.out.println("Vogal U"); break;
	
		  }
		    
         //Imprime e faz leitura a qtd de elementos do vetor
		System.out.print("Digite a quantidade de elementos do vetor: ");
		int n = leitor.nextInt();
		
		// Variavel Char (Caracter)
		char sequencia[] = gerarSequencia(n);
		
		imprimirRelatorio(sequencia);
		
		leitor.close();
		
	   }
	  
	//M�todo para gerarSequencia
	private static char[] gerarSequencia(int n) {
			Scanner leitor = new Scanner(System.in);
		
		//Calculo do metodo gerarSequencia	
		char v[] = new char[n];
		for (int i = 0; i < v.length; i++) {	
			
			//Imprime e faz leitura para gerar a Sequencia
			System.out.printf("v[%d] = ", i);
			v[i] = leitor.next().charAt(0);
		}
		
		leitor.close();
		
		return v;
	   }
	    //Metodo para imprimirRelatorio e receber parametro das vogais
        private static void imprimirRelatorio(char[] v) {
		
        //Variavel int e contagem das vogais
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
		
		//Calculo das vogais
		for (int i = 0; i < v.length; i++) {
		
		//Usar comando switch (Estrutura de repeti��o) e break para interromper a repeti��o
			switch (v[i]) {
				case 'A':
				case 'a': contA++; break;
				
				case 'E':
				case 'e': contE++; break;
				
				case 'I':
				case 'i': contI++; break;
				
				case 'O':
				case 'o': contO++; break;
				
				case 'U':
				case 'u': contU++; break;
			   }
			}
		    
		     //Imprime e faz leitura da entrada do relatorio de contagem das vogais
            System.out.println("RELAT�RIO DE CONTAGEM DE VOGAIS");
		    System.out.printf("Letra A: %d\n", contA);
	     	System.out.printf("Letra E: %d\n", contE);
		    System.out.printf("Letra I: %d\n", contI);
		    System.out.printf("Letra O: %d\n", contO);
		    System.out.printf("Letra U: %d\n", contU);
		    
           }
        }		   		
    
        
     
 
         
           
    