
import java.util.Arrays;
public class Vortice_5{
    
     public static void main(String[] args) {
      
        int[] arr = { 4, 12, -11, 2, 18, -9, 19, 3, 13, 5};
	int inicio = 2, fin = 6;

	int[] slice = new int[fin - inicio + 1];
	for (int i = 0; i < slice.length; i++) {
		slice[i] = arr[inicio + i];
		}
	System.out.println(Arrays.toString(slice));
   }
}