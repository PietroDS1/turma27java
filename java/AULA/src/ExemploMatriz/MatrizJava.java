package ExemploMatriz;

import java.util.Scanner;

public class MatrizJava {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
				//linha/coluna
		String agenda [][] = new String[24][31];
		int diaAux, horaAux;
		
		
		System.out.println("Agenda dia do evento: ");
		diaAux = leia.nextInt()-1;
		System.out.println("Agenda a hora do evento: ");
		horaAux = leia.nextInt();
		System.out.println("Agenda a hora do evento: ");
		agenda[horaAux][diaAux] = leia.next();
		//agenda[11][6] = "Barometro";
		
		for(int hora = 0; hora<24;hora++) {
			for(int dia = 0; dia<31;dia++) {
				if(agenda[hora][dia] != null) {
					System.out.println("Agenda dia: "+ (dia+1) + " hora: "+ hora +agenda[hora][dia]);
				}

		}
		}
	}
}


