import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
		
		int n�mero; 
		
		System.out.println("Digite o numero da tabuada:");
		n�mero = leitor.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int res = n�mero * i;
			
			// 5 x 2 = 10
			
		System.out.printf("%s x %s = %s\n " , n�mero, i, res);
			                          //: \n se usa ap�s a impress�o da frase � quebra 
		}
	}

}
