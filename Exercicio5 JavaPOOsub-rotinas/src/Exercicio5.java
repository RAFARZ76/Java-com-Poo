import java.util.Scanner;

/*	Criar um programa que calcule a m�dia geral de uma turma, de acordo com os seguintes requisitos:
Criar uma sub-rotina que preencha um vetor de n�meros decimais, passado como argumento, utilizando entrada padr�o (Scanner);
Criar uma sub-rotina chamada calcularMediaGeral() que:
receba um vetor preenchido de n�meros decimais;
processe o somat�rio dos valores do vetor;
calcule a m�dia geral com base no somat�rio e na quantidade de elementos do vetor;
e retorne o resultado do somat�rio.
O m�todo principal (main) dever�: 
solicitar o tamanho da turma (quantidade de alunos);
criar um vetor de n�meros decimais com o tamanho solicitado;
Em seguida, dever� efetuar o preenchimento das m�dias no vetor criado;
E por fim, dever� calcular a m�dia geral e imprimir o resultado.
*/


public class Exercicio5 {
	
	public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			
			//Imprimi pra receber  a qtd de elementos
			System.out.print("Digite a quantidade de elementos do vetor: ");
			int n = leitor.nextInt();
		
			
			//Variaveis double para calcular as medias e preencher vetor
			double medias[] = new double[n];
			
			preencherVetor(medias);
			
			double mediaGeral = calcularMediaGeral(medias);
		
		//Imprime a m�dia geral
			System.out.printf("M�dia Geral da Turma: %.2f", mediaGeral);
			
			leitor.close();
		}
		
		
	//M�todo para criar a sub-rotina  calcularMediaGeral
	private static double calcularMediaGeral(double[] medias) {
	
		//calculo do somatorio 
		double somatorio = 0;
		double mediaGeral;
		for (int i = 0; i < medias.length; i++) {
			somatorio += medias[i];
		}
		
		//Calculo  da media geral retornando
        mediaGeral = somatorio / medias.length;
		return mediaGeral;
	     }
	
	  //M�todo preencher vetor
	    public static void preencherVetor(double v[]) {
		Scanner leitor = new Scanner(System.in);
	
		//Calculo preencher vetor
		for (int i = 0; i < v.length; i++) {
		
		//imprimir preencher vetor	
			System.out.printf("v[%d] = ", i);
			v[i] = leitor.nextDouble();
		}
		
		leitor.close();
	 }
  }
    
    


