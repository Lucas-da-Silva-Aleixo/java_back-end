import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColecoesParte2 {

	public static void main(String[] args) {

		List<String> masculino = new ArrayList<String>();
		List<String> feminino = new ArrayList<String>();

		String name = "José";
		String gender = "Masculino";
		
		String name2 = "Maria";
		String gender2 = "Feminino";
		
		masculino.add(name);
		feminino.add(name2);
		
		String[] strArray = new String[masculino.size()];
		strArray = masculino.toArray(strArray);
		System.out.println(Arrays.toString(strArray));
		String[] strArray2 = new String[feminino.size()];
		strArray2 = feminino.toArray(strArray2);
		System.out.println(Arrays.toString(strArray2));
	}

}