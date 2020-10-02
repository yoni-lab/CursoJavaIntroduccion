
public class NUmPrimo_4{
    public int CalcularPrimo(int num){
        int div=0;
        for(int i=1; i <= num; i++){
            if (num % i == 0){
                div++;
            }
        }
        if(div==2){
            System.out.println("El numero "+num+ " es primo");
        }else{
            System.out.println("El numero "+num+ " no es primo");
        }
        return num;
    }
}
