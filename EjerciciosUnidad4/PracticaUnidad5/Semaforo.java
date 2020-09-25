
public class Semaforo{
    private  int estadoInicial;
    private String estadoFinal;
    public Semaforo(String color){
       estadoFinal=color;
           if (color =="rojo"){
            estadoInicial=0;
        }else{
           if(color=="amarillo"){
            estadoInicial=1;
        }else{ 
           if(color =="verde")
            estadoInicial=2;
         }
       }
     }
   
    public String cambiarColor(int cantCambios){
        
        String res="";
        if (cantCambios % 3==0){ 
            res="El color "+ estadoFinal + " ha realizado " +cantCambios  + " cambios";
        }else{
            res="El color" +estadoFinal+ " no ha realizado ningun cambio";
        }
    
        return res;
       }
}

