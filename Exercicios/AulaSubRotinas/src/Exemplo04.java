import java.util.Scanner;

//Criar um m�todo que imprima os valores de um vetor de inteiros.
//Copiar o m�todo de preenchimento de vetor do exemplo 3.
//Em seguida crie um programa que preencha um vetor de 10 posi��es 
//e Imprima seus valores.

public class Exemplo04 {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		
		prencherVetor(numeros);
		
		imprimirVetor(numeros);
		
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
		//M�todo de imprimir vetor
				//Variavel --> int vetor
	    public static void imprimirVetor(int vetor[]) { 
	    	Scanner leitor = new Scanner(System.in);
	    
	    	//Calculo imprimirVetor
	    for (int i = 0; i < vetor.length; i++) {
	       
	    	if (i > 0)System.out.print(", ");
	    	System.out.print(vetor[i]);
	    	
	  	}

	}

}
