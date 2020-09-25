
public class PrimerDigito{
    int n;
    public String impPrimerDigito(int n){
    String res="";
    if(n>=1000){
        res="El primer digito de la cifra es :"+ n/1000;
    }else if(n >=100){
        res="El primer digito de la cifra es :"+ n/100;
    }else if(n>=10){
        res="El primer digito de la cifra es :"+ n/10;
    }else {
        res="El numero es de un digito :"+ n;
    }
        
    return res;
    }
   
}
