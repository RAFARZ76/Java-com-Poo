package ExercicioExtendsHEran�a.src;
import java.util.Date;
import java.util.Scanner;

public class Teste {
	
   	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Crie um programa preencher nome e cpf e tirarCopias -> int
		
	 	String Nome;
		String cpf;
	    int tirarCopias;
		double custoTotal;
		//Data atualizada que tirou c�pias
		Date horaAtual = new Date();
		
		// Leitura e escrever na tela
		System.out.print("Preencher Nome: ");
		Nome = leitor.next();
		
		System.out.print("Preencher CPF: ");
		cpf = leitor.next();
		
		System.out.print("Digite a quantidade de C�pias: ");
		tirarCopias = leitor.nextInt();
					
		//Exibir tirarCopias = 0.07
		if (tirarCopias >= 10) {
			custoTotal = tirarCopias * 0.07;
		
			// menor que 10 c�pias -> 0.10	
		} else {
			custoTotal = tirarCopias * 0.10;
			
		}
			//Imprimi para aparecer na tela
		    System.out.printf("NOME: %s\n" , Nome);
		    System.out.printf("CPF: %s\n", cpf);
			System.out.printf("Custo total das c�pias: R$ %.2f\n", custoTotal);
			System.out.println("Data Atual que tirou as C�pias: " +horaAtual);
	  }
}
	
		
		

	

  

  	
	