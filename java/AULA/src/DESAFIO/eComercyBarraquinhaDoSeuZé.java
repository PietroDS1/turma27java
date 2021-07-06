package DESAFIO;
import java.util.Scanner;
public class eComercyBarraquinhaDoSeuZé {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String[] produtos = { "Uva    ", "Maçã   ", "Banana", "Laranja", "Pera   " };
		String[] codigos = new String[produtos.length];
		double[] precos = { 3.00, 8.00, 4.00, 2.50, 12.00 };
		int[] estoques = { 10, 10, 10, 10, 10 };

		for (int i = 0; i < produtos.length; i++) {
			if (i < 10) {
				codigos[i] = "G5-0" + i;
			} else {
				codigos[i] = "G5-" + i;
			}
		}
		System.out.printf("Códigos \t Produtos \t Preços \t Estoques\n");
		for (int i = 0; i < produtos.length; i++) {
			System.out.printf("%s \t\t %s \t %.2f \t\t %d\n", codigos[i], produtos[i], precos[i], estoques[i]);
		}

		int[] carrinho = new int[produtos.length];
		int[] quantidade = new int[produtos.length];
		String codigoCarrinho;
		double soma, imposto, somaTotal;
		char continuar = 's';
		do {
			System.out.print("Digite o código do produto: ");
			codigoCarrinho = ler.next();
			for (int i = 0; i < produtos.length; i++) {
				if (codigoCarrinho.equals(codigos[i])) {
					System.out.print("Digite a quantidade: ");
					quantidade[i] = ler.nextInt();
					if (quantidade[i] <= estoques[i]) {
						estoques[i] -= quantidade[i];
						soma = precos[i] * quantidade[i];
						imposto = (soma*0.09)/100;
						somaTotal = soma + imposto;
						System.out.printf("%s \t\t %s \t %.2f \t\t %d\n %.2f\n%.2f\n%.2f\n", (codigos[i]), produtos[i], precos[i],
								estoques[i], soma, imposto, somaTotal);
					} else {
						System.out.println("Estoque insuficiente.");
						System.out.printf("%s \t\t %s \t %.2f \t\t %d\n", (codigos[i]), produtos[i], precos[i],
								estoques[i]);
					}
				}
				System.out.println("Deseja continuar? (S/N)");
				continuar = ler.next().charAt(1);
			}

		}while (continuar == 'n' || continuar == 'N');
		//ler.close();
	}
}
