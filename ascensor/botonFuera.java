package ascensor;

public class botonFuera extends boton {
    private String direccion;
    private int Llamada;

    public botonFuera(int Llamada, String direccion){
        super(Llamada);
        this.direccion = direccion;
    }

    public void llamarAscensor( ascensor ascensor){
            System.out.println("llamando el ascensor al piso" + numeroPisos);
            System.out.println("direccion" + direccion);
    }
    public int getLlamada(){
        return Llamada;
    }
    public void setLlamada(int Llamada) {
        this.Llamada = Llamada;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDirrecion(String direccion){
        this.direccion = direccion;
    }
}


   

    


