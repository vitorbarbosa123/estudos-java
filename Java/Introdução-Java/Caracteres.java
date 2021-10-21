package estudos;

public class Caracteres {

	public static void main(String[] args) {
		char letra = 'a';
		// sempre aspas simples
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "vitor barbosa";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		// ao somar uma string com qualquer outro tipo, ele irá transformar tudo para string.

	}

}
