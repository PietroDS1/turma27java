package Entities;

public class Time {
		private String nome;
		private int pontos;
		public Time(String nome, int pontos) {
			super();
			this.nome = nome;
			this.pontos = pontos;
		}
		public Time(String nome) {
			super();
			this.nome = nome;
			
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getPontos() {
			return pontos;
		}
		
		public void darPontos(char status) {
			if(status == 'G') {
				pontos+=3;
			}else if(status == 'E') {
				pontos+=1;
			}else if(status == 'P') {
				pontos+=0;
			}else {
				System.out.printf("Caracter Inválido!");
			}
			
		}
		
		
		
		
		
		
}
