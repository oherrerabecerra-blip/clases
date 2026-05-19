package ascensor;

public class puertaPiso extends puerta {
    int numeroPiso;
    boolean abirta;
    
    public puertaPiso(int numeroPiso ){
        this.numeroPiso = numeroPiso;
        boolean abierta = false;
    }
    public void abriPuerta(){
        abirta = true;
            System.out.println("la puerta del piso" + numeroPiso + "esta abierta");
    }
    public void CerrarPuerta(){
        abirta = false;
            System.out.println("la puerta del piso" + numeroPiso + " esta cerrada");
    }
    public int getNumeroPiso(){
            return numeroPiso;
        }
    
    public void setNumeroPiso(int numeroPiso){
        this.numeroPiso = numeroPiso;
    }
    public boolean isAbierta(){
        return abirta;
    }
    public void setAbierta(boolean abierta){
        this.abirta = abierta;
    }
}

