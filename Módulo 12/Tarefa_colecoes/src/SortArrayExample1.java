import java.util.Arrays;

public class SortArrayExample1 {
	
	public static void main(String[] args) {   
  
		String [] array = new String [] {"Lucas", "Ana", "Tobias", "Eduardo", "Paula"};

		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {       
			System.out.println(array[i]);   
		}
		
		String [] array2 = new String [] {"Lucas-m", "Ana-f", "Tobias-m", "Eduardo-m", "Paula-f"};
		
		String[] masculino = new String [] {"test1","test2","test3"};
		String[] feminino = new String [] {"test1","test2"};
		
		int arrayLength = array2.length;
		int maleCount = 0;
		int femaleCount = 0;
		
		for (int i = 0; i < arrayLength; i++) {
			if (array2[i].contains("-m")) {
				masculino[maleCount] = array2[i];
				maleCount++;
			} else {
				feminino[femaleCount] = array2[i];
				femaleCount++;
			}
			
			System.out.println("");
			System.out.println(Arrays.toString(masculino));
			System.out.println(Arrays.toString(feminino));
		}
		
	}
	
}