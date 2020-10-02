
public class Invertir_3{
    public int InvertirNum(int num){
        int cifra, inverso=0;
        while(num!=0){
            cifra=num%10;
            inverso=(inverso*10)+cifra;
            num/=10;
        }
         return inverso;
    }
    
   
    
}
