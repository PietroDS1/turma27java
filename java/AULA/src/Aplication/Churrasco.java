package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Churrasco {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		List <String> listaChurras = new ArrayList<>();
		listaChurras.add("Refrigerante");
		listaChurras.add("Kafta");
		listaChurras.add("Pão de alho");
		listaChurras.add("Queijo Qualho");
		listaChurras.add("Farofa");
		listaChurras.add("Picanha");
		listaChurras.add("Linguiça");
		listaChurras.add("Frango");
		for(String itens : listaChurras) {
			System.out.printf("Item: "+itens+" \n");
		}
		System.out.printf("Tamanho da lista atual: " + listaChurras.size() + "\n");
		System.out.printf("Nova Lista\n");
		listaChurras.add(0, "Tang de Uva");
		for(String itens : listaChurras) {
			
			System.out.printf("Item: "+itens+" \n");
		}
		System.out.printf("Tamanho da lista atual: " + listaChurras.size()+"\n");
	
		listaChurras.remove(1);
		
		System.out.printf("Nova Lista quase saudável: ");
		for(String itens : listaChurras) {
			System.out.printf("Item: "+itens+" \n");
		}
		System.out.printf("Tamanho da lista atual: " + listaChurras.size());
	
	
	}

}
