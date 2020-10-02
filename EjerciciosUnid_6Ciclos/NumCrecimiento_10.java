
public class NumCrecimiento_10{
        int num=0;
        int i;
        boolean creciente =false;
        boolean decreciente=false;
    public int Creciente(int num){
        for(i=0; i<1; i++){
            if(num > (num)+1){
            decreciente=true;
            }
            if(num < (num)+1){
            creciente=true;
            }
            if (creciente ==true || decreciente==false ){     
            System.out.println("El numero: "+num+ "esta en crecimiento");
            }
            if(creciente==false  || decreciente==true){    
            System.out.println("El numero: " +num+ " no esta en creciemiento");    //   for (int i = 5; i >= 1; i--)
            }
        }
        return num;
    }
}
