package VerSeoNumEparOuImpar;

import java.util.Scanner;

public class Exerc {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int teste ;
	for(int i = 0; i<4; i++) {
		
	
	System.out.println("Escreva um n�mero: ");
	teste= leia.nextInt();

	if(teste > 0) {
		System.out.println(teste + " � um n�mero positivo \n");
	}
	else if(teste < 0) {
		System.out.println(teste + " � um n�mero negativo e inv�lido \n");
	 
	}
	else if (teste == 0){
	System.out.println(teste + " � neutro \n");
	}
	else if(teste % 2 == 0) {
		System.out.println(teste + " � par \n");
	}
	else{
		System.out.println(teste + " � impar \n"); 
	}
}
}
}



