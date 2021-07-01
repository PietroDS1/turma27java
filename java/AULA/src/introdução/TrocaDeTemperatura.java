package introdução;

public class TrocaDeTemperatura {

	public static void main(String[] args) {
		String nome = "Pietro"; //%s
		int teste = 1; //%d
		double tempCelsius = 25; //%f
		double resultado;
		double resultadoKelvin;
		
		resultado = (tempCelsius *1.8)+32;
		resultadoKelvin =(resultado - 32)*(5/9) + 273.15;
		System.out.println(nome);
		System.out.println(tempCelsius + " Graus Celsius");
		System.out.println(resultado + " Graus Farenheight");
		System.out.println(resultadoKelvin + " Graus Kelvin");
		

	}

}
