package Lista4ExerciciosJava;
import java.util.Random;
import java.util.Scanner;
public class ArrayEmatriz {

	public static void main(String[] args) {
		/*EXERCICIO 1
		int vetor[]= {0,1,2,3,4}, maiorValor = 0;
				for(int i = 0; i<5; i++){
					System.out.println(i + " ");
					maiorValor = vetor[i];
				}
				System.out.println("\n"+"O maior valor desse vetor �: " + maiorValor);
		*/
				/*EXERCICIO 2
				int contador=0, maiorNum =0;
				Random random = new Random();
				double media = 0.0;
				
				for(int x = 0; x<=10;x++){
				
					System.out.println("Os valores sorteados s�o: " + random + "\n");
					int num = random. nextInt(6);
					contador += num;
					 if (x > maiorNum)
					 {
		                    maiorNum = x;
		                }
				}
				media = contador/10;
				System.out.println("A m�dia aritm�tica dos n�meros sorteados �: " + media);
				System.out.println("\nA maior pontua��o �: " + maiorNum);//para achar o maior ou menor
				*/
		/*EXERCICIO 3
				    int N1[][] = new int[4][6];
				    int N2[][] = new int[4][6]; 
				    int	M1[][] = new int[4][6]; 
				    int	M2[][] = new int[4][6];
				 
				 Scanner read = new Scanner (System.in);

			for (int i = 0; i < 4; i++){
				for(int a = 0; a < 6; a++){
					System.out.println("Digite o valor para a matriz N1"+ i+ ","+ a + " : ");
					N1[i][a] = read.nextInt();
				}
			}

			System.out.println("\n");

			for (int i = 0; i < 4; i++){
				for (int a = 0; a < 6; a++){
					System.out.println("Digite o valor para a matriz N2" + i + "," + a +  " : ");
					N2[i][a] = read.nextInt();
				}
			}

			
			
			for (int i = 0; i < 4; i++){
				for (int a = 0; a < 6; a++){
					M1[i][a] = N1[i][a] + N2[i][a];
				}
			}

			for (int i = 0; i < 4; i++){
				for (int a = 0; a < 6; a++){
					M2[i][a] = N1[i][a] - N2[i][a];
				}
			}

			System.out.println("MATRIZ N1\n");
			for (int i = 0; i < 4; i++){
				for (int a = 0; a < 6; a++){
					System.out.println(N1[i][a]);
				}
				System.out.println("\n");
			}

			System.out.println("\nMATRIZ N2\n");
			for (int i = 0; i < 4; i++){
				for (int a = 0; a < 6; a++){
					System.out.println(N2[i][a]);
				}
				System.out.println("\n");
			}

			System.out.println("\nMATRIZ M1\n");
			for (int i = 0; i < 4; i++){
				for (int a = 0; a < 6; a++){
					System.out.println(M1[i][a]);
				}
				System.out.println("\n");
			}

			System.out.println("\nMATRIZ M2\n");
			for (int i = 0; i < 4; i++){
				for (int a = 0; a < 6; a++){
					System.out.println(M2[i][a]);
				}
				System.out.println("\n");
			}
			*/
		//EXERCICIO 4
				Scanner read = new Scanner (System.in);
				int m [][] = new int [3][3];
				int nums, soma = 0, somaDiagonal = 0;		
				for(int i = 1;i<8;i++){			
				System.out.println("Escreva at� 9 n�meros : \n");
				nums = read.nextInt();			
				m [0][0] = nums;
				nums = read.nextInt();					
				m [0][1] = nums;
				nums = read.nextInt();					
				m [0][2] = nums;	
				nums = read.nextInt();				
				m [1][0] = nums;
				nums = read.nextInt();				
				m [1][1] = nums;
				nums = read.nextInt();				
				m [1][2] = nums	;
				nums = read.nextInt();				
				m [2][0] = nums;
				nums = read.nextInt();
				m [2][1] = nums;
				nums = read.nextInt();
				m [2][2] = nums;
				soma = m[0][0] + m[0][1] + m[0][2]+m[1][0] + m[1][1] + m[1][2]+m[2][0] + m[2][1] + m[2][2];
				somaDiagonal = m[0][0] + m[1][1] + m[2][2];		
				}
				System.out.println("A soma dos valores de dentro da matriz �: " + soma + "\n");
				System.out.println("A soma diagonal dos valores de dentro da matriz �: " + somaDiagonal);
	
	
	}

}
