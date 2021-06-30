programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
 * coletando dados sobre o salário e número de filhos. A prefeitura deseja 
 * saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.
*/
    /*
	inteiro filhos, salario, maiorSalario = 0, percentual, salarioTotal = 0,filhoTotal=0, quantidadePessoas=0
	real contador = 0.0,media,mediaSalario,mediaFilhos
		

		para(inteiro x = 0; x<=19; x++){
			escreva("Escreva quantos filhos você tem: \n")
			leia(filhos)		
			escreva("Escreva quanto você recebe de salário por mês: \n")
			leia(salario)
			salarioTotal += salario
		 	filhoTotal += filhos 
			
		  se (salario > maiorSalario) //para achar o maior ou menor
                {
                    maiorSalario = salario 
                }
              
		  se(salario <= 100){
			contador++
		  }  
			
			
		}
		     mediaSalario = salarioTotal/20.0
		 	mediaFilhos = filhoTotal/20.0
		 	percentual = (contador * 100.0)/20.0
		 	escreva("Média de salário é: " + mediaSalario + "\n")
			escreva("Média de filhos é: " + mediaSalario + "\n")
			escreva("O maior salário é: " + maiorSalario + "\n")
			escreva("O percentual é: " + percentual + "%" + "\n")
		*/

		/*2- Desenvolver um sistema que efetue a soma de todos os números 
		 * ímpares que são  múltiplos de três e que se encontram no conjunto 
		 * dos números de 1 até 500.
		 */
/*
		inteiro numero =0
          inteiro total=0
       
      

        //entrada
        
           para(inteiro x = 1;x<500; x = x + 2){
            se ( (x%3)==0) {
            	     
               total = x + total                          
            }

        } 

        //saida
       escreva ("O total da soma de todos os número ímpares múltiplos de 3 de 1 até 500 é: " + total)
     */
		 //-------------------------WHILE--------------------------------

	/*1- Elaborar um programa que efetue a leitura sucessiva de valores 
	 * numéricos e apresente no final o total do somatório, a média e o 
	 * total de valores lidos. O programa deve fazer as leituras dos valores 
	 * enquanto o usuário estiver fornecendo valores positivos. Ou seja, 
	 * o programa deve parar quando o usuário fornecer um valor negativo.
	 */
	 inteiro valorInicial  = 0, total = 0
	 real media, contador = 0.0

	 enquanto(valorInicial >= 0){
	 	 escreva("Informe o valor inicial: \n")
		 leia(valorInicial)
		   se(valorInicial >= 0){
		   	total += valorInicial
		   }
		
		 contador++
	 	
	 }
	  media = total/contador
	 escreva("O total da soma dos números digitados é: " + total + "\n")
	 escreva("O total da média dos números digitados é: " + mat.arredondar(media,2) + "\n")
	 escreva("O total dos números digitados é: " + contador + "\n")
	}
	
	/*
		2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) 
		até que ele seja maior do que 100. Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte 
		sequência: 5 15 45 135.
		*/
/*
		inteiro valor = 0

			escreva("Escreva um valor menor que 100: \n")
			leia(valor)

		enquanto(valor <= 100){
			
			
			escreva("Os nums sao: " + (valor * 3))
			valor += 3
			
			
		}*/
 		
		/*
		 * 1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 quando estiver 
		 * entre 300 e 400 e de 5 em 5 quando não estiver.
		 */
/*
		 inteiro contador = 233, resultado

		  faca {
            contador += 3
            escreva ("\n" + (contador - 1))
           se(contador > 300 e contador < 400 ){
           	contador += 5
           	escreva ("\n" + contador)
            }
        } enquanto (contador > 233 e contador < 456)
*/

/*
 * 2- Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. Ex.: o usuário 
 * entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
 * 
 */

      inteiro valor = 0, contador = 0, soma = 0
      
		escreva("Escreva um num: \n ")
      	leia(valor)
      faca{ 	
     	    contador++
			escreva( contador + " + ")
     	    soma  += contador
     	    
      }enquanto(contador < valor)
      
      escreva("Total e: " + soma)
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2875; 
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
 * @POSICAO-CURSOR = 4695; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
=======
>>>>>>> ca59fb8661a1f807fc32f7fa89323d113a8db671
