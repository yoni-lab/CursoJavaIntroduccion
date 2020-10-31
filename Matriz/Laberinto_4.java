
public class Laberinto_4{
    public void mostrarMatriz(String [][] mat){
        for(int fila =0; fila<mat.length; fila++){
            for(int col=0; col<mat[fila].length; col++){
              
                System.out.print(mat[fila][col]+"  ");
            }
            System.out.println();
        }
    }
    public void cambiarLugar(String [][] mat){
        //int [][] mat=new int [tam][mat];
        for(int i =0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(i==j){
                    mat[i][j]="D";
                }
                System.out.print(mat[i][j+1]+" ");
            }
            System.out.println();
        }
    }
    public void rellenarMatriz(String[][]mat, String cadena){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                mat[i][j]=cadena;
            }
        }
    }
    //indica si una posicion esta dentro la matriz
    public boolean dentroMatriz(int posI, int posJ,String [][]mat){
        boolean res= false;
            for(int i=0;i<mat.length;i++){
                 for(int j=0;j<mat.length;j++){
                    return posI>=0 &&   posJ>=1 ;
                    
            }
        }
        return res;
    }
}
