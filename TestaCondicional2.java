
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidade = 3;
		boolean acompanhado = quantidade >=2;

		System.out.println("Valor acompanhado  = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");

		}
	}

}
