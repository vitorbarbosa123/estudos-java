package estudos;

public class TesteMultiploDeTres {
	public static void main(String[] args) {
		int numero = 3;
		int valor = 0;
		for (int multiplica = 0; multiplica <= 100; multiplica++) {
			if (numero % 3 == 0) {
				valor = multiplica * 3;
			}
			
			if (valor >= 100) {
				break;
			}
		System.out.println(valor);
		}
		
		System.out.println();
		
		// método mais simples
		
		for (int i = 3; i < 100; i+=3) {
			System.out.println(i);
		}
	}
}
