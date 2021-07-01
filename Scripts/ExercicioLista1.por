
programa
{
	
	funcao inicio()
	{

	/*
	 	inteiro ano
		inteiro mes
		inteiro dias
		inteiro resultado

		escreva("Escreva tua idade \n")
		leia (ano)
		escreva("Escreva o número de meses depois que completou seu último ano \n")
		leia (mes)
		escreva("Escreva o número de dias depois que completou seu último ano \n")
		leia (dias)

		resultado = (ano*365)+(30*mes)+dias

		 escreva("A quantidade de dias que você viveu é: " + resultado)
*/

		/*
		inteiro ano
		inteiro mes
		inteiro dias
		inteiro resultado

		escreva("Escreva tua idade\n")
		leia (ano)
		escreva("Escreva o número de meses depois que completou seu último ano\n")
		leia (mes)
		escreva("Escreva o número de dias depois que completou seu último ano\n")
		leia (dias)

		resultado = (ano*365)+(30*mes)+dias

		escreva("A quantidade de dias que você viveu é: " + resultado + 
		"A quantidade de meses que você viveu é: " + mes
		+"A quantidade de anos que você viveu é: " + ano )*/
		
 		inteiro segundos
		inteiro minutos
    		inteiro horas
		inteiro segundo

		
		escreva("Escreva o tempo do evento X da empresa em segundos\n")
		leia (segundo)
		segundos = (segundo % 3600)%60
		minutos = (segundo % 3600)/60
		horas = segundo/3600

		escreva ("O evento durará: " + minutos + " minutos, " + segundo + " segundos e " + horas + " hora/s")
		
		/*EXERCICIO 4
		inteiro a
		inteiro b
		inteiro c
		inteiro R
		inteiro S
		inteiro D

		escreva("Escreva um número inteiro:\n ")
		leia(a)
		escreva("Escreva outro número inteiro:\n ")
		leia(b)
		escreva("Escreva mais um número inteiro:\n ")
		leia(c)

		R = (a*a)+(b*b) //teste 2
		S = (b*b)+(c*c)// 2
		D = (R+S)/2

		 escreva("O resultado é: " + D)*/
/*EXERCICIO 5
		real nota1
		real nota2
		real nota3
		real soma
		real calculo

		escreva("Escreva sua primeira nota:\n ") //peso 2
		leia(nota1)
		escreva("Escreva sua segunda nota:\n ")// peso 3
		leia(nota2)
		escreva("Escreva sua terceira nota:\n ")//peso 5
		leia(nota3)
		//Para calcular a média vc deve somar os números e dividir pela
		//quantidade de variáveis

		soma = (nota1 * 2) + (nota2 * 3) + (nota3 * 5)

		calculo = soma/3

		escreva("A média de suas notas de acordo com os pesos é: " + calculo)*/
		
		/*EXERCICIO 6
        real D, S, x1, x2, y1, y2

        escreva("O valor de X1\n ")
        leia(x1)
        escreva("O valor de Y1\n ")
        leia(y1)
        escreva("O valor de X2\n ")
        leia(x2)
        escreva("O valor de Y2\n ")
        leia(y2)
	D = Mat.raiz((Mat.potencia((x2-x1),2))+(Mat.potencia((y2-y1),2)),2)


        escreva("A distância entre é igual a: " + Mat.arredondar(D,2))
	*/
	/*
 EXERCICIO 7
        real X,Y,a,b,c,d,E,f

        escreva("Escreva o valor de a\n")
        leia (a)
        escreva("Escreva o valor de b\n")
        leia (b)
        escreva("Escreva o valor de c\n")
        leia (c)
        escreva("Escreva o valor de d\n")
        leia (d)
        escreva("Escreva o valor de e\n")
        leia (E)
        escreva("Escreva o valor de f\n")
        leia (f)

        X = (cE)-(bf)/(aE)-(bd)
        Y = (af)-(cd)/(aE)-(bd)

        escreva("O valor de X é: " + X + " O valor de Y é: " + Y)*/
		
		/*EXERCICIO 8

		real custo
		real resposta
		
		escreva("Escreva o custo para fabricação do seu carro: ")
		leia(custo)
		resposta = (custo * 73)/100

		escreva("O custo do seu carro é: " + resposta)		
		*/
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */