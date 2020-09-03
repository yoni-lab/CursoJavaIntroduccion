import java.util.Scanner;
public class Menu
{
    public Menu()
    {
        
    }
    public static void main(String args[])
    {
        try
        {
           Scanner teclado = new Scanner(System.in);
           int opc = 5;
           int num1 = 0;
           int num2 = 0;
           int res = 0;
           while(opc>0)
           {
             System.out.print("\u000C");
             System.out.println("*** Bienvenido a RafoJumbo");
             System.out.println("[2] Sumar");
             System.out.println("[1] Restar");
             System.out.println("[0] Salir");
             opc = teclado.nextInt();
             
             switch(opc)
             {
                 case 2:
                     System.out.print("Ingresar primer numero : "); num1 = teclado.nextInt();
                     System.out.print("Ingresar segundo numero : "); num2 = teclado.nextInt();
                     System.out.print("La suma de "+num1+" + "+num2+ "es igual a "+(num1 + num2));
                     num1 = 0;
                     num2 = 0;
                     System.out.println("Para volver al menu escriba [5] si desea salir [0] : ");
                     opc = teclado.nextInt();
                 break;
                 case 1:
                     System.out.print("Ingresar primer numero"); num1 = teclado.nextInt();
                     System.out.print("Ingresar segundo numero"); num2 = teclado.nextInt();
                     System.out.print("La resta de "+num1+" - "+num2+ "es igual a "+(num1 - num2));
                     num1 = 0;
                     num2 = 0;
                     System.out.println("Para volver al menu escriba [5] si desea salir [0] : ");
                     opc = teclado.nextInt();
                 break;
                 case 0:
                     System.out.print("\u000C");
                     System.out.println("[Gracias por ocupar el programa en java .Adios");
                     opc = 0;
             }
           }
            
        }
        catch(Exception ex)
        {
            System.out.print("Error: "+ex);
        }

    }
}
