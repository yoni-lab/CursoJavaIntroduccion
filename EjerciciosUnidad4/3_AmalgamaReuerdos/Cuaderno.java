
public class Cuaderno{
    private String tareaActual;
    private String nuevaTarea;
    private String tareaActualConcluida;
    
    public Cuaderno(){
    String tareaActual;
    String nuevaTarea;
    String tareaActualConcluida;
    }
   
    public String getTareaActual(){
        return tareaActual;
    }
    public void setTareaActual(String tareaActual){
        this.tareaActual=tareaActual;
    }
    public void NuevaTarea(){
        this.tareaActual=this.nuevaTarea;
    
    }
    public String getTareaActualConcluida(){
        return tareaActualConcluida;
    
    }
    public void crearTarea(String nTarea) {
        this.nuevaTarea = nTarea;
       
        if (nTarea.equals(tareaActual)){
            System.out.println("nueva tarea asignada");
        }else{
            System.out.println("La tarea aun no ha sido concluida");
        }
    }
}
    


