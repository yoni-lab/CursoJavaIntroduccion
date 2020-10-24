
public class Estrellas_3{
        private int luminosidad[];
        private int index;
    public Estrellas_3(){
        luminosidad = new int [6];
        index = 0;
    }
    public boolean agregarElemento(int valor){
        boolean res = false;
        if(index < luminosidad.length){
            luminosidad [index] = valor;
            index ++;
            res =true;
        }
        return res;
    }
    public void ordenar(){
        int cont_par=0;
        int cont_impar=0;
       for(int i=0; i<luminosidad.length; i++){
           if ((luminosidad[i]%2==0) ){
               cont_par++;
           }else{
               cont_impar++;
           }
        }
        int [] par= new int [cont_par];
        int [] impar =new int [cont_impar];
       for (int i=1; i<= luminosidad.length; i++ ){
          for(int j=0; j <= luminosidad.length-1-i; j++){
              if(luminosidad [j] > (luminosidad[j+1]) ){
                  int aux = luminosidad[j];
                  luminosidad [j]= luminosidad[j+1];
                  luminosidad[j+1] =aux;
                  }
            }
       }
    }
    public void unirArreglos(int a[], int b[]){
            int index=0;
            for (int i=0; i<a.length; i++){
                luminosidad[index]= a[i];
                index++;
            }
            for(int i=0; i<b.length; i++){
                luminosidad[index]= b[i];
                index++;
                }
     }
}

 
