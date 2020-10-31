

public class Juego_3{
    private Casillero [][] casilleros;
    private int casillaSup, casillaInf;
    
    public Juego_3(Casillero [][] casilleros){
        this.casilleros=casilleros;
    }
    public String nomCasilleroTib(){
        String posicion=casilleros[0][0].getTesoro();
        String nombre=casilleros[0][0].getTiburon();
        casillaSup=0;
        for(int i=0;i<casilleros.length;i++){
            for(int j=0; j<casilleros[i].length;j++){
                Casillero aux=casilleros[i][j];
                if(aux.getTiburon().equals(posicion)){
                    posicion=aux.getTiburon();
                    posicion=casilleros[i][j].getTiburon();
                    casillaSup=i;
                }
            }
        }
          return nombre;
    }
    public String nomCasilleroTes(){
        String posicion=casilleros[0][0].getTesoro();
        String nombre=casilleros[0][0].getTiburon();
        casillaInf=0;
        for(int i=0;i<casilleros.length;i++){
            for(int j=0; j<casilleros[i].length;j++){
                Casillero aux=casilleros[i][j];
                if(aux.getTiburon().equals(posicion)){
                    posicion=aux.getTiburon();
                    posicion=casilleros[i][j].getTesoro();
                    casillaInf=i;
                }
            }
        }
        return nombre;
    }
    public String casillaSup(){
        return "entre la casilla "+casillaSup+ "y" +(casillaInf+1);
    }
     public String casillaInf(){
         return "entre la casilla "+casillaInf+ "y" +(casillaSup+1);
    }
    public void visualizar(){
        for(int i=0;i<casilleros.length;i++){
            for(int j=0; j<casilleros[i].length;j++){
                Casillero aux=casilleros[i][j];
                System.out.print(aux.mostrarDatos()+"  ");
            }
            System.out.println();
        }
    }
}
