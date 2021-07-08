package ObjetosReais;

public class patineteObjeto {
		public int rodas;
		public boolean ligado;
		public String energia;
		public int velocidade;
		
		
		public void checaOn() {	
			ligado = true;		
		}
		public void checaOff() {
			ligado = false;
		}
		public void checaEnergia() {
			if(energia == "Sim" || energia == "sim") {
				System.out.println("Patinete movido a energia elétrica.");
			}
			else {
				System.out.println("Patinete movido a energia mecânica.");
			}
		}
		public int checaVelo() {
			for(int x = 0; x<=10; x++) {
				velocidade++;
			}
			return velocidade;
			
		}
		public void checaRodas() {
			if(rodas == 2) {
				System.out.println("Patinete normal!");
			}
			else {
				System.out.println("Patinete estranho!");
			}
		}
}
