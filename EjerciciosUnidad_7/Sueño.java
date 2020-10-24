
public class Sueño{
    private String nombre;
    private int dia;
    private String descripcion;
    public Sueño(String nom, int dia, String descripcion){
        nombre= nom;
        this.descripcion= descripcion;
        this.dia=dia;
    }
     public boolean equals(Sueño otro){
        return   dia== otro.getDia() && nombre.equals(otro.getNombre())  && descripcion.equals(otro.getDescripcion());
    }
    public int getDia(){
        return dia;
    }public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
}
