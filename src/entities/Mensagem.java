package entities;

public class Mensagem {

	public static void obterMensagem(int hora) {
		
		if (hora > 0 && hora < 12) {
			mensagemDeBomDia();
		} 
		else if (hora > 12 && hora < 18 ) {
			System.out.println("Boa tarde!");
		}
		else if (hora > 18 && hora < 24){
			System.out.println("Boa noite!");
		}
		else {
			System.out.println("Por favor insira um horário válido!");
		}
	}
	
	public static void mensagemDeBomDia() {
		System.out.println("Bom dia!");
	}
}
