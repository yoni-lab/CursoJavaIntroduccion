
public class CajaMusical {
    private String cancion_1, cancion_2, cancion_3;
    private String estado;
    boolean pause;
    public CajaMusical(String nom_1cancion, String nom_2cancion,String nom_3cancion){
        cancion_1= nom_1cancion;
        cancion_2= nom_2cancion;
        cancion_3= nom_3cancion;
        this.estado=estado;
        boolean enPause=true;
    }
   
     public String getCancion_1() {
        return cancion_1;
    }
    
       public String getCancion_2() {
        return cancion_2;
    }

    public String getCancion_3() {
        return cancion_3;
    }

    public void setCancion_1(String cancion_1) {
        this.cancion_1 = cancion_1;
    }

    public void setCancion_2(String cancion_2) {
        this.cancion_2 = cancion_2;
    }

    public void setCancion_3(String cancion_3) {
        this.cancion_3 = cancion_3;
    }
    
    public String reproducir(String cancion){
        String res="ya esta sonando una cancion";
        if (cancion ==cancion_1){
            res= "La cancion ha empezado a sonar";
        }else if(cancion==cancion_2){
            res= "La cancion ha empezado a sonar";
        }else if(cancion == cancion_3){
            res= "La cancion ha empezado a sonar";
        }
           return res;
    }
    public String pausar(String cancion){
        String res=    "la cancion se encuantra en pausa"; 
        if (cancion ==cancion_1){
            res= "La canción ha sido Pausada";
        }else if(cancion==cancion_2){
            res= "La canción ha sido Pausada";
        }else if(cancion == cancion_3){
            res= "La canción ha sido Pausada";
        }
           return res;
    }
    public String cambiar(String cancion){
       String res="";
            if (cancion ==cancion_1){
            res= "La canción ha sido Pausada";
        }else if(cancion==cancion_2){
            res= "La canción ha sido Pausada";
        }else if(cancion == cancion_3){
            res= "La canción ha sido Pausada";
        }
           return res;
        
    }
}
    

