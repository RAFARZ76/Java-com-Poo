package br.com.JavacomPOO2.AulaSwitchCase;

import java.util.Scanner;

public class Breakeecontinue1qualquernumerocoombreak {
	
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Faz leitura
		
		System.out.println("Entre com um n�mero:");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite:_");
		int max = scan.nextInt();
		
		for (int i=num; i<=max; i++) {
				
			System.out.println(i);
			if (i % 1 == 0) {
				System.out.println("O valor de i �:" + i);
			break;
			}
		
			   
		}
    }
 }   			   
	   
			   
			
	
	











		
		
	