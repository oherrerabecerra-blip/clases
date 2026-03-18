public class libro {
    public static void main(String[] args) {
        
    }
    String titulo;
    String autor;
    String  ISBN;
    int numeroPagina;
    boolean disponible;

public libro(String titulo, String autor, String ISBN, int numeroPagina){
    this.titulo = titulo;
    this.autor = autor;
    this.ISBN = ISBN;
    this.numeroPagina = numeroPagina;
    this.disponible = true;
}
public void prestar(){
    if (disponible){
        disponible = false;
        System.out.println("el libro fue prestado ");
    }else{
        System.out.println("el libro no esta disponible ");
    }
}
public void devolver(){
    disponible = true;
    System.out.println("el libro fue devuelto");
}
public boolean estaDisponible (){
    return disponible;
}

}


