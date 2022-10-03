/**
 * Classe com métodos representando o objeto
 * "computador".
 */

package tarefa_classes;

public class Computador {
	private boolean state;
	
	public void ligarComputador() {
		System.out.println("Ligando o computador...");
		
		state = true;
		
		if (state) {
			System.out.println("O computador está ligado.");
		}
	}
	
	public void desligarComputador() {
		System.out.println("Desligando o computador...");
		
		state = false;
		
		if (!state) {
			System.out.println("O computador está desligado.");
		}
	}
	
	public boolean ligado() {
		state = true;
		return state;
	}
	
	public boolean desligado() {
		state = false;
		return state;
	}
	
	public boolean ligarOuDesligar(int opcao) {
		if (opcao == 0) {
			return false;
		} else {
			return true;
		}
	}
	
}