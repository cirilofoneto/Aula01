import java.util.Scanner;

public class TrabalhandoComNumeros {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int valor1;
		int valor2;
		int soma = 0;
		int subtracao = 0;
		int multiplicacao = 0;
		double divisao = 0;

		System.out.println("------Programa Calculadora------");

		System.out.println("Digite o primeiro valor: ");
		valor1 = leitor.nextInt();
		System.out.println("Digite o Segundo valor: ");
		valor2 = leitor.nextInt();

		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / (double) valor2;

		System.out.println("Valor da Soma é = " + soma + "\n Valor da Subtração é = " + subtracao
				+ "\n Valor da Multiplicação é =  " + multiplicacao + "\n Valor da Divisão é = " + divisao);
		leitor.close();

	}
}
