package VerSeoNumEparOuImpar;

import java.util.Scanner;

public class Exerc {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int teste ;
	for(int i = 0; i<4; i++) {
		
	
	System.out.println("Escreva um número: ");
	teste= leia.nextInt();

	if(teste > 0) {
		System.out.println(teste + " é um número positivo \n");
	}
	else if(teste < 0) {
		System.out.println(teste + " é um número negativo e inválido \n");
	 
	}
	else if (teste == 0){
	System.out.println(teste + " é neutro \n");
	}
	else if(teste % 2 == 0) {
		System.out.println(teste + " é par \n");
	}
	else{
		System.out.println(teste + " é impar \n"); 
	}
}
}
}



