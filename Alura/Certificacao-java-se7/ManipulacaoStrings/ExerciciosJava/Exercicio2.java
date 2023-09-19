
class B {
	String msg;

	void imprime() {
		if (!msg.isEmpty())
			System.out.println(msg);
		else
			System.out.println("vazio");
	}
}

class Exercicio2 {
	public static void main(String[] args) {
		B b = new B();

		b.imprime();
	}
}