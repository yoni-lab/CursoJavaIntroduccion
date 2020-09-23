
 public class Somnia{
    private int avo, durabilidad,contadorInterno;        //alcance de vision optima
   
    public Somnia(){
    avo=14;                                  //avo_1 = 5  &  avo_2 = 9
    durabilidad=89;                         //durabilidad_1 & 2 = 89   
    contadorInterno=0;
    avo++;
    durabilidad++;
    }
    
   
    public String apuntar(int avo, int durab ){
        String res="";
            if(avo <=14 && durabilidad >=89+11) {
            System.out.println("objeto identificado");
            System.out.println("Acertaste en: "+contadorInterno+ "intentos");
            }else{
            System.out.println("intento ha fallado");
            System.out.println("el numero debe estar en el intervalo de 14-89");
            
            }
            contadorInterno++;
           
        return res;
     }
}

