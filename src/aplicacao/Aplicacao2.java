
/*
* <Uni�o Metropolitana de Educa��o e Cultura>
* <Bacharelado em Sistemas de Informa��o>
* <Programa��o Orientada a Objetos II>
* <Prof. Pablo Ricardo Roxo Silva>
* <Iago da Concei��o Barbosa>
*/
package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aplicacao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaParticipantes = new ArrayList<String>(); 
			String nome;	
			boolean encerrar = false;
			while (!encerrar) {
				System.out.println("====== MENU ======\r\n"
						+ "1 - Cadastrar participante\r\n"
						+ "2 - Remover por posi��o\r\n"
						+ "3 - Remover por nome\r\n"
						+ "4 - Listar participantes\r\n"
						+ "5 - Pesquisar participante\r\n"
						+ "6 - Ordenar lista alfabeticamente\r\n"
						+ "7 - Limpar lista\r\n"
						+ "8 - Encerrar\n");
				
				System.out.println("Informe a op��o desejada:");
				
				int opcao = sc.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("Favor,informe o nome do participante:");
					nome = sc.next()+"\r\n";
					listaParticipantes.add(nome);
					break;
					
				case 2:
					System.out.println("Favor,informe a posi��o participante que quer remover!");
					
				case 3:
					System.out.println("Favor,informe o nome do participante que quer remover!");
					nome = sc.next()+"\r\n";
					listaParticipantes.remove(nome);
					break;	
					
				case 4:
					System.out.println("Essa � a lista de participantes:");
					System.out.println(listaParticipantes.toString());
					break;
				
				case 6:
					Collections.sort(listaParticipantes);
					System.out.println("Lista de participantes foi ordenada alfabeticamente!");
					break;
					
				case 7:
					listaParticipantes.clear();
					System.out.println("Lista de participantes foi limpa!");
					break;
		
				case 8:
					System.out.println("Programa encerrado!");
					encerrar = true;
					
				default: System.out.println("Op��o incorreta!\r\n");
				}
			}
		sc.close();
	}

}
