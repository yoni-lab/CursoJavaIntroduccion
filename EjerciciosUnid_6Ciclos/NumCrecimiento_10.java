
 public class NumCrecimiento_10{
    int numero;
    public int Digitos(int numero){
        int digito1= numero/1000;                                               //4567%10=7  //4567 /1000=4    Math.pow(10,3)
        int digito2= (numero/100)%10;                                                        //4567 /100%10=5   Math.pow(10,2)
        int digito3= numero/10%10;                                                           //4567 /10%10=6    Math.pow (10,1)
        int digito4= numero%10;
        System.out.println("dig1: "+digito1+" dig2: "+digito2+" digito3: "+ digito3+ " dig4: "+digito4);
        if((digito1<digito2)&&(digito2<digito3)&&(digito3<digito4)){
            System.out.println("El numero: " +numero+ " es creciente");
        }else{
            System.out.println("El numero: " +numero+ " no es creciente");
        }
        return numero;
     }
   
}

         

          


