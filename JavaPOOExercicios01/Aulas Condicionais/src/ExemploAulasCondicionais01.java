import java.util.Scanner;

public class ExemploAulasCondicionais01 {

	public static <sysout> void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {
			int numero;
				
      System.out.println("Digite um n�mero");
      numero = leitor.nextInt();
      
      if (numero > 10) {
			   System.out.println("Numero maior que 10");
      } else {
			    System.out.println("O numero digitado � menor que 10");
      }
		}
		
		System.out.println("Fim do Programa!!");
        
	}

}
