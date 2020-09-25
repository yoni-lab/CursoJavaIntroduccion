
public class AñoBisiesto{
   int n;
   public String determinarBisiesto(int año){
    String res;
    if((año % 4==0)&&( año %100 !=0)){
        res="El año "+año+ " es un año bisiesto";
    }else{
        res="El año introducido" + año+ " no es bisiesto";
        }
    return res;
    }
   
}

