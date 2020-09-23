
public class Semaforo{
    
    private int nVeces;
    private  int estado;
    private String estado2;
    public Semaforo(String color){
    estado2=color;
        if (color =="rojo"){
        estado=0;
    }else{
        if(color=="amarillo")
        estado=1;
       }else{ 
       if(color =="verde")
        estado=2
    }
     
    }
    public String cambiarColorSemaforo(int cantCambios){
      String res;
       
      if(rojo==0 && amarillo==2 && verde==1){
        switch(nVeces){
        case 1: res = "rojo"+ nVeces; break;
        case 2: res = "amarillo"+ nVeces; break;
        case 3: res = "verde"+nVeces; break;
        default : res = "ese color no existe ";
        } 
       
        
       return res;
     
        }
     
    }
}
