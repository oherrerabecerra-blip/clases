package perfume;

public class perfume {
    
    public static void main(String[] args) {
    }
    String nombre;
    String marca;
    double capacidad;
    double precio;

    public perfume(String nombre, String marca, double capacidad, double precio){
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }
    public void aplicarPerfume(double cantidad){
        if (cantidad <= capacidad){
            capacidad -= cantidad;
            System.out.println("perfume aplicado" + cantidad + "Ml" );
        } else {
            System.out.println("no hay sufisiente perfume ");
        }
    }

    public double consultarCapacidadRestante(){
        return capacidad;
    }
    public void ajustarPrescio(double nuevoPrecio){
        precio = nuevoPrecio;
    }
    public void informacionProducto(){
        System.out.println(" nombre " + nombre);
        System.out.println(" marca " + marca );
        System.out.println(" capacidad restante " + capacidad + " Ml ");
        System.out.println(" precio: $ " + precio);
    }
    
}
