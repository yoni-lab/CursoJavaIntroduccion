
public class NumPerfecto_5{
    private int suma=0, num;
    public int CalcularNumPerfecto(int num){
       this.num=num;
       return num;
    }
    
    public void setOperaciones(){
        for(int i=1; i<num; i++){
            if((suma % i)==0)
                suma=suma+i;
        }
    }     
    public void getResultado(){
        if (suma==num){
           System.out.println("El numero "+num+" es perfecto");
        }else{
            System.out.println("El numero "+num+ " no es perfecto");
         }
    }
   
}