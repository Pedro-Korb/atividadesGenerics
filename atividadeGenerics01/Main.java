package atividadeGenerics01;

public class Main {
	public static void main(String[] args) {
		
		int inteiro = 10;
		String texto = "Hello world";
		double real = 3.141516;
		boolean booleano = false;
		float numerico = 15;
		
		Generico<Integer> testeInteiro = new Generico<Integer>(inteiro);
		System.out.println("Tipo 'Integer' = "  + testeInteiro.getGenerico());
		
		Generico<String> testeTexto = new Generico<String>(texto);
		System.out.println("Tipo 'String' = " + testeTexto.getGenerico());
		
		Generico<Double> testeReal = new Generico<Double>(real);
		System.out.println("Tipo 'Double' = " + testeReal.getGenerico());
		
		Generico<Boolean> testeBoolean = new Generico<Boolean>(booleano);
		System.out.println("Tipo 'Boolean' = " + testeBoolean.getGenerico());
		
		Generico<Float> testeNumerico = new Generico<Float>(numerico);
		System.out.println("Tipo 'Float' = " + testeNumerico.getGenerico());
		
		
		Pessoa pessoa = new Pessoa("Pedro Korb", "29/03/2004", "M", "Agronômica - Mosquito Grande");
		Generico<Pessoa> testePessoa = new Generico<Pessoa>(pessoa);
		System.out.println(testePessoa);
	}

}
