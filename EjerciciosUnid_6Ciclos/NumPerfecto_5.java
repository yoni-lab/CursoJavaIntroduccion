
public class NumPerfecto_5{
   public int perfectirijillo(int num){
       int x,suma=0;
       for(x=1 ; x<num; x++){
           if(num %x==0){
            suma=suma+x;
          }
       }
           if(suma==num){
               System.out.println("El numero: .." +num+" es perfecto");
       }else{
               System.out.println("El numero:.." +num+ " no es perfecto");
       }
        return num;
      }
}