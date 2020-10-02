public class Semaforo0{
    private String estado;
    
    public Semaforo0(String color){
        estado=color;
    }
    
    public void cambiarEstadoSemaforo(int nVeces){
        int cambios=nVeces%3;
        switch(estado){
            case "rojo": 
                if(cambios==1){
                    estado="verde";
                }else if(cambios==2){
                    estado="amarillo";
                }
            break;
            case "amarillo":
                if(cambios==1){
                    estado="rojo";
                }else if(cambios==2){
                    estado="verde";
                }
            break;
            case "verde":
            if(cambios==1){
                estado="amarillo";
            }else if(cambios==2){
                estado="rojo";
            }
        }
    }
}
