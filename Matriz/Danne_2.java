
public class Danne_2{
    
    public static void main(String []args){
        int n=5;
        String [][] matriz =new String [n][n];
        int a=0;
        int b=n-1;
        int valor =1;
        for(int j=0; j<matriz.length; j++){
            for(int i=b; i>=a; i--){             //fia inf(der-izq)
                matriz[b][i]= valor++ +" \u2190\t";
            }
            for(int i=b-1; i>=a; i--){		// colmun izquier haci arrib
                matriz[i][a]=valor++ + "\u2191\t ";
            }
            for(int i=a+1; i<=b; i++){		// sup derec a izq
                matriz[a][i]=valor++ + " \u2192\t";
            }
            for(int i=a+1; i<=b-1; i++){		//columna desendente der
                matriz[i][b]=valor++ + "\u2193\t ";
            }
            a++; b--;
        }
        for(int f=0; f<matriz.length; f++){
            for(int i =0; i<matriz.length; i++){
                System.out.print(matriz[f][i]);
            }
            System.out.println();
        }
    }
    
}
