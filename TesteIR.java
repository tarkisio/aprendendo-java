
public class TesteIR {

	public static void main(String[] args) {

		double salario = 6925.89;

		if (salario <= 1903.98) {
			System.out.println("Sua al�quota � ISENTO, seu sal�rio l�quido ser�: " + salario);
		} else {
			if (salario >= 1903.99 && salario <= 2826.65) {
				System.out.print("Sua al�quota � de 7,5%");
				double deducao = salario * 0.075 - 142.80;
				salario = salario - deducao;
				System.out.println(", o seu sal�rio l�quido ser�: " + salario + ", valor da dedu��o: " + deducao);
			} else {
				if (salario >= 2826.66 && salario <= 3751.05) {
					System.out.print("Sua al�quota � de 15%");
					double deducao = salario * 0.15 - 354.80;
					salario = salario - deducao;
					System.out.println(", o seu sal�rio l�quido ser�: " + salario + ", valor da dedu��o: " + deducao);
				} else {
					if (salario >= 3751.06 && salario <= 4664.68) {
						System.out.print("Sua al�quota � de 22.5%");
						double deducao = salario * 0.225 - 636.13;
						salario = salario - deducao;
						System.out
								.println(", o seu sal�rio l�quido ser�: " + salario + ", valor da dedu��o: " + deducao);
					} else {
						System.out.print("Sua al�quota � de 27.5%");
						double deducao = salario * 0.275 - 869.36;
						salario = salario - deducao;
						System.out
								.println(", o seu sal�rio l�quido ser�: " + salario + ", valor da dedu��o: " + deducao);
					}
				}
			}

		}

	}

}
