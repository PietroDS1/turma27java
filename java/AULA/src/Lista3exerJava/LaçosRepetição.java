package Lista3exerJava;

import java.util.Scanner;

public class La�osRepeti��o {

	public static void main(String[] args) {
		/*EXERCICIO1
		int num;
		for(num = 1000; num<2000; num++) {
			if(num%11 == 5){
				System.out.printf("\n%d", num);
			}
		}
		*/
		/*EXERCICIO 2
		int num;
		for(num = 0; num<11; num++) {
			if(num%2 == 0) {
				System.out.printf("\nN�meros pares: %d",num);
			}
			else {
				System.out.printf("\nN�meros �mpares: %d",num);
			}
		}
		*/
		/*EXERCICIO3
		Scanner read = new Scanner(System.in);
		int idade,soma1 = 0, soma2 =0, contador = -1, contador2 = -1;
		System.out.println("Escreva sua idade: \n");
		idade = read.nextInt();
		
		while(idade <= 99) {
			if(idade <= 21 && idade > 0) {
				contador++;
				soma1+=contador;	
			}
			
		 if(idade >= 50 && idade <= 99) {
				contador2++;
				soma2+=contador2;	
			}
		
		 	//System.out.println("Escreva sua idade: \n");
			idade = read.nextInt();
		}
		System.out.printf("A soma de pessoas com idades at� 21 anos �: %d \n", (soma1+1) );
		System.out.printf("A soma de pessoas com mais de 50 anos �: %d \n", (soma2+1) );
		*/
		/*EXERCICIO 4 
		int num=0, calminha=0, idade, sexo, caracteristica, mulher40anos=0, deMenor=0,mulherN=0, homemA=0, calm=0;
		while(num<=150) {
		num++;
		System.out.println("Qual sua idade?");
		idade = leia.nextInt();
		System.out.println("Qual seu genero: 1- Feminino 2 - Masculino 3 - Outros");
		sexo = leia.nextInt();
		System.out.println("Como vc se considera dentre as op��es: 1- Nervoso 2 - Calmo 3 - Agressivo");
		caracteristica = leia.nextInt();
		if((idade<=17) && caracteristica==1) {
			deMenor++;
		} else if(idade>=40 && caracteristica ==2) {
			mulher40anos++;
		} 
		if(sexo==1 && caracteristica ==2) {
			mulherN++;
		} else if(sexo==2 && caracteristica==3) {
			homemA++;
		}else if(sexo==3 && caracteristica==1) {
			calm++;
		}
		if(caracteristica ==1) {
			calminha++;
		}	
		}
		System.out.printf("\nO n�mero de homens agressivos �: %d",homemA);
		System.out.printf("O n�mero de pessoas calmas �: %d",calminha);	
		System.out.printf("\nO n�mero de outros calmos �: %d",calm);
		System.out.printf("\nO n�mero de mulheres nervosas �: %d",mulherN );
		System.out.printf("\nO n�mero de pessoas nervosas com mais de 40 anos �: %d",mulher40anos);
		System.out.printf("\nO n�mero de pessoas calmas com menos de 18 anos �: %d",deMenor);
		}
}
			*/
		/*EXERCICIO 5
			Scanner read = new Scanner(System.in);
			int numero, resultado = 0;
			System.out.println("Escreva um n�mero: \n");
			numero = read.nextInt();		
			do {		
				resultado += numero;
				System.out.printf("%d + ", numero);
				numero--;
		}while(numero < resultado && numero > 0);
		System.out.println(0);
		System.out.printf("\nO resultado �: %d",resultado);
		*/
		//EXERCICIO 6
		int num, contador = 0, soma = 0, media =0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escreva varios n�mero e saia pressionando 0: \n");
		num = read.nextInt();
		
		do {
			
			if(num%3 == 0) {
				contador++;
				soma+=num;
				media = soma/contador;
			}
			System.out.println("Escreva varios n�mero e saia pressionando 0: \n");
			num = read.nextInt();
			
		}while(num > 0);
		
		System.out.println("Escreva varios n�mero e saia pressionando 0: \n");
		System.out.printf("A m�dia dos n�meros divis�veis por 3 �: %d", media);
	//ME APAGUE
	}

}
