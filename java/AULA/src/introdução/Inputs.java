package introdução;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

			double salario;
			int nascimento;
			String nome;
			
			
			System.out.println("Escreva seu nome: ");
			nome = leia.next();
			System.out.println("Escreva seu salário: ");
			salario = leia.nextDouble();
			
			System.out.println("Escreva sua data de nascimento: ");
			nascimento = leia.nextInt();
			
			
			System.out.println(nome +" sua idade é: "+ (2021-nascimento) + " e seu salário é: " + salario);
			
			
			
			
			
	}

}
