package ExercicioExtendsHEran�a.src;
// Acrescentar Metodo para c�lculo de pre�o de c�pias para alunos e demais pessoas.

import java.util.Date;

// Classe Pessoa ao qual vai ser a classe pai para extender as outras classes.
public class Pessoa {
	public String nome;
	public static String cpf;
	public Date data_atual;

	public Pessoa(String _nome, String _cpf, Date _data) {
		
		//Variavel construtor
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_atual = _data;

	}
	public double tirarCopias(int qtd) { 
		// Acima de 10 c�pias fica � 0,07 centavos	
		   
		//Sen�o retorna o pre�o normal para tirar copias �:
		return 0.10 * (double) qtd;
   }
}	  
	