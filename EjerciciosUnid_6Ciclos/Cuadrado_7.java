 
public class Cuadrado_7{
    public int calcularDigitos(int num){
        int digito=0;
        while(num>0){
            num=num /10;
            digito++;
        }
        return digito;
        }
        public void encontrarCuadrado(int num){
        int cantidadDig=calcularDigitos(num);
        int cociente= num/(int)Math.pow(10,cantidadDig -1);
        int residuo=num%(int)Math.pow(10,cantidadDig -1);
        int total =residuo*10+cociente;
        System.out.println("cociente: " +cociente);
        System.out.println("residuo: " +residuo);
        System.out.println("total: " +total);
    }
      
    }