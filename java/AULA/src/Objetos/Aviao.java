package Objetos;
//CLASSE SEMPRE EM MAIUSCULO
public class Aviao {
	
	//atributos
	public int rodas;
	public int asas;
	public int tamanho;
	public String tipo;
	public boolean ar;
	public boolean ligado;
	public int velocidade;
	
	public void ligar() {
		ligado = true;
	}
	public void desligar() {
		ligado = false;
	}
	public void decolando() {
		for(int x = 1; x<=10;x++) {
			aumentarVelocidade();
		}
		
		ar = true;
	}
	
	
	public void aumentarVelocidade() {
		velocidade++;
	}
	public void aumentarVelocidade(int acrescimo) {
		velocidade+=acrescimo;
	}
	public void diminuirVelocidade() {
		velocidade--;
	}
	public void pousa() {
		for(int x = 10; x<=0;x--) {
			diminuirVelocidade();
		}
		ar = false;
	}
	public void diminuirVelocidade(int decremento) {
		velocidade-=decremento;
	}
	
}
