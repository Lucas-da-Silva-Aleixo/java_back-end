package tarefa_classes;

public class PrimeiraClasse {
	
	public static void main(String args[]) {
		System.out.println("Olá!");
		Computador computador = new Computador();
		computador.ligarComputador();
		computador.desligarComputador();
	    boolean state = computador.ligado();
	    System.out.println(state);
		state = computador.desligado();
		System.out.println(state);
		System.out.println(computador.ligarOuDesligar(1));
	}
	
}
