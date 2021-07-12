package Aplication;

import java.util.Scanner;

import Entities.Cachorro;
import Entities.Cavalo;
import Entities.Preguica;

public class Exercicio1Lista5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe o nome do Cachorro: \n");
		String nome  = read.next();
		System.out.println("Informe a idade do Cachorro: \n");
		int idade  = read.nextInt();
		Cachorro cachorro = new Cachorro(nome, idade);
		cachorro.checaSom();
		cachorro.checaCorrer();
		System.out.println("Informe o nome do Cavalo: \n");
		String nome1  = read.next();
		System.out.println("Informe a idade do Cavalo: \n");
		int idade1  = read.nextInt();
		Cavalo cavalo = new Cavalo(nome1, idade1);
		cavalo.checaSom();
		cavalo.checaCorrer();
		System.out.println("Informe o nome do Preguiça: \n");
		String nome2  = read.next();
		System.out.println("Informe a idade do Preguiça: \n");
		int idade2  = read.nextInt();
		Preguica preguica = new Preguica(nome2, idade2);
		preguica.checaSom();
		preguica.checaArvore();
		
		
		

	}

}
