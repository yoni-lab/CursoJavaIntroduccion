
import java.util.Scanner;                                       //entrada main
public class Acarreo_8{   
        public static int acarreos(String s1, String s2) {
        int NumAcarreos = 0;                                      //contador de acarreos
        int acarreo = 0;                                         //acarreo actual
        int i = 0;                                               //posición por la izquierda
        boolean terminado = false;                               //controlar el bucle
        while (!terminado) {
            int i1 = i < s1.length() ? s1.charAt(s1.length() - i - 1) - '0' : 0;
            int i2 = i < s2.length() ? s2.charAt(s2.length() - i - 1) - '0' : 0;
            int suma = acarreo + i1 + i2;               //sumamos ambos mas el posible acarreo anterior
            acarreo = suma >= 10 ? 1 : 0;               //Hay acarreo si la suma es > 10
            NumAcarreos += acarreo;
            i++;                                        //pasar al siguiente por la izquierda
            terminado = !(acarreo > 0) && (i >= s1.length() || i > s2.length());
        }
        return NumAcarreos;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean terminar = false;
        while (!terminar){
            String s1 = in.next();                        //lee primer número como cadena
            String s2 = in.next();                                 
            terminar = s1.equals("0") && s2.equals("0");
            if (!terminar) {
                System.out.println(acarreos(s2, s1));
            }
        } 
    }
}