package JavaExercicios5SubRotinasJavaPOO;
import java.util.Scanner;

/*
 Criar um Programa que preencha um vetor de 10 de n�meros inteiros e imprima os n�meros pares e �mpares!
Para isso:
Criar uma sub-rotina que recebe, como par�metro, o vetor de inteiros, e preencher cada posi��o utilizando entrada padr�o (Scanner);
Dever� implementar com print uma sub-rotina (m�todo) que receba um vetor como par�metro, 
//verifique se cada um dos valores � �mpar e imprima este valor;
Dever� implementar com print uma sub-rotina (m�todo) que possua a mesma regra anterior, por�m, para valores pares;
No m�todo principal (main) dever� ser criado um vetor de 10 posi��es, //
e utilizar as sub-rotinas criadas para efetuar o preenchimento e imprimir os valores pares e �mpares.
*/

public class Exercicio4 {

		public static void main(String[] args) {
	
	
           // Variaveis Vetor e int	
		int numeros[] = new int[10];
		
		int par[] = new int [10];
		
		int impar [] = new int [10];
		
		
		preencherVetor(numeros);
		
		System.out.println();
		
		printImpar(numeros);
		
		System.out.println();
		
		printPar(numeros);

	}

	//M�todo preencherVetor inteiros
	public static void preencherVetor(int v[]) {
		Scanner leitor = new Scanner(System.in);
		
		//Calculo do Vetor		
		for (int i = 0; i < v.length; i++) {
			
			//Imprimi e mostra na tela valores impares	
			System.out.printf("v[%d] = ", i);
			v[i] = leitor.nextInt();
		}
		
		leitor.close();
	}
	 //M�todo preencher Valores impares
	public static void printImpar(int v[]) {
		Scanner leitor = new Scanner (System.in);
		
		//Calculo Valores impares 
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 != 0) {
				
				//Imprimi e mostra na tela valores impares	
			int impar [] = new int [10];
			impar[i] = v[i];
			System.out.printf("impar[%d] = %d\n", i, impar[i]);
			}
	    }
	}	
	    //M�todo preencher Valores pares
		 public static void printPar(int v[]) {
			 
				//Calculo Valores pares 
			for (int i = 0; i < v.length; i++) {
				if (v[i] % 2 == 0) {
					
					//Imprimi e mostra na tela valores pares	
					int par [] = new int [10];
				par[i] = v[i];
				System.out.printf("par[%d] = %d\n", i, par[i]);
	       }
		  }   
		}
	}	 
  		    	
	     		   
   /*
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		int v[] = new int[20];
		int par[] = new int [20];
		int impar [] = new int [20];
		
		// preencher o vetor
      		for (int i = 0; i < v.length; i++) {
			System.out.printf("Digite a %d posi��o: ", i);
			v[i] = leitor.nextInt();
      		  }
			
      		//separar os elementos pares dos impares
      		for (int i = 0; i < v.length; i++) {
				
      			if (v[i] %2 == 0) {
					par[i] = v[i];
				}else { 
					impar[i] = v[i];
				}
      		   }			
				//IMPRESS�O DOS VETORES
              for (int i = 0; i < v.length; i++) { 			
				System.out.printf("v[%d] = %d\n", i, v[i]);
			   }	
			
			for (int i = 0; i < par.length; i++) {
				System.out.printf("par[%d] = %d\n", i, par[i]);
				}
			
			for (int i = 0; i < impar.length; i++) {
				System.out.printf("impar[%d] = %d\n", i, impar[i]);
				}
			System.out.printf("FIM DO PROGRAMA");
			
        	} 
        }  
*/