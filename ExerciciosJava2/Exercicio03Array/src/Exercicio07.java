import java.util.Scanner;

//07)	Criar um programa preencha um vetor de inteiros de 20 posi��es, via teclado. 
//Ap�s o preenchimento do vetor, o programa dever� separar os elementos pares e �mpares em dois vetores, 
//e por fim, exibir os tr�s vetores.

public class Exercicio07 {

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
