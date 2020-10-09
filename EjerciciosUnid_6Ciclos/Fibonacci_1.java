

public class Fibonacci_1{
    public int CalcularFibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }else{
            return CalcularFibonacci(n-1) + CalcularFibonacci(n-2);
        }
    }
    public int CalcularFiboCiclo(int n){
        int fibo=0, primero=1, segundo=0;
        while(n > 0){
            fibo= primero +segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        return fibo;
    }
}      