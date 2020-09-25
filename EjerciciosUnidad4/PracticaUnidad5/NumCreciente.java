
public class NumCreciente{
    int n1,n2,n3;
    public String Numeros(int n1, int n2, int n3){
        
        String res= "Los numeros ordenados de menor a mayor son:";
        if((n1<n2) &&(n2<n3)){
              res="orden"+n3+" - "+n2+" - "+n1;
        }else if((n1<n3) && (n3<n2)){
              res="orden"+n2+" - "+n3+" - "+n1;
        }else if((n2<n1)&&(n1<n3)){
              res="orden"+n3+" - "+n1+" - "+n2;
        }else if((n2>n3)&&(n3>n1)){
              res="orden"+n1+" - "+n3+" - "+n2;
        }else if((n3<n1)&&(n1<n2)){
              res="orden"+n2+" - "+n1+" - "+n3;
        }else{
              res="orden"+n3+" - "+n2+" - "+n1;
        }
        return res;
    }
}