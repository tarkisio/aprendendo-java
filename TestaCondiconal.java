
public class TestaCondiconal {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoa = 3;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("Voc� n�o tem 18, mas pode entrar, pois est� acompanhando de outra pessoa");
			} else {
				System.out.println("Infelizmente voc� n�o pode entrar");
			}
		}
	}
}