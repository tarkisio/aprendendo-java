
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 18;
		int quantidade = 1;

		// boolean acompanhado = quantidade >=2;
		boolean acompanhado;

		if (quantidade >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("Valor acompanhado  = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");

		}
	}
}
