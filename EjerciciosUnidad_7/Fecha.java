
public class Fecha{
    private String descripcion;
    private int dia;
    private String mes;
    private int año;
    
    public Fecha(String descripcion, int dia, String mes, int año ){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
        this. descripcion = descripcion;
    }
    public boolean equals(Fecha otro){
        return dia==otro.getDia() && mes.equals(otro.getMes()) && año == otro.getAño() && descripcion.equals(otro.getDescripcion());
    }
        
    public int getDia(){
        return dia;
    }
    public String getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }
     public String getDescripcion(){
        return descripcion;
    }
}
