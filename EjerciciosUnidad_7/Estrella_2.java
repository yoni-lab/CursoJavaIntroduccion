
import java.util.Arrays;
public class Estrella_2{
     public static void main(String[] args) {
        //recorta un tramo del arreglo
         int[] arr = { 3, 5, 9, 11, 13 ,15 ,21 ,12 ,4 ,2};
         int inicio = 0,   fin = 6;
         
         int[] slice = new int[fin - inicio + 1];
        
       for (int i = 0; i < slice.length; i++) {
           slice[i] = arr[inicio + i];
        }
            System.out.println(Arrays.toString(slice));
          //ordena metodo burbuja  
        for(int i=0; i<(arr.length-1); i++){
            for(int j=0; j < (arr.length-1);j++){
                if(arr[j] >arr[j+1]){
                int aux=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=aux;
             }
           }
       }
            System.out.print("\nArreglo ordenado forma ascendente: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " , " + " " );
       }
            System.out.print("\nArreglo ordenado forma descendente: ");
       for(int i= (arr.length-1);i>0; i--) {
              System.out.print(arr[i]+ " , ");
            }
   }
}
