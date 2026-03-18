
public class objlibro {
    public static void main(String[] args) {
        
        libro libro1 = new libro("Maria", "Jorge isaacs", "98765", 256);
        libro libro2 = new libro("Deliro", "Laura restrepo", "98765", 336);
            
        libro1.prestar();
        libro2.prestar();
        libro1.devolver();

        if (libro1.estaDisponible()) {

            System.out.println("el libro esta disponibel ");

        }else{
            System.out.println("el libro no esta disponibel ");
    }

    }
}
