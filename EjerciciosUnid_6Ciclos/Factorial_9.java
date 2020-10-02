
public class Factorial_9{
    public int CalcularFactorial(int n){
        if(n > 0){
            int valor= n * CalcularFactorial(n-1);
            return valor;
        }
        return 1;
    }
    public int CalcularFact(int num){
        int factor =1;
        
        for(int i=num; i>0; i--){
            factor=factor*i;
           
        }
        return factor;
    }
}