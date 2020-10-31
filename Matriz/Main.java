import java.util.Scanner;
public class Main{
   public static void main(String args[][]){
        Scanner sc = new Scanner(System.in);
        Laberinto_4[][]laberinto= new Laberinto_4[4][6];
        int opcion;
        boolean salir=false;
        int posI=0;
        int posJ=0;
        while(!salir){
            String s;

            System.out.print("1. Derecha");
            System.out.print("2. Izquierda");
            System.out.print("3.Abajo");
            System.out.print("4. Arriba");
            System.out.print("5. Salir");
            
            s=sc.nextLine();
        }
        switch(opcion){
            case 1:
            if(laberinto[posI+1][posJ]){
               laberinto[posI][posJ]="-";
               posJ++;
               laberinto[posI][posJ]="D";
                }else{
                    System.out.println("No te puedes salir del laberinto");
                }
                break;
            case 2:
            if(laberinto[posI][posI-1]){
               laberinto[posI][posJ]="-";
               posJ--;
               laberinto[posI][posJ]="D";
                }else{
                    System.out.println("No te puedes salir del laberinto");
                }
             break;
            case 3: 
            if(laberinto[posI][posJ+1]){
               laberinto[posI][posJ]="-";
               posI++;
               laberinto[posI][posJ]="D";
                }else{
                    System.out.println("No te puedes salir del laberinto");
                }
              break;
                case 4:
            if(laberinto[posI-1][posJ]){
               laberinto[posI][posJ]="-";
               posI--;
               laberinto[posI][posJ]="D";
                }else{
                    System.out.println("No te puedes salir del laberinto");
                }
                break;
            case 5:
            salir= true;
                break;
                default:
                System.out.println("solo opciones de 1 a 5");
        } 
    }
}
