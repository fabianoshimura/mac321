
public class exericio3_classeTesteBigInteger {

	public static void main(String[] args) {
		exercicio3_fatorialBigInteger obj = new exercicio3_fatorialBigInteger();
		
		if (120 == obj.fatorial("5").intValue()){
			System.out.println("CORRETO\n");
		}
		if (24 == obj.fatorial("4").intValue()){
			System.out.println("CORRETO\n");
		}
		if (6 == obj.fatorial("3").intValue()){
			System.out.println("CORRETO\n");
		}
		if (2 == obj.fatorial("2").intValue()){
			System.out.println("CORRETO\n");
		}
		if (1 == obj.fatorial("1").intValue()){
			System.out.println("CORRETO\n");
		}
	}

}
