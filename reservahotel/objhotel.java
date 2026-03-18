package reservahotel;

public class objhotel {
    public static void main(String[] args) {
        reserva reserva1 = new reserva("andres", "20/03/2026", "20/04/2026", 13);
        reserva reserva2 = new reserva("miguel", "03/03/2026", "16/03/2026", 28);
        reserva reserva3 = new reserva("natalia","31/03/2026" , "10/04/2026", 2);
        
        reserva1.nuevaReserva();
        reserva1.consultarReserva();

        reserva2.nuevaReserva();
        reserva2.consultarReserva();

        reserva3.nuevaReserva();
        reserva3.consultarReserva();
        
    }
}
