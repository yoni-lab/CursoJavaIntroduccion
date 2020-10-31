
public class Casillero{
 
    private String tiburon;
    private String tesoro;
    public Casillero(String tib, String tes){
        
        tiburon=tib;
        tesoro= tes;
    }
    public String mostrarDatos(){
        return "("+ tiburon+","+tesoro+")";
    }
    public String getTiburon(){
        return tiburon;
    
    }
    public String getTesoro(){
        return tesoro;
    } 
    public void setTiburon(String tib){
        tiburon=tib;
    }
    public void setTesoro(String tes){
        tesoro=tes;
    }
    
}
