package perfume;

public class perfumeobj {
    public static void main(String[] args) {
        
        perfume perfume1 = new perfume(" Le Male Aue de Toilette ", " Jean Paul Gaultier ", 125, 433000);
        perfume1.informacionProducto();
        perfume1.aplicarPerfume(3);
        System.out.println(" cantidad restante " + perfume1.consultarCapacidadRestante() + " Ml ");
        perfume1.ajustarPrescio(390000);
        perfume1.informacionProducto();
    }
}
