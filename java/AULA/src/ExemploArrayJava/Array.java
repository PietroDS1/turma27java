package ExemploArrayJava;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String nomes[] = {"JOAO", "maria", "PIETRO", "jango"};//0...3
		//String name;
		String matricula[] = new String[4];
		String aux = read.next();
		int notas[] = new int[4];
		/*
		System.out.println("Digite teu nome completo: \n");
		name = read.nextLine();
		
		if(name.length()> 20) {
			System.out.println("Nome grande em!");
		}
		else {
			System.out.println("Nome Normal!");
		}
		*/
		
	//.toLowerCase() Desfaz caixa alta
	//.toUpperCase() Deixa em caixa alta
		nomes[1] = nomes[1].toUpperCase();
		nomes[2] = nomes[2].toUpperCase();
		nomes[3] = nomes[3].toUpperCase();
		nomes[0] = nomes[0].toUpperCase();
		
		System.out.println("Escreva as notas dos alunos JOAO, MARIA, PIETRO e JANGO \n");
		for(int x = 0; x<nomes.length; x++) {
			System.out.println("ALuno " + (x+1));
			matricula[x] = "MATRICULA"+(x+5);
			System.out.println("MATRÍCULA: "+ matricula[x]+" alune: "+nomes[x] + " : ");
			notas[x] = read.nextInt();
		}
		for(int i = 0; i<4; i++) {
			if(notas[i]>= 6) {
				System.out.printf("%s - %s - nota: %d APROVADO/A!\n",matricula[i],nomes[i], notas[i]);
			}else{
				System.out.printf("%s - %s - nota: %d REPROVADO/A\n",matricula[i],nomes[i], notas[i]);
			}
		}
		
		System.out.println("Escreva a matrícula do alune: \n");
		aux = read.next().toUpperCase();
		
		for(int i = 0; i<4; i++) {
			if(matricula[i].equals(aux)) {
				
			
			if(notas[i]>= 6) {
				System.out.printf("%s - %s - nota: %d APROVADO/A!\n",matricula[i],nomes[i], notas[i]);
			}else{
				System.out.printf("%s - %s - nota: %d REPROVADO/A\n",matricula[i],nomes[i], notas[i]);
			}
			}
		}
		
		
		
		
		
		
		
		/*
		for(int y = 0; y<notas.length; y++) {
			System.out.println(nomes[y]);
		}
		// for each
		for(String x:nomes) {
			System.out.println(x);
		}
		*/
	}

}
