class Carros {
	Carro c1;
	Carro c2;
}

public class TestaCicloDeVida {
	public static void main(String[] args) {
		// Carro c; // não cria um objeto
		Carro c = new Carro(); // carro foi criado e uma referencia foi adicionada a c
		c.ano = 2014;
		c.modelo = "Ferrari";
		
		// agora o primeiro Carro nao esta mais acessivel pelo programa
		c = new Carro();
		
		c = null; // muda a referencia do objeto Carro para null
		// agora sao dois objetos inacessiveis
		
		if(15 > 10) {
			// o Carro c2 não sera acessivel fora do if
			Carro c2 = new Carro();
			c2.ano = 2010;
		}
		
		for (int i = 0; i < 10; i++) {
			Carro c3 = new Carro();
		}
		
		// quando sair do loop c4 ainda existe, e ela referencia o ultimo carro referenciado
		Carro c4;
		for (int i = 0; i < 10; i++) {
			c4 = new Carro();
		}
		
		// A partir do momento que os objetos ficam inacessíveis o Garbage Collector pode
		// jogar fora os objetos a qualquer momento.
		
		// Por padrão não sabemos quando o Garbage collector pode rodar.
		// Não podemos saber quantos forma coletados
		
		// Referencias indiretas não são coletados
		Carros carros =  new Carros();
		carros.c1 = c;
		carros.c2 = c4;
		
	}
}
