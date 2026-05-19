package ascensor;

public class puerta {
    public  boolean abrirPuerta;
    protected   boolean abierta;

   public puerta(){
      super();
   }
   public void abrirPuerta(){
      abierta = true;
            System.out.println("puerta abierta");
   }
   public void cerrarPuerta(){
            abierta = false;
            System.out.println("puerta cerreda");
   }
   public boolean isAbierta(){
      return abierta;
   }
   public void setabierta(boolean abierta){
      this.abierta = abierta;
   }
}



    