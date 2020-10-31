
public class Simbolo{
    private String carta;
    private int valorCarta;
    public Simbolo(int val, String car){
        carta= car;
        valorCarta= val;
    }
    public String mostrarDatos(){
        return "("+valorCarta+ "," +carta+")";
    }
    public int getValorCarta(){
        return valorCarta;
    }
    public void setValorCarta(int val){
        valorCarta=val;
    }
    public String getCarta(){
        return carta;
    }
    public void setCarta(String car){
        carta=car;
    }
}
