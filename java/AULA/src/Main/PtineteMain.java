package Main;
import ObjetosReais.patineteObjeto;
public class PtineteMain {

	public static void main(String[] args) {
		patineteObjeto patinete = new patineteObjeto();
		
		patinete.ligado = true;
		patinete.rodas = 2;
		patinete.energia = "Sim";
		patinete.velocidade = 0;
		
		if(patinete.ligado == true) {
			patinete.checaOn();
			patinete.checaRodas();
			patinete.checaEnergia();
			patinete.checaVelo();
			System.out.printf("Velocidade atual: "+ patinete.checaVelo()+" Km/h");
			
		}
		else {
			patinete.checaOn();
			//System.out.println("\n");
			patinete.checaRodas();
			//System.out.println("\n");
			patinete.checaEnergia();
			//System.out.println("\n");
			
			//System.out.println("\n");
			
			System.out.printf("Velocidade atual: "+ patinete.checaVelo()+" Km/h");
		}

	}

}
