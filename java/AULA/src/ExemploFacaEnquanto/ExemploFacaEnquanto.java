package ExemploFacaEnquanto;

import java.util.Scanner;

public class ExemploFacaEnquanto {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numero, contador = 0, R = 1;
		
		System.out.println("Digite um n�mero: ");
		numero = read.nextInt();
		
		if(numero <= 0) {
			System.out.println("N�mero inv�lido");
		}
		else {
			do{
				contador++;
				R = R+contador;			
				System.out.printf("%d + ", contador);
			}while(contador < numero);
			
			System.out.print(" = " + (R - 1));
		}
		
	}
}
