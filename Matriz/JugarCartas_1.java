

public class JugarCartas_1{
    public static void main(String args[]){
        Simbolo[][] simbolos=new Simbolo[4][4];
        
        simbolos[0][0]=new Simbolo(3,"Corazon");
        simbolos[0][1]=new Simbolo(6,"Espada");
        simbolos[0][2]=new Simbolo(7,"Espada");
        simbolos[0][3]=new Simbolo(1,"Diamante");
        simbolos[1][0]=new Simbolo(9,"Trebol");
        simbolos[1][1]=new Simbolo(3,"Trebol");
        simbolos[1][2]=new Simbolo(3,"Trebol");
        simbolos[1][3]=new Simbolo(5,"Corazon");
        simbolos[2][0]=new Simbolo(2,"Corazon");
        simbolos[2][1]=new Simbolo(3,"Espada");
        simbolos[2][2]=new Simbolo(9,"Corazon");
        simbolos[2][3]=new Simbolo(10,"Corazon");
        simbolos[3][0]=new Simbolo(7,"Trebol");
        simbolos[3][1]=new Simbolo(3,"Corazon");
        simbolos[3][2]=new Simbolo(3,"Diamante");
        simbolos[3][3]=new Simbolo(4,"Corazon");
       
        Baraja barajas=new Baraja(simbolos);
        barajas.visualizar();
        System.out.println();
        System.out.println("El simbolo con la baraja de mayor valor es: " +barajas.nomCartMayValor());
        System.out.println("La fila de baraja con mayor valor es: " +barajas.filBarjMayValor());
        System.out.println("El simbolo con la baraja de menor valor es: " +barajas.nomCartMenValor());
        
    }
}
