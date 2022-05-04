import java.util.Scanner;

	//Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}
//criar um programa a que receba um n�mero pelo teclado, 
//verifique e imprima na tela se este n�mero existe no vetor.
//Para isso, dever� considerar os seguintes requisitos:
//Criar uma sub-rotina que receba dois par�metros (vetor, e o n�mero a ser pesquisado);
//A sub-rotina dever� verificar a exist�ncia do n�mero a ser pesquisado
//e imprimir uma mensagem de sucesso ou insucesso;
//Usar a sub-rotina criada no programa principal.

   public class Exercicio1 {
	   

       //m�todo principal

public static void main(String[] args) {
	Scanner leitor = new Scanner (System.in);
	
	//Variavel Vetor e Variavel int -> pesquisa pra receber o n� no teclado
	int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
     pesquisarVetor(v);
     
    }

             //M�todo de pesquisar 
        //Variavel --> int 
           public static void pesquisarVetor(int vetor[]) {
           Scanner leitor = new Scanner(System.in);

      	        	   
        		int pesquisa;
        		
        		//Imprimi o n� inteiro e faz a pesquisa
        		System.out.println("Digite um n�mero inteiro: ");
        			pesquisa = leitor.nextInt();
        			
        			boolean existe =  false;
        			 
        			 // Mostra na tela se o n� existe ou n�o no vetor
        			for (int i = 0; i < vetor.length; i++) {
        		        int n = vetor[i];
        				if (n == pesquisa) {
        					  existe = true;
        				}
        			 }
        		       if (existe == true) {
        		    	   System.out.printf("%d existe no vetor. Sucesso!", pesquisa);
        		     } else {
        		    	 System.out.printf("%d N�o existe no vetor. Insucesso!", pesquisa);
        			
         }         
       }    
   }  
	   
	  /* public static void main(String[] args) {
			Scanner leitor = new Scanner (System.in);
			
			//Variavel Vetor e Variavel int -> pesquisa pra receber o n� no teclado
			int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
			
			int pesquisa;
			
			//Imprimi o n� inteiro e faz a pesquisa
			System.out.println("Digite um n�mero inteiro: ");
				pesquisa = leitor.nextInt();
           
	   }
   } */