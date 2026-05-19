package ascensor;

public class botonAscensor extends boton{
    private static int NumeroPisos;
    private int pisos;    

    public botonAscensor(int pisos){
        super(NumeroPisos);
        this.pisos = pisos;
    }
    public botonAscensor(int[] pisos){
        super(NumeroPisos);  
         pisos = new int[10];
        for (int i = 0; i < pisos.length; i++) {
            pisos[i] = i + 1;
         }
     }
     public void mostarPisos(int [] pisos){
            System.out.println(" los pisos son ");
            for(int i = 0 ; i < pisos.length; i ++){
                System.out.println("["+ i + "]" +pisos[i]);
            }
        }
    public void presionarBoton(ascensor ascensor){
        System.out.println("el boton fue presionado para " + numeroPisos);
        ascensor.movimientoAscensor(numeroPisos);
    }
    public int getpisos(){
        return pisos;
    }
    public void setpisos(int pisos){
        this.pisos = pisos;
    }

}



