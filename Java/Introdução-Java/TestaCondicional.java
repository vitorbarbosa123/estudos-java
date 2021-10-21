package estudos;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 2;
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("vocẽ tem mais de 18 anos ou está acompanhado");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
