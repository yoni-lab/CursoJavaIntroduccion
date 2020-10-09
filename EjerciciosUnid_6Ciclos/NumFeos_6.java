
public class NumFeos_6{
    public int CalcularNumFeos(int num){
       int contador=0;
       int residuo=0; 
       System.out.println("Los numeros divisores de: " +num+ " son:"); 
        for(int i=1; i<num; i++){
        residuo=num %i;
        if(residuo ==0){
        contador++;
        System.out.println(i);
        }
       }
       System.out.println("Cantidad de divisores encontrados: " + contador);
       return num;
    
    }
    public int divisores(int n){
    int NumDivisores=0;
    n=Math.abs(n);
    for(int i=1; i<=n; i++){
        if (n%i==0){
        NumDivisores++;
        }
    }
    return NumDivisores;
    }
}
    
