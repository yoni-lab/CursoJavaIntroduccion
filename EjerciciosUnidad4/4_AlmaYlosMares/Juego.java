import java.util.Random;
public class Juego{
    private int intento_X;
    private int intento_Y;
    private int primerIntento, segundoIntento, tercerIntento;
    
    public Juego(){
        this.primerIntento=primerIntento;
        this.segundoIntento=segundoIntento;
        this.tercerIntento=tercerIntento;
        
    }
    public int getIntento1(int nuevoIntento){
        return nuevoIntento;
        
    }
    public int getIntento2(int nuevoIntento){
        return this.intento_X=nuevoIntento;
    }
    
    public void jugar(int X, int Y){
       
       Random random = new Random();
       System.out.println(random.nextInt(10));
     }
}
    
 
