
public class Multiplos{
    int n1, n2;
  public String Multiplos(int n1, int n2){
      String res="";
      if(n1 % n2==0 || n2%n1==0){
        res="son multiplos";
        }else{
        res="no son multiplos";
        }
      return res;
  }
}
