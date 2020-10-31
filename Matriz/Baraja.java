
public class Baraja{
    private Simbolo[][] simbolos;
    private int filaMay, filaMen;
    
    public Baraja(Simbolo[][]simbolos){
        this.simbolos= simbolos;
    }
    public String nomCartMayValor(){
        int mayor=simbolos[0][0].getValorCarta();
        String nombre=simbolos[0][0].getCarta();
        filaMay=0;
        for(int i=0;i<simbolos.length;i++){
            for(int j=0; j<simbolos[i].length; j++){
                Simbolo aux= simbolos[i][j];
                if(aux.getValorCarta()>mayor){
                    mayor=aux.getValorCarta();
                    nombre=simbolos[i][j].getCarta();
                    filaMay=i;
                }
            }
        }
        return nombre;
    }
    public String nomCartMenValor(){
        int menor=simbolos[0][0].getValorCarta();
        String nombre=simbolos[0][0].getCarta();
        filaMen=0;
        for(int i=0;i<simbolos.length;i++){
            for(int j=0; j<simbolos[i].length; j++){
                Simbolo aux= simbolos[i][j];
                if(aux.getValorCarta()<menor){
                    menor=aux.getValorCarta();
                    nombre=simbolos[i][j].getCarta();
                    filaMen=i;
                }
            }
        }
        return nombre;
    }
    
    public String filBarjMayValor(){
        return "esta entre la fila " +filaMay+ "y" +(filaMay+1);
    }
    public String filBarjMenValor(){
        return "esta entre la fila " +filaMen+ "y" +(filaMen+1);
    }
    public void visualizar(){
        for(int i=0;i<simbolos.length;i++){
            for(int j=0; j<simbolos[i].length; j++){
                Simbolo aux= simbolos[i][j];
                System.out.print(aux.mostrarDatos()+"  ");
            }
            System.out.println();
        }
        
    }
    
}
