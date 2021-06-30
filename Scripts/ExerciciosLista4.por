<<<<<<< HEAD
programa
{
	inclua biblioteca Util
 
	
	funcao inicio()
	{
		/*EXERCICIO 1
		inteiro vetor[5]= {0,1,2,3,4}, maiorValor = 0
		para(inteiro i = 0; i<5; i++){
			escreva(i + " ")
			maiorValor = vetor[i]
		}
		escreva("\n"+"O maior valor desse vetor é: " + maiorValor)
		*/
		/*EXERCICIO 2
		inteiro random, contador=0, maiorNum =0
		real media = 0.0
		
		para(inteiro x = 0; x<=10;x++){
			random = Util.sorteia(1, 6)
			escreva("Os valores sorteados são: " + random + "\n")
			contador += random
			 se (x > maiorNum) //para achar o maior ou menor
                {
                    maiorNum = x
                }
		}
		media = contador/10
		escreva("A média aritmética dos números sorteados é: " + media)
		escreva("\nA maior pontuação é: " + maiorNum)
		*/
	
		
			 inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
			 inteiro linhas = 4, colunas = 6

		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva("Digite o valor para a matriz N1"+ i+ ","+ a + " : ")
				leia(N1[i][a])
			}
		}

		escreva("\n")

		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva("Digite o valor para a matriz N2" + i + "," + a +  " : ")
				leia(N2[i][a])
			}
		}

		
		
		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				M1[i][a] = N1[i][a] + N2[i][a]
			}
		}

		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				M2[i][a] = N1[i][a] - N2[i][a]
			}
		}

		escreva("MATRIZ N1\n")
		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva(N1[i][a], "\t")
			}
			escreva("\n")
		}

		escreva("\nMATRIZ N2\n")
		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva(N2[i][a], "\t")
			}
			escreva("\n")
		}

		escreva("\nMATRIZ M1\n")
		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva(M1[i][a], "\t")
			}
			escreva("\n")
		}

		escreva("\nMATRIZ M2\n")
		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva(M2[i][a], "\t")
			}
			escreva("\n")
		}
		
		
		


		
   
 		/*EXERCICIO 4
		inteiro m [3][3],nums, soma = 0, somaDiagonal = 0
		
		para(inteiro i = 1;i<8;i++){
		
		escreva("Escreva até 9 números : \n")
		leia(nums)
		
		m [0][0] = nums
		leia(nums)
				
		m [0][1] = nums
		leia(nums)
			
		m [0][2] = nums	
		leia(nums)
		
		m [1][0] = nums
		leia(nums)
		
		m [1][1] = nums
		leia(nums)
		
		m [1][2] = nums	
		leia(nums)
		
		m [2][0] = nums
		leia(nums)
			
		m [2][1] = nums
		leia(nums)
		
		m [2][2] = nums
		

		
		soma = m[0][0] + m[0][1] + m[0][2]+m[1][0] + m[1][1] + m[1][2]+m[2][0] + m[2][1] + m[2][2]
		somaDiagonal = m[0][0] + m[1][1] + m[2][2]	
		pare
			
		
			
		}
   		escreva("A soma dos valores de dentro da matriz é: " + soma + "\n")
   		escreva("A soma diagonal dos valores de dentro da matriz é: " + somaDiagonal)
 		*/
  }
}
	
		


		
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1834; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 33, 10, 2}-{N2, 33, 20, 2}-{M1, 33, 30, 2}-{M2, 33, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
=======
programa
{
	inclua biblioteca Util
 
	
	funcao inicio()
	{
		/*EXERCICIO 1
		inteiro vetor[5]= {0,1,2,3,4}, maiorValor = 0
		para(inteiro i = 0; i<5; i++){
			escreva(i + " ")
			maiorValor = vetor[i]
		}
		escreva("\n"+"O maior valor desse vetor é: " + maiorValor)
		*/
		/*EXERCICIO 2
		inteiro random, contador=0, maiorNum =0
		real media = 0.0
		
		para(inteiro x = 0; x<=10;x++){
			random = Util.sorteia(1, 6)
			escreva("Os valores sorteados são: " + random + "\n")
			contador += random
			 se (x > maiorNum) //para achar o maior ou menor
                {
                    maiorNum = x
                }
		}
		media = contador/10
		escreva("A média aritmética dos números sorteados é: " + media)
		escreva("\nA maior pontuação é: " + maiorNum)
		*/
	
		
			 inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
			 inteiro linhas = 4, colunas = 6

		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva("Digite o valor para a matriz N1"+ i+ ","+ a + " : ")
				leia(N1[i][a])
			}
		}

		escreva("\n")

		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva("Digite o valor para a matriz N2" + i + "," + a +  " : ")
				leia(N2[i][a])
			}
		}

		
		
		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				M1[i][a] = N1[i][a] + N2[i][a]
			}
		}

		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				M2[i][a] = N1[i][a] - N2[i][a]
			}
		}

		escreva("MATRIZ N1\n")
		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva(N1[i][a], "\t")
			}
			escreva("\n")
		}

		escreva("\nMATRIZ N2\n")
		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva(N2[i][a], "\t")
			}
			escreva("\n")
		}

		escreva("\nMATRIZ M1\n")
		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva(M1[i][a], "\t")
			}
			escreva("\n")
		}

		escreva("\nMATRIZ M2\n")
		para (inteiro i = 0; i < 4; i++){
			para (inteiro a = 0; a < 6; a++){
				escreva(M2[i][a], "\t")
			}
			escreva("\n")
		}
		
		
		


		
   
 		/*EXERCICIO 4
		inteiro m [3][3],nums, soma = 0, somaDiagonal = 0
		
		para(inteiro i = 1;i<8;i++){
		
		escreva("Escreva até 9 números : \n")
		leia(nums)
		
		m [0][0] = nums
		leia(nums)
				
		m [0][1] = nums
		leia(nums)
			
		m [0][2] = nums	
		leia(nums)
		
		m [1][0] = nums
		leia(nums)
		
		m [1][1] = nums
		leia(nums)
		
		m [1][2] = nums	
		leia(nums)
		
		m [2][0] = nums
		leia(nums)
			
		m [2][1] = nums
		leia(nums)
		
		m [2][2] = nums
		

		
		soma = m[0][0] + m[0][1] + m[0][2]+m[1][0] + m[1][1] + m[1][2]+m[2][0] + m[2][1] + m[2][2]
		somaDiagonal = m[0][0] + m[1][1] + m[2][2]	
		pare
			
		
			
		}
   		escreva("A soma dos valores de dentro da matriz é: " + soma + "\n")
   		escreva("A soma diagonal dos valores de dentro da matriz é: " + somaDiagonal)
 		*/
  }
}
	
		


		
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1834; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 33, 10, 2}-{N2, 33, 20, 2}-{M1, 33, 30, 2}-{M2, 33, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
>>>>>>> ca59fb8661a1f807fc32f7fa89323d113a8db671
