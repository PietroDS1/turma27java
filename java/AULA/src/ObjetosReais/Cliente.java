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
			System.out.printf("Voc� est� abaixo da m�dia!");
		}
		else {
			System.out.printf("T� grande!");
		}
		return;
	}
	
	public void tipoCabelo() {
		if(cabelo.equals("Loiro")) {
			System.out.printf("Voc� tem cabelo loiro");
		}
		else if(cabelo.equals("Liso")) {
			System.out.println("Voc� tem cabelo liso");
		}
		else if(cabelo.equals("Cacheado")) {
			System.out.printf("Voc� tem cabelo cacheado");
		}
		else if(cabelo.equals("Ruivo")) {
			System.out.printf("Voc� tem cabelo ruivo");
		}
		else {
			System.out.printf("Voc� � careca");
		}
		return;
	}
	public void racaNBJ() {
		if(raca.equals("Branco")) {
			System.out.printf("Caucasiano");
		}
		else if(raca.equals("Japones")) {
			System.out.printf("Asi�tico");
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
		System.out.printf("Apresenta defici�ncia");
		}
	
	}
	
	
	
	
}
