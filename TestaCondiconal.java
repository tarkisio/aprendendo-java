
public class TestaCondiconal {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoa = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("Você não tem 18, mas pode entrar, pois está acompanhando de outra pessoa");
			} else {
				System.out.println("Infelizmente você não pode entrar");
			}
		}
	}
}