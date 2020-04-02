package aprendendoJava;

public class TesteIR {

	public static void main(String[] args) {

		double salario = 7597;
		double inss = 0.01;
		double aliquotaInss = 0.01;

		if (salario <= 1830.29) {
			aliquotaInss = 0.08;
			inss = salario * aliquotaInss;
		} else {
			if (salario >= 1830.3 && salario <= 3050.52) {
				aliquotaInss = 0.09;
				inss = salario * aliquotaInss;
			} else {
				if (salario >= 3050.53 && salario <= 6101.06) {
					aliquotaInss = 0.11;
					inss = salario * aliquotaInss;

				} else {

					inss = 671.11;
				}
			}
		}

		if (salario <= 1903.98) {
			salario = salario - inss;
			System.out.println("Sua alíquota é ISENTO, seu salário líquido será: " + salario + "seu inss deu valor de: "
					+ inss + "com a alíquota de: " + aliquotaInss);
		} else {
			if (salario >= 1903.99 && salario <= 2826.65) {
				salario = salario - inss;
				System.out.print("Sua alíquota é de 7,5%");
				double deducao = salario * 0.075 - 142.80;
				salario = salario - deducao;
				System.out.println(", o seu salário líquido será: " + salario + ", valor da dedução: " + deducao
						+ " e seu inss deu valor de: " + inss + " com a alíquota de: " + aliquotaInss);
			} else {
				if (salario >= 2826.66 && salario <= 3751.05) {
					salario = salario - inss;
					System.out.print("Sua alíquota é de 15%");
					double deducao = salario * 0.15 - 354.80;
					salario = salario - deducao;
					System.out.println(", o seu salário líquido será: " + salario + ", valor da dedução: " + deducao
							+ " e seu inss deu valor de: " + inss + " com a alíquota de: " + aliquotaInss);
				} else {
					if (salario >= 3751.06 && salario <= 4664.68) {
						salario = salario - inss;
						System.out.print("Sua alíquota é de 22.5%");
						double deducao = salario * 0.225 - 636.13;
						salario = salario - deducao;
						System.out.println(", o seu salário líquido será: " + salario + ", valor da dedução: " + deducao
								+ " e seu inss deu valor de: " + inss + " com a alíquota de: " + aliquotaInss);
					} else {
						salario = salario - inss;
						System.out.print("Sua alíquota é de 27.5%");
						double deducao = salario * 0.275 - 869.36;
						salario = salario - deducao;
						System.out.println(", o seu salário líquido será: " + salario + ", valor da dedução: " + deducao
								+ " e seu inss deu valor de: " + inss);
					}
				}
			}

		}

	}

}
