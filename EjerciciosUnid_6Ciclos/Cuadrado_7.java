
public class Cuadrado_7{
    
    public int encontrarCuadrado(int num){
        int numero=0;
        int cuadrado=0;
        int factor=1;
        for(int i=0; i<num; i++){
            cuadrado = num %((int)Math.pow(10,4)*10+2);
            
            num=num+(cuadrado % num * 10 + factor);
        }
                
        return numero;
        }
        
    }