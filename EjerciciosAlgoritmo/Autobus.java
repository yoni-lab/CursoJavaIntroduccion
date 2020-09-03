public class Autobus{
   public int cantidadViajes(){
       int valorPase=45;
       int valorPaseViajar=valorPase*100;
       int precioViajeBol=1;
       int precioViajeCent=80;
       int precioCadaViaje=precioViajeBol*100+precioViajeCent;
       int res=valorPaseViajar/precioCadaViaje;
       return res;
   }
}
