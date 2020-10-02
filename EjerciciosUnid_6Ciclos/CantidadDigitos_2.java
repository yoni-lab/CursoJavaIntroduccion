
public class CantidadDigitos_2{
    
    public int calcularDigitos(int num){
       int digito = 0;
       while(num > 0){
        num = num / 10;
        digito++;
        }
       return digito;
    } 
}

