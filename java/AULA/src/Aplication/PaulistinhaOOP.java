package Aplication;

import java.util.Scanner;

import Entities.Time;

import java.util.List;
import java.util.ArrayList;

public class PaulistinhaOOP {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		List<Time> tabela = new ArrayList<>();
		tabela.add(new Time ("Palmeiras"));
		tabela.add(new Time ("Santos"));
		tabela.add(new Time ("São Paulo"));
		tabela.add(new Time ("Corinthias"));
		//INDEXOF SERVE PARA PESQUISAR NA LISTA ALGO
		System.out.println(tabela.indexOf("São Paulo"));
	
		
		/*
		for(Time e : tabela) {
			System.out.printf("Times: " + e.getNome());
		}
		*/
	}

}
