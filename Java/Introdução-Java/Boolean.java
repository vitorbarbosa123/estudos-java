package estudos;

public class Boolean {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		boolean quantidadePessoas = true;
		if (idade >= 18 || quantidadePessoas) {
			System.out.println("vocẽ tem mais de 18 anos ou está acompanhado");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}

