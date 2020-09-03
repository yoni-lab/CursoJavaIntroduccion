public class CopiaDeSeguridad{
    int calcularCopia(){
    int capacidadMb=700;
    int pesoInfoGb=5;
    int capacidadGbMg=pesoInfoGb*1024;
    int res=capacidadGbMg-capacidadMb;
    return res;
    }
}
