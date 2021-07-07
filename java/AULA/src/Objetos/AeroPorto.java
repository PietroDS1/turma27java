package Objetos;

public class AeroPorto {
	public static void main (String[] args) {
		//INSTANCIAS
		Aviao aviao1 = new Aviao();
		
		aviao1.tipo = "Passageiro 14 lugares";
		aviao1.rodas = 3;
		aviao1.ar = false;
		aviao1.ligado = false;
		aviao1.velocidade = 0;
		//Aviao pra voar
		
		aviao1.ligar();
		aviao1.decolando();
		aviao1.aumentarVelocidade(40);
		System.out.println("Velocímetro: "+ aviao1.velocidade + " no ar " + aviao1.ar + " ligado " + aviao1.ligado + "\n");
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		System.out.println("Velocímetro: "+ aviao1.velocidade + " no ar " + aviao1.ar + " ligado " + aviao1.ligado + "\n");
		aviao1.diminuirVelocidade(50);
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		System.out.println("Velocímetro: "+ aviao1.velocidade + " no chão " + aviao1.ar + " ligado " + aviao1.ligado + "\n");
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		
		aviao1.pousa();
		
		aviao1.desligar();
		System.out.println("Velocímetro: "+ aviao1.velocidade + " no chão " + aviao1.ar + " desligado " + aviao1.ligado);
	}
}
