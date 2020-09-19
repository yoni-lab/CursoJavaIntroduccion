public class TanqueAgua{
    public int calcularTiempoTanque(){
        int tanqueLleno=10;
        int tanqueVacio=15;
        int tiempoVacioTanque=tanqueVacio-tanqueLleno;
        
        int chorroAguaSube=tanqueLleno*2;
        int desagueTanqueA=tanqueVacio-5;
        int desagueTanqueB=tanqueVacio-10;
        int tiempoLlenarTanque=tanqueLleno*3;
       
        int res=tiempoLlenarTanque;
        return res;
    }
}
