
/*
* <Uni�o Metropolitana de Educa��o e Cultura>
* <Bacharelado em Sistemas de Informa��o>
* <Programa��o Orientada a Objetos II>
* <Prof. Pablo Ricardo Roxo Silva>
* <Iago da Concei��o Barbosa>
*/
package aplicacao;

import java.text.DecimalFormat;
import java.util.Scanner;

import aplicacao.entidade.Aluno;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("Informe a primeira nota:");
		double nota1 = sc.nextDouble();
		
		System.out.println("Informe a segunda nota:");
		double nota2 = sc.nextDouble();
		
		System.out.println("Informe a terceira nota:");
		double nota3 = sc.nextDouble();
		
		Aluno aluno1 = new Aluno(nota1, nota2, nota3);
		double media = aluno1.media(nota1, nota2, nota3);
		
		System.out.println("A m�dia entre as notas �: "+ df.format(media));
		
		if (media >= 7) {
			System.out.println("Status: Aluno aprovado!");
		} else if (media < 7 && media >= 4) {
			System.out.println("Status: Aluno em recupera��o!");
		} else {
			System.out.println("Status: Aluno reprovado!");
		}
		sc.close();
	}
}

