package EXERCICIOS;

import java.util.Scanner;

public class Lista1emJava {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		/*
		int mes,ano,dia,resultado;
		
		System.out.println("Escreva o mês do teu aniversário: ");
		mes = leia.nextInt();
		System.out.println("Escreva o ano do teu aniversário: ");
		ano = leia.nextInt();
		System.out.println("Escreva os dias que viveu depois do teu aniversário: ");
		dia = leia.nextInt();
		
		resultado = (mes*30)+(ano*365)+dia;
		System.out.println("Você viveu por: " + resultado + " dias");
		*/
		/*
		int mes,ano,dia,resultado, R2, R3;
		
		System.out.println("Escreva o mês do teu aniversário: ");
		mes = leia.nextInt();
		System.out.println("Escreva o ano do teu aniversário: ");
		ano = leia.nextInt();
		System.out.println("Escreva os dias que viveu depois do teu aniversário: ");
		dia = leia.nextInt();
		
		resultado = (mes*30)+(ano*365)+dia;
		R2 = mes/30;
		R3 = ano/365 ;
		System.out.println("Você viveu por: " + resultado + " dias");
		System.out.println("Você viveu por: " + R2 + " meses");
		System.out.println("Você viveu por: " + R3 + " anos");
		*/
		/*
		int segundos;
		int minutos;
		int horas;
		int segundo;
		
		System.out.println("Escreva o tempo do evento X da empresa em segundos\n");
		segundo = nextInt(segundo);
		segundos = (segundo % 3600)%60;
		minutos = (segundo % 3600)/60;
		horas = segundo/3600;
		System.out.println("O evento durará: " + minutos + " minutos, " + segundo + " segundos e " + horas + " hora/s");
		*/
		/*
		int a;
		int b;
		int c;
		int R;
		int S;
		int D;

		System.out.println("Escreva um número inteiro: ");
		c = leia.nextInt(c);
		System.out.println("Escreva outro número inteiro: ");
		b = leia.nextInt(b);
		System.out.println("Escreva mais um número inteiro: ");
		a = leia.nextInt(a);

		R = (a*a)+(b*b);
		S = (b*b)+(c*c);
		D = (R+S)/2;

		System.out.println("O resultado é: " + D);
		*/
		/*
		int nota1;
		int nota2;
		int nota3;
		double soma;
		double calculo;

		System.out.println("Escreva sua primeira nota:\n "); /
		nota1 =leia.nextInt(nota1);
		System.out.println("Escreva sua segunda nota:\n ");
		nota2 =leia.nextInt(nota2);
		System.out.println("Escreva sua terceira nota:\n ");
		nota3 =leia.nextInt(nota3);
	
		soma = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);

		calculo = soma/3;

		System.out.println("A média de suas notas de acordo com os pesos é: " + calculo);
		*/
		/*
		 double D, S, x1 , x2 , y1 , y2 ;

		 	System.out.println("O valor de X1\n ");
		 	x1 = leia.nextDouble(x1);
	        System.out.println("O valor de Y2\n ");
	        y2 = leia.nextDouble(y2);
	        System.out.println("O valor de X2\n ");
	        x2 = leia.nextDouble(x2);
	        System.out.println("O valor de Y1\n ");
	        y1 = leia.nextDouble(y1);
	       
	        D = Math.sqrt(x2-x1)+((y1*y1)-(y2*y2));

	        System.out.println("A distância entre é igual a: " + D );
	        */
		 	/*
			int X=0,Y=0,a=0,b=0,c=0,d=0,E=0,f=0;

		 	System.out.println("Escreva o valor de a\n");
		 	a =leia.nextInt(a);
	        System.out.println("Escreva o valor de b\n");
	        b =leia.nextInt(b);
	        System.out.println("Escreva o valor de c\n");
	        c =leia.nextInt(c);
	        System.out.println("Escreva o valor de d\n");
	        d =leia.nextInt(d);
	        System.out.println("Escreva o valor de e\n");
	        E =leia.nextInt(E);
	        System.out.println("Escreva o valor de f\n");
	        f =leia.nextInt(f);

	        X = (c*E)-(b*f)/(a*E)-(b*d);
	        Y = (a*f)-(c*d)/(a*E)-(b*d);

	        System.out.println("O valor de X é: " + X + " O valor de Y é: " + Y);
			*/

			int custo = 0;
			int resposta = 0;
		
			System.out.println("Escreva o custo para fabricação do seu carro: ");
			custo =leia.nextInt(custo);
		resposta = (custo * 73)/100;

		 System.out.println("O custo do seu carro é: " + resposta);
	}

}
