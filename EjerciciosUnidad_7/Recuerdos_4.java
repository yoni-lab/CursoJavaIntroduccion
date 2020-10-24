
 
public class Recuerdos_4{
    private Fecha fechas[];
    public Recuerdos_4(int tam){
        fechas =new Fecha[tam];
    }
   
    public boolean agregarRecuerdos(Fecha nueva){
        boolean res= false;
        for(int i=0 ; i<fechas.length && res==false; i++){
            if(fechas [i]== null){
                fechas [i]= nueva;
                res= true;
            }
        }
        return res;
    }
    
   public String busquedaBinaria(int buscado){
       ordenarFechaDia();
       ordenarFechaAño();
       String res="No se encontro recuerdos ";
       int li=0;
       int ls= fechas.length-1;
       int medio= (li + ls) /2;
       boolean bandera =false;
       while(bandera == false && li<=ls){
           Fecha actual =fechas[medio];
           int diaActual = actual.getDia();
           if(diaActual == buscado){
               bandera = true;
               res= actual.getDescripcion();
               
            }else{
                if(diaActual>buscado){
                    ls= medio-1;
                }else{
                    li=medio+1;
                }
                medio =(ls+li)/2;
            }
        }
        return res;
    }
    public void ordenarFechaDia(){
       for(int i=1; i<fechas.length; i++){
           for(int j=0; j<=fechas.length-1-i; j++){
               Fecha actual =fechas[j];
               int diaActual = actual.getDia();
               Fecha vecino = fechas [j+1];
               int diaVecino = vecino.getDia();
               if (diaActual > diaVecino){
                   Fecha aux= fechas[j];
                   fechas[j]= fechas[j+1];
                   fechas[j+1]=aux;
                }
                break;
            }
        }
    }
    public void ordenarFechaAño(){
       for(int i=1; i<fechas.length; i++){
           for(int j=0; j<=fechas.length-1-i; j++){
               Fecha actual =fechas[j];
               int añoActual = actual.getAño();
               Fecha vecino = fechas [j+1];
               int añoVecino = vecino.getAño();
               if (añoActual > añoVecino){
                   Fecha aux= fechas[j];
                   fechas[j]= fechas[j+1];
                   fechas[j+1]=aux;
                }
                break;
            }
        }
    }

    public boolean descripcionRecuerdos(){
        boolean res=false;
        for(int i=0; i<fechas.length && res==false; i++){
            Fecha Actual=fechas[i];
            if(fechas.equals( false)){
                res=false;
            }else{
                res=true;
                System.out.println("los recuerdos son; "+i+ "=[" +fechas[i]+ "]");
            }
        }
        return res;
         
     }
}