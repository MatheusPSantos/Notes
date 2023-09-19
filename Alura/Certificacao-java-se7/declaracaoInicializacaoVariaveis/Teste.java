class Carro {
	int ano;
	char primeiraLetra;
	boolean usado;
	Motor motor;
}

class Motor {}

public class Teste {
	public static void main(String[] args) {
		int idade;
		if (args.length > 10) {
			idade = 15;
		} else {
			System.out.println("Imprime outra coisa");
			idade = 0;
		}
		System.out.println(idade);
		
		Carro carro = new Carro();
		System.out.println(carro.ano);
		System.out.println(carro.primeiraLetra);
		System.out.println(carro.usado);
		System.out.println(carro.motor);
		
		char caractereUnicode = '\u0A39';
		
		System.out.println("caractere unicode >>>  " + caractereUnicode);
	}
}
