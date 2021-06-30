<<<<<<< HEAD
programa
{
	
	funcao inicio()
	{
=======
programa
{
	
	funcao inicio()
	{
>>>>>>> ca59fb8661a1f807fc32f7fa89323d113a8db671
	/*
		cadeia alunos[4] = {"Pietro","Lucas","Felipe","Enzo"}
		inteiro notas[4] = {6,5,4,3}
		inteiro soma = 0

		para(inteiro i = 0; i<4; i++){
			
			escreva(i + ": " +  alunos[i] + " sua nota é: "+ notas[i]+"\n" )
			soma += notas[i]
		}
		escreva("A soma das notas é: " + soma)
		*/
		cadeia nome[4]
		inteiro nota[4]
		inteiro soma = 0

		para(inteiro x = 0; x<4; x++){
			escreva("escreva os nomes dos alunos: ")
			leia (nome[x])
			escreva("escreva as notas dos alunos: ")
			leia (nota[x])
			
			se(nota[x] <=5){
				escreva(x + ": " + nome[x] + " sua nota é: "+ nota[x]+ "Ainda não, continue a estudar!\n " )		
			}
			senao{
				escreva(x + ": " + nome[x] + " sua nota é: "+ nota[x]+ "Parabéns você está aprovado\n " )
			}
			soma += nota[x]
		}
		escreva ("A soma das notas dos alunos é: " + soma) 
		
	
			
		
			
			
		
<<<<<<< HEAD
	}
}
=======
	}
}
>>>>>>> ca59fb8661a1f807fc32f7fa89323d113a8db671
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 763; 
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
 * @POSICAO-CURSOR = 1269; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
=======
>>>>>>> ca59fb8661a1f807fc32f7fa89323d113a8db671
 */