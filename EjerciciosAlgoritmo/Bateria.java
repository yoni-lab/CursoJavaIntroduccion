public class Bateria{
    public int calcularPorcentaje(){
        int gastaJuegosHr=20;
        int gastaRRSSHr=10;
        int gastaVideoYTHr=15;
        int bateriaActual=55;
        int tiempoDeJuegosMin=30;
        int tiempoDeRRSSMin=15;
        int tiempoDeYTMin=40;
        
        int gastoJuegosMin=tiempoDeJuegosMin*gastaJuegosHr/60;
        int gastoRRSSMin=tiempoDeRRSSMin*gastaRRSSHr/60;
        int gastoDeYTMin=tiempoDeYTMin*gastaVideoYTHr/60;
        
        int gastoTotalPCT=gastoJuegosMin+gastoRRSSMin+gastoDeYTMin;
        int res=bateriaActual-gastoTotalPCT;
        return res;  
                      
    }
}
