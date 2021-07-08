package Main;
import ObjetosReais.ProdutoEletronico;
public class ProdutoMainEletronico {

	public static void main(String[] args) {
		ProdutoEletronico celular  = new ProdutoEletronico();
	
	celular.fucionalidades = 5;
	celular.preco = 2100;
	celular.hardware = "Bom";
	celular.camera = 20;
	celular.tamanho = 47;
	
	celular.checaFuncionalidades();
	System.out.println("\n");
	celular.checaPreco();
	System.out.println("\n");
	celular.checaHardware();
	System.out.println("\n");
	celular.checaCamera();
	System.out.println("\n");
	celular.checaTamanho();
	System.out.println("\n");
	
	}

}
