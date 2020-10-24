
public class AnomaliasDelEquilibrio_1{
    private int emociones[];
   
    public AnomaliasDelEquilibrio_1(){
       emociones =new int [10];
     }
    public boolean agregarElemento(int valor){
       boolean res =false;
        for(int i=0; i<emociones.length && res== false; i++){
           if (emociones[i]==0){
            emociones[i] =valor;
            res=true;
           }
        }
        return res;
    } 

    public void ordenar(){
       for (int i=1; i<= emociones.length; i++ ){
          for(int j=0; j <= emociones.length-1-i; j++){
              if(emociones [j]> emociones[j+1]){
                  int aux = emociones[j];
                  emociones [j]= emociones [j+1];
                  emociones[j+1] =aux;
                }
            }
       }
    }
    public int busquedaBinaria_1(int elemento){
     
        int res = 0;
        int centro,primero,ultimo,valorCentro;
        primero = 0;
        ultimo = emociones.length-1;
        while(primero <= ultimo){
            centro= (primero + ultimo)/2;
            valorCentro=emociones[centro];
            if(elemento ==valorCentro){
                return centro;
            }else if(elemento<valorCentro){
                ultimo=centro-1;
            }else{
                primero=centro+1;
            }
           
        }
        return res;
    }
}