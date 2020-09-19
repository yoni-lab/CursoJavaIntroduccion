public class CopiaDeSeguridad{
    public int calcularCopia(){
       int capacidadMb=700;
       int pesoInfoGb=5;
       int capacidadGbMg=pesoInfoGb*1024;
       int res=capacidadGbMg/capacidadMb;
       if (capacidadGbMg%capacidadMb!=0){
            res++;
       }
       return res;
   }
}
