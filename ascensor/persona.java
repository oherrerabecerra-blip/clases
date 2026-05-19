package ascensor;

public class persona {
     private String nombre;

     public persona(String nombre){
        this.nombre = nombre;
     }
    public void entrarAscensor(){
        System.out.println(nombre + " entra al ascensor " );
    }
    public void salirAscensor(){
        System.out.println(nombre + " salio del ascensor ");
    }

    public String getnombre(){
        return nombre;
    }
    public void setnimbre(String nombre){
        this.nombre = nombre;
    }
}
