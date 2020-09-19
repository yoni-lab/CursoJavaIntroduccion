
public class MaquinaO{
    private int stockSavia;
    private int capacidadAlmacenar;         //savia
    private int cantidadCreada;             //savia
    private int cantidadNecesariaCrear;     // savia
    
    public MaquinaO(){
        this.stockSavia=0;
        this.capacidadAlmacenar=90;
        this.cantidadCreada=0; 
        this.cantidadNecesariaCrear=50;    
       
    }
    public void inicializar( int capacidadActual, int cantidadActual){
       this.capacidadAlmacenar=capacidadActual;
       this.cantidadNecesariaCrear=cantidadActual;
    }
    public void crear(){
        if (this.cantidadNecesariaCrear>=50){
        this.cantidadNecesariaCrear=this.cantidadNecesariaCrear-50;
        this.cantidadCreada=this.cantidadCreada=1;
        
            System.out.println("No puede realizar esa acción, espacio insuficiente");
        }else{
            System.out.println("La accion ha sido realizada con exito");
        }
    }
    
    public int getAgregarSavia(int cantidadNueva){
        return this.capacidadAlmacenar=cantidadNueva;
    }
    public int getCapacidadDisponible(){
        return this.cantidadNecesariaCrear;
    } 
    public int getRetirarAlmacenado(){                      //savia
        return this.capacidadAlmacenar;
    }
    public void retirarAlmacenada(int cantidadNueva){       //componente
        this.cantidadNecesariaCrear=cantidadNueva;
    }
    
}
    
    
    
 
