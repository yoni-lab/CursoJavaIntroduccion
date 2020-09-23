
public class Hijos{
    private int hijoMayor, hijoMedio, hijoMenor;
  public Hijos(){
      hijoMayor=18;
      hijoMedio= 17;
      hijoMenor=16;
    }
  public String hijos(int hijo){
      String res="";
      
      switch(hijo){
        case 1: res = "Hijo mayor Juan tiene "+ hijoMayor + "años"; break;
        case 2: res = "Hijo medio Raul tiene" +  hijoMedio +"años"; break;
        case 3: res = "Hijo menor Samuel tiene"+ hijoMenor +"años"; break;
        default: res= "El numero indicado no corresponde a ningun caso";break;
        }
        return res;
    }
}
