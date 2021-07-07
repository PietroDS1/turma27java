package ObjetosReais;

public class Cliente {
	public int pernas;
	public int bracos;
	public int maos;
	public int pes;
	public double tamanho;
	public boolean sexo;
	public String raca;
	public String cabelo;
	
	public void altura() {
		if(tamanho <= 1.60) {
			System.out.printf("Você está abaixo da média!");
		}
		else {
			System.out.printf("Tá grande!");
		}
		return;
	}
	
	public void tipoCabelo() {
		if(cabelo.equals("Loiro")) {
			System.out.printf("Você tem cabelo loiro");
		}
		else if(cabelo.equals("Liso")) {
			System.out.println("Você tem cabelo liso");
		}
		else if(cabelo.equals("Cacheado")) {
			System.out.printf("Você tem cabelo cacheado");
		}
		else if(cabelo.equals("Ruivo")) {
			System.out.printf("Você tem cabelo ruivo");
		}
		else {
			System.out.printf("Você é careca");
		}
		return;
	}
	public void racaNBJ() {
		if(raca.equals("Branco")) {
			System.out.printf("Caucasiano");
		}
		else if(raca.equals("Japones")) {
			System.out.printf("Asiático");
		}
		else {
			System.out.printf("Negro");
		}
		return;
	}
	public void sexoFeminino() {
		sexo = true;
		return;
	}
	public void sexoMasculino() {
		sexo = false;
		return;
	}
	public void deficiencia() {
	if(pernas == 1 || bracos == 1 || maos == 1 ||pes == 1) {
		System.out.printf("Apresenta deficiência");
		}
	
	}
	
	
	
	
}
