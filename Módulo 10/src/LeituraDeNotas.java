import java.util.Scanner;

public class LeituraDeNotas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] notas = new int[4];
		
		for (int i=1; i<=4; i++) {
			System.out.println("Digite a " + i + "ª nota: ");
			notas[i-1] = s.nextInt();
		}
		
		boolean numeroValido = true;
		
		for (int i=0; i<4; i++) {
			if (notas[i] < 0 || notas[i] > 10) {
				numeroValido = false;
			}
		}
		
		if (numeroValido == true) {
			float media = ((notas[0] + notas[1] + notas[2] + notas[3]) / 4);
			
			if (media >= 7) {
				System.out.print("Média " + media + " - Aprovado");
			} else if (media >= 5) {
				System.out.print("Média " + media + " - Recuperação");
			} else {
				System.out.print("Média " + media + " - Reprovado");
			}	
		} else {
			System.out.print("Nota[s] inválida[s].");
		}
	}

}
