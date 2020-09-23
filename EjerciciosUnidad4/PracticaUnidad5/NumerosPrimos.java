import java.util.Scanner;
import java.util.InputMismatchException;
public class NumerosPrimos{
  
  public static void main(String args[]){ 
    
        Scanner entrada=new Scanner(System.in);
      
        int n;
        while(true){
        System.out.println("Ingrese un numero entero positivo");
        n = entrada.nextInt();
        
        if(n>0){
            int i=2;
            
            while(i<=n){
                int ascendente =2;
                boolean esPrimo =true;
                
                while(esPrimo && ascendente<i){
                    if(i % ascendente==0){
                        esPrimo = false;
                    }else{
                        ascendente++;
                    }
                }
                if(esPrimo){
                 System.out.println(i+" es un numero primo");
                }
                i++;
            }
            {break;}
         }
         else{
        
            System.out.println("El numero ingresado no es correcto" + "ingrese otro numero"); 
        }
          
        }
        
  }
}
