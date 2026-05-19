package ascensor;

public class ascensor {
    private int numeroPiso;
    private int pisoActual = 1;
    private boolean movimeintoAscensor;
    private puertaAscensor puertaAscensor;
    private puertaPiso[] puertaPiso;
    

     public ascensor(int numeroPisos){
        this.numeroPiso = numeroPisos;
        this.pisoActual = 1;
        this.movimeintoAscensor = false;
        
        // objeto puerta 
        puertaAscensor = new puertaAscensor();
        puertaPiso = new puertaPiso[10];

        for (int i = 1 ; i < numeroPisos; i ++){
            puertaPiso[i] = new puertaPiso(i + 1);
            }
        pisoActual = 1;
        }
    public void movimientoAscensor(int pisoLlegada){
            if(pisoLlegada >= 1 && pisoLlegada <= numeroPiso){
                System.out.println("se mueve al piso " + pisoLlegada);
                    pisoActual = pisoLlegada;
                System.out.println(" el ascensor este en el piso " + pisoActual);
                }else{
                    System.out.println(" piso invalido ");
                }
            }
     public void movimiento(){//movimiento
            System.out.println(" Cerrando la puerta...  ");
        puertaAscensor.cerrarPuerta();
        puertaPiso[pisoActual - 1 ].cerrarPuerta();
            System.out.println("moviendo al piso " + pisoActual);
        movimeintoAscensor = true;
    }
    public void Llegada(){//llegada
        try{
                Thread.sleep(5000);
            }catch(Exception e ){
                System.out.println(" erro ");
            }
            System.out.println(" Abriendo la puerta...");
        puertaAscensor.abrirPuerta();
        puertaPiso[pisoActual - 1 ].abrirPuerta();//-1
            System.out.println(" piso " + pisoActual);
        movimeintoAscensor = false;
    }

    //
    public int getpisoActual(){
        return pisoActual;
    }
    public void setpisoActual(int pisoActual){
        this.pisoActual = pisoActual;
    }
    public int getnumeroPiso(){
        return numeroPiso;
    }
    public void setnumeroPiso(int numeroPiso){
        this.numeroPiso = numeroPiso;
    }
    public boolean ismovimientoAscensor(){
        return movimeintoAscensor;
    }
    public void setmivimientoAscensor(boolean movimientoAscensor){
        this.movimeintoAscensor = movimientoAscensor;
    }
}

    









