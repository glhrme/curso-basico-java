package br.com.guisantos.ProgramacaoProcedural;

public class Programa {
	public static void main(String[] args) {
		System.out.println("Oi Mundo");
		int idade;
		idade = 21;
		double salario = 1000.80;
		System.out.println("Minha idade é: " + idade + " anos");
		System.out.println("Meu salário é: R$ " + salario);

		/**
		 * Exemplos de Divisão
		 * **/

		int divisao = 5 / 2;
		System.out.println(divisao);

		double segundaTentativaDeDivisao = 5 / 2;
		System.out.println(segundaTentativaDeDivisao);

		double terceiraTentativaDeDivisao = 5 / 2.0;
		System.out.println(terceiraTentativaDeDivisao);

		/** Java é mt chato, para um resoltado ser calcular como float, pelo menos um valor deve ser float **/
	}
}
