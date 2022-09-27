package entities;

public class Calculadora {

	public static void soma(int x, int y) {

		int resultado = x + y;

		System.out.println("A soma de " + x + " mais " + y + " é: " + resultado);
	}

	public static void subtracao(int x, int y) {

		int resultado = x - y;

		System.out.println("A subtração de " + x + " menos " + y + " é: " + resultado);
	}

	public static void multiplicacao(int x, int y) {

		int resultado = x * y;

		System.out.println("A multiplicação de " + x + " vezes " + y + " é: " + resultado);
	}
	
	public static void divisao(double x, double y) {
		
		double resultado = x / y;

		System.out.printf("A divisão de " + x + " por " + y + " é: " + String.format("%.2f\n", resultado));
	}
}
