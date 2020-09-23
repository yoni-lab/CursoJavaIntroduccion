public class Juego{
    private int coordenadaX, coordenadaY;
    private int cantIntentos;
    
     public Juego(){
         cantIntentos=3;
         coordenadaX= (int)(Math.random()*10+1);
         coordenadaY= (int)(Math.random()*10+1);
       }
    
      public String jugar(int x, int y) {
        String res="";
        
        
         if(cantIntentos>0){
            if(x==coordenadaX && y==coordenadaY){                   //supongamos que hacertamos en las dos coordenadas
                res="ganaste";
                
            }else if(coordenadaX == x){                      
                res="x esta en su posicion";                             
            }
            else if(coordenadaX >  x){
                res="x esta cerca el numero era "+ coordenadaX;                
            }else if(coordenadaY == y){
                res="y esta en su posicion";                              
            }
            else if(coordenadaY <y){
                res="y esta lejos el numero era "+ coordenadaY;                   
            }    
                cantIntentos--;
        }else{
            res="ya no puede jugar";
        }
        return res;
    }
    public void reiniciar(){
        if(cantIntentos<3){
            cantIntentos++;                          //al agotar los intemtos se pide reiniciar el juego e incrementamos los intentos
            }
            
    }
   
}

