
public class TabernaDeSueños_2{
   
    private Sueño sueños[];
    private int index;
    public TabernaDeSueños_2(int tam){
        sueños= new Sueño[tam];
        index=0;
    }
    public boolean almacenarSueños(Sueño nuevo){
        boolean res=false;
       
        for(int i =0; i < sueños.length && res==false; i++){
            if(sueños[i]==null){
                sueños[i]= nuevo;
                res = true;
                System.out.println("---------------------------------------");
                System.out.println("Se ha almacenado el sueño exitosamente");
            }
        }
        return res;
    }
    public boolean eliminarSueño(Sueño buscado){
        boolean res=false;
        for(int i=0; i<sueños.length && res==false ; i++){
            Sueño actual = sueños[i];
            if(actual.equals (buscado)){
                res= true;
                sueños[i]=null;
            }
        }
        return res;
    }
    public String buscarSueños(int diaBuscado){
        ordenarSueñoDia();
        String res="El sueño no existe";
        int li=0;
        int ls=sueños.length-1;
        int medio = li+ls/2;
        boolean bandera= false;
        while(bandera ==false && li <= ls){
            Sueño actual = sueños[medio];
            int diaActual = actual.getDia();
            if(diaActual== diaBuscado){
                bandera = true;
                res= actual.getNombre();
            }else{
                if(diaActual> diaBuscado){    //>
                    ls =medio-1;
                }else{
                    li =medio+1;
                }
                medio = ls+ li/2;
            }
        }
        return res;
    }
    public void ordenarSueñoDia(){
        for(int i=1; i<=sueños.length; i++ ){
            for(int j=0; j< sueños.length-1-i; j++){
                Sueño actual = sueños[j];
                int diaActual = actual.getDia();
                Sueño vecino = sueños[j+1];
                int diaVecino = vecino.getDia();
                if(diaActual > diaVecino){  //>
                    Sueño aux = sueños[j];
                    sueños[j]= sueños[j+1];
                    sueños[j+1]= aux;
                }
            }
        }
    }
    public boolean mostrarDetalleSueños(){
        boolean res=false;
        for(int i=0; i<sueños.length && res==false; i++){
            Sueño Actual=sueños[i];
            if(sueños.equals( false)){
                res=false;
            }else{
                res=true;
                System.out.println("los sueños son; "+i+ "=[" +sueños[i]+ "]");
            }
        }
        return res;
    }
}
   
       
       

    
