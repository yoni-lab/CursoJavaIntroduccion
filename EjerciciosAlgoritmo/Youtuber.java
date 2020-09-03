public class Youtuber{
    public int cantidadCanciones(){
        int duracionEditadosMin=15;
        int duracionMaxEditadosSeg=duracionEditadosMin*60;
        int duracionCancionesMin=2;
        int duracionCancionesSeg=30;
        int duracionDeCanciones=3;
        int duracionCancionesSegundos=duracionCancionesMin*60+duracionCancionesSeg;
        
        int cantMaxCanciones=duracionMaxEditadosSeg-duracionCancionesSegundos;
        int res=cantMaxCanciones/60;
        return res;
        
    }
}
