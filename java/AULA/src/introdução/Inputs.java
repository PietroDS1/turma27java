package introdu��o;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

			double salario;
			int nascimento;
			String nome;
			
			
			System.out.println("Escreva seu nome: ");
			nome = leia.next();
			System.out.println("Escreva seu sal�rio: ");
			salario = leia.nextDouble();
			
			System.out.println("Escreva sua data de nascimento: ");
			nascimento = leia.nextInt();
			
			
			System.out.println(nome +" sua idade �: "+ (2021-nascimento) + " e seu sal�rio �: " + salario);
			
			
			
			
			
	}

}
