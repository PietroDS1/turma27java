programa
{
	inclua biblioteca Matematica
	inclua biblioteca Tipos --> tp
	
	funcao inicio()
	{	
	/* EXERCICIO 1
		real peso, multa, excesso 

  		escreva("Informe o peso em Kg do tomate: \n")
  		leia(peso)

  		se (peso > 50){
  			multa = (peso - 50)*4
  			excesso =  peso - 50
  			escreva("Seu peso excedeu: " + excesso + "Kg" + ", vc pagara multa de 4 reais por Kg, ou seja: " + multa + "Reais")
  		}
  		senao{
  			multa = 0
  			excesso =  0
  			escreva("Seu peso n excedeu, logo o valor de excesso: " + excesso + "Kg" + ", vc pagara multa de: " + multa + "Reais")
  		}*/

  		real C, N
  		real horasLimite = 50.0, E = 0.0, Salario
  		
  	

		escreva("Por favor, informe suas credenciais:  \n")
		leia(C)
		escreva("Por favor, informe o valor de horas trabalhadas:  \n")
		leia(N)
		se(N <= horasLimite){
			Salario = N * 10
			escreva("Teu salario TOTAL: " + Salario + "\n")
			escreva("Teu salario EXCEDENTE: " + E + "\n")
		}
		senao{
			E = (N - 50)*20
			Salario = 500 + E
			escreva("Teu salario TOTAL: " + Salario + "\n")
			escreva("Teu salario EXCEDENTE: " + E + "\n")
			
		}

		
			
			
			
		
/*EXERCICIO 3
		inteiro num1, num2, num3, num4, q1, q2,q3, q4

		escreva("Escreva um num: ")
		leia (num1)
		escreva("Escreva outro num, pode ser o anterior: ")
		leia (num2)
		escreva("Escreva outro num, pode ser o anterior: ")
		leia (num3)
		escreva("Escreva outro num, pode ser o anterior: ")
		leia (num4)

		q1 = Matematica.potencia(num1, 2)
		
		q2 = Matematica.potencia(num2, 2)
		
		q3 = Matematica.potencia(num3, 2)
		
		q4 = Matematica.potencia(num4, 2)

		se(q3 > 1000){
			escreva("Acabou, o valor do quadrado do:" + num3 + " = " + q3)
		}
		senao{
			escreva("O valor do quadrado do:" + num1 + " = " + q1 + "\n")
			escreva("O valor do quadrado do:" + num2 + " = " + q2 + "\n")
			escreva("O valor do quadrado do:" + num4 + " = " + q3 + "\n")
			escreva("O valor do quadrado do:" + num4 + " = " + q4 + "\n")
		}*/

/* EXERCICIO 4
		inteiro X

		escreva("Escreva um num inteiro: ")
		leia(X)

		
			se(X % 2 == 0 e X > 0){
				escreva("Esse num e par e positivo")
				
			}
			senao{
				escreva("Esse num e negativo \n")
				se (X % 2 != 0){
					escreva("Esse num e impar")
				}
				senao{
					escreva("Esse num e par")
				}
			}*/

/* EXERCICIO5
			real ind
			//NIVEL ACEITAVEL 0,05 até 0,25
			// 0,3 = SUSPENDER ATIVIDADE g1
			// 0,4 = SUSPENDER ATIVIDADE g1 e g2
			// 0,5 = SUSPENDER ATIVIDADE g1, g2 e g3

			escreva("Escreva o indice \n")
			leia(ind)
			

			se( ind <= 0.25 e ind >= 0.05){
				escreva("Poluicao aceitavel")
			}
			se( ind <= 0.39 e ind >= 0.25){
			escreva("Grupos 1 devido ao nivel de poluicao, por favor suspendao suas atividades \n")
			}
			
			

			se( ind >= 0.3 e ind <= 0.4){
				
				escreva("Grupos 1 e 2 devido ao nivel de poluicao, por favor suspendao suas atividades \n")
			}
			
			se( ind >= 0.5){
				
				escreva("Grupos 1, 2 e 3 devido ao nivel de poluicao, por favor suspendao suas atividades \n")
			}
			*/

/*EXERCICIO 6
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos


			inteiro idade, sexo

			escreva("Escreva seu sexo, onde 1 significa Feminino e 2 Masculino: \n")
			leia (sexo)
		
			escreva("Escreva sua idade: \n")
			leia (idade)
			

			se(idade > 5 e idade <7 e sexo ==  1){
				escreva("Infantil A = 5 a 7 anos " + ",sua idade e: " + idade)
			}
			
			se(idade > 5 e idade <7 e sexo ==  2){
				escreva("Infantil B = 5 a 7 anos " + ",sua idade e: " + idade)
			}
			se(idade > 8 e idade <11 e sexo ==  1){
				escreva("Infantil A = 8 a 11 anos " + ",sua idade e: " + idade)
			}
			se(idade > 8 e idade <11 e sexo ==  2){
				escreva("Infantil B = 8 a 11 anos " + ",sua idade e: " + idade)
			}
			se(idade > 12 e idade <13 e sexo ==  1){
				escreva("Infantil A = 12 a 13 anos " + ",sua idade e: " + idade)
			}
			se(idade > 12 e idade <13 e sexo ==  2){
				escreva("Infantil B = 12 a 13 anos " + ",sua idade e: " + idade)
			}
			se(idade > 14 e idade <17 e sexo ==  1){
				escreva("Infantil A = 14 a 17 anos " + ",sua idade e: " + idade)
			}
			se(idade > 14 e idade <17 e sexo ==  2){
				escreva("Infantil B = 14 a 17 anos " + ",sua idade e: " + idade)
			}
			se(idade >= 18 e sexo ==  2){
				escreva("Adultos = Maiores de 18 anos " + ",sua idade e: " + idade)
			}*/
/*EXERCICIO 7
			real area, base, altura

			escreva("Escreva a base do triangulo: \n")
			leia(base)
			escreva("Escreva a altura do triangulo: \n")
			leia(altura)

			se (base >=0 e altura >=0){
				area = (base * altura)/2
			}*/
//EXERCICIO 8
			/*inteiro N

			escreva("Escreva um num, irei mostra-lo se for maior que 100: \n")
			leia(N)

			se(N > 100){
				escreva("Te falei, seu num e: " + N)
			}
			senao{
				escreva("Te falei, seu num e 0")
			}*/
			



			
			
			
			
			
			
		
		
		
		

		
		
		
		
  		
  		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 648; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
<<<<<<< HEAD
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
=======
>>>>>>> ca59fb8661a1f807fc32f7fa89323d113a8db671
