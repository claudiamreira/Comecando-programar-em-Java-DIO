package one.digitalinnovation;

public class Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("Exercicío Calculadora");
		Calc.soma(3, 6);
		Calc.subtracao(9, 1.8);
		Calc.multiplicacao(7, 8);
		Calc.divisao(5, 2.5);
		
		System.out.println("Exercicio Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		
		System.out.println("Exercicio Empréstimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
	}
	

}
