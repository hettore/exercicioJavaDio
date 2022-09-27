package application;

import java.util.Locale;

import entities.Calculadora;
import entities.Emprestimo;
import entities.Mensagem;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		System.out.println("Demostrando o uso dos métodos criados: ");
		System.out.println();
		Calculadora.soma(2, 5);
		Calculadora.subtracao(5, 3);
		Calculadora.multiplicacao(5, 6);
		Calculadora.divisao(5, 3);
		
		System.out.println();
		System.out.println("Demostrando o exercício de mensagens: ");
		System.out.println();
		Mensagem.obterMensagem(5);
		System.out.println();
		Mensagem.obterMensagem(13);
		System.out.println();
		Mensagem.obterMensagem(21);
		System.out.println();
		Mensagem.obterMensagem(25);
		
		System.out.println();
		System.out.println("Exercício do empréstimo!");
		System.out.println();
		Emprestimo.calcular(1000.00, Emprestimo.getDuasParcelas());
		System.out.println();
		Emprestimo.calcular(1000.00, Emprestimo.getTresParcelas());
		System.out.println();
		Emprestimo.calcular(1000.00, 5);
		
	}

}
