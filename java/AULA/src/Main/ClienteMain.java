package Main;

import ObjetosReais.Cliente;

public class ClienteMain {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		//instancia
		cliente1.bracos = 2;
		cliente1.pes = 2;
		cliente1.maos = 2;
		cliente1.pernas = 2;
		cliente1.tamanho = 1.70;
		cliente1.sexo = false;
		cliente1.cabelo = "Ruivo";
		cliente1.raca = "Branco";
		
		//ação
		cliente1.racaNBJ();
		System.out.println("\n");
		cliente1.altura();
		System.out.println("\n");
		cliente1.tipoCabelo();
		System.out.println("\n");
		cliente1.sexoMasculino();
		System.out.println("\n");
		cliente1.deficiencia();
		System.out.println("\n");
	}

}
