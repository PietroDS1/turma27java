programa
{
	
	funcao inicio()
	{
	//TESTE SE VC E CRINGE
		inteiro NuM, resultado
		cadeia nome, resposta
	
 		logico morto = falso 
 		
		escreva("Escreva seu nome: \n")
		leia (nome)

		escreva("A pessoa esta morta sim ou nao? ")
		leia (resposta)

		

		
			se(resposta == "sim"){
			morto = verdadeiro
			escreva("Meus pesames, n podera prosseguir!")
		}
		senao{
			escreva("Podera prosseguir!")
		}
		

		
		
		
		escreva("Escreva sua data de nascimento: \n")
		leia (NuM)

		resultado =  2021 - NuM
    enquanto( morto == falso){
    	
    
		se(NuM <= 35 ){
			escreva( nome + ".Vc e Cringe e tem: " + resultado + " anos")
			
		}
		senao{
			escreva(nome + ".Vc e legal e tem: " + resultado + " anos")
		}
    }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 407; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
<<<<<<< HEAD
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
=======
>>>>>>> ca59fb8661a1f807fc32f7fa89323d113a8db671
 */