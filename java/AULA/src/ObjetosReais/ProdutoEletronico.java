package ObjetosReais;

public class ProdutoEletronico {
	//celular
	public int fucionalidades;
	public double preco;
	public String hardware;
	public int camera;
	public double tamanho;
	
	
	public void checaFuncionalidades() {
		if(fucionalidades >= 5) {
			System.out.println("Seu celular é topo de linha!");
		}
		else if(fucionalidades >= 3 && fucionalidades < 5) {
			System.out.println("Seu celular é intermediário!");
		}
		else {
			System.out.println("Seu celular é ruim!");
		}
	}
	
	public void checaPreco() {
		if(preco >= 3000) {
			System.out.println("Seu celular é caro!");
		}
		else if(preco>=999 && preco < 2999) {
			System.out.println("Seu celular tá no precinho!");
		}
		else {
			System.out.println("Seu celular é baratinho!");
		}
	}
	
	public void checaHardware() {
		if(hardware == "Bom" || hardware == "bom") {
			System.out.println("Seu celular é rápido!");
		}
		else {
			System.out.println("Seu celular é lento!");
		}
	}
	
	public void checaCamera() {
		if(camera >= 48) {
			System.out.println("Sua câmera é muito boa, e possui: " + camera + " megapixels!");
		}
		else if(camera >= 30 && camera < 48) {
			System.out.println("Sua câmera é mediana, e possui: " + camera + " megapixels!");
		}
		else {
			System.out.println("Sua câmera é muito ruim, e possui: " + camera + " megapixels!");
		}
	}
	
	public void checaTamanho() {
		if(tamanho >= 50) {
			System.out.println("Celular grande!");
		}
		else if(tamanho >= 30 && tamanho < 50) {
			System.out.println("Celular médio!");
		}
		else {
				System.out.println("Parece um Galaxy Pocket!");		 
		}
	}
	
	
	
	
}
