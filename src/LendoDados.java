import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		//A linha abaixo cria um Scanner, que permite le dados no telcado
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cira uma variavel (espaço na Ram) que guarda texto
		String nome;
		
		System.out.println("Digite seu Nome: ");
		//A lina abaixo pega o que usuario digitou
		nome = leitor.next();
		
		System.out.println("Seu nome é: " + nome);
		//fechei meu Scanner
		leitor.close();
	
		
		
		
		
		

	}

}
