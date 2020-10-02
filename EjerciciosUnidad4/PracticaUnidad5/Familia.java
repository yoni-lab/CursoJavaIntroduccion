public class Familia{
    private Hijo hijo1;
    private Hijo hijo2;
    private Hijo hijo3;
    
    public Familia(Hijo hijo1,Hijo hijo2,Hijo hijo3){
        this.hijo1=hijo1;
        this.hijo2=hijo2;
        this.hijo3=hijo3;
    }
    
    public String getNombreHijoMayor(){
        String res="";
        if(hijo1.getEdad()>hijo2.getEdad()){
            if(hijo1.getEdad()>=hijo3.getEdad()){
                res=hijo1.getNombre()+" es el mayor";
            }else{
                res=hijo3.getNombre()+"es el mayor";
            }
        }else{
            if(hijo2.getEdad()>=hijo3.getEdad()){
                res=hijo2.getNombre()+" es el mayor";
            }else{
                res=hijo3.getNombre()+"es el mayor";
            }
        }
        return res;
    }    
    public String getNombreHijoMedio(){
        String res="";
        if(hijo2.getEdad()>hijo1.getEdad()){
            if(hijo1.getEdad()>=hijo3.getEdad()){
                res=hijo1.getNombre()+" es el mayor";
            }else{
                res=hijo3.getNombre()+"es el mayor";
            }
        }else{
            if(hijo2.getEdad()>=hijo3.getEdad()){
                res=hijo2.getNombre()+" es el mayor";
            }else{
                res=hijo3.getNombre()+"es el mayor";
            }
        }
        return res;
        }
}

