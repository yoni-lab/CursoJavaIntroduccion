
public class Cuenta{
    private String titular;
    private double cantidad;
    
    
    public Cuenta(String titular, double cantidad){
        this.titular=titular;
        if (cantidad<0){
            this.cantidad=0;
        }else {
            this.cantidad=cantidad;
        }
     
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }
    
    public void ingresar(double cantidad){
        if(cantidad>0){
            this.cantidad+=cantidad;
        }
    }
    
    public void retirar(double cantidad){
        if (this.cantidad-cantidad<0){
        
        }else{
            this.cantidad-=cantidad;
        }
    }
    
    public String toString(){
        return "El titular " + titular +  "tiene" + "bolivianos en la cuenta";
    
    }
    
    public static void main(String[] args) {

        Cuenta cuenta_1 = new Cuenta("Rafo ajo", 100);
        Cuenta cuenta_2 = new Cuenta("Fernando", 300);

        cuenta_1.ingresar(20);
        cuenta_2.ingresar(4);

        cuenta_1.retirar(30);
        cuenta_2.retirar(1);

      
        System.out.println(cuenta_1); 
        System.out.println(cuenta_2); 

    }
}
    
