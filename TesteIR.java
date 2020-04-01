
public class TesteIR {

	public static void main(String[] args) {

		double salario = 6925.89;

		if (salario <= 1903.98) {
			System.out.println("Sua alíquota é ISENTO, seu salário líquido será: " + salario);
		} else {
			if (salario >= 1903.99 && salario <= 2826.65) {
				System.out.print("Sua alíquota é de 7,5%");
				double deducao = salario * 0.075 - 142.80;
				salario = salario - deducao;
				System.out.println(", o seu salário líquido será: " + salario + ", valor da dedução: " + deducao);
			} else {
				if (salario >= 2826.66 && salario <= 3751.05) {
					System.out.print("Sua alíquota é de 15%");
					double deducao = salario * 0.15 - 354.80;
					salario = salario - deducao;
					System.out.println(", o seu salário líquido será: " + salario + ", valor da dedução: " + deducao);
				} else {
					if (salario >= 3751.06 && salario <= 4664.68) {
						System.out.print("Sua alíquota é de 22.5%");
						double deducao = salario * 0.225 - 636.13;
						salario = salario - deducao;
						System.out
								.println(", o seu salário líquido será: " + salario + ", valor da dedução: " + deducao);
					} else {
						System.out.print("Sua alíquota é de 27.5%");
						double deducao = salario * 0.275 - 869.36;
						salario = salario - deducao;
						System.out
								.println(", o seu salário líquido será: " + salario + ", valor da dedução: " + deducao);
					}
				}
			}

		}

	}

}
