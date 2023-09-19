
public class TestaStringBufferEBuilder {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Aula");
		stringBuffer.append(" - ");
		stringBuffer.append(" Java ");
		System.out.println(stringBuffer.toString());
		
		StringBuffer sb2 = new StringBuffer(50);
		System.out.print(sb2.toString());
		
		StringBuffer sb3 = new StringBuffer(stringBuffer);
		sb3.append(" Formação em tecnologia.");
		System.out.println(sb3);
		
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("String Builder");
		sbuilder.append(" - ");
		
		StringBuilder sbuilder2 = new StringBuilder(sbuilder);
		sbuilder2.append(" Java");
		System.out.println(sbuilder2);
		
		sbuilder2.append(new Carro());
		System.out.println(sbuilder2);
		
		StringBuilder sb4 = new StringBuilder("Aula de Java - Certificação");
		
		sb4.insert(14, " aula de");
		System.out.println(sb4);
		
		sb4.delete(6, 15);
		System.out.println(sb4);
		
		String valor = sb4.toString();
		
		System.out.println(new StringBuffer("Teste de contrario").reverse());
		
		StringBuilder sb5 = new StringBuilder("Aula de Java");
		System.out.println(sb5.substring(5,8));
		System.out.println(sb5.subSequence(3, 10));
		System.out.println(sb5);
	}
}
