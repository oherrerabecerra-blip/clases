package reservahotel;

public class reserva {
    public static void main(String[] args) {
    }
        String nombreCliente;
        String fechaEntrada;
        String fechaSalida;
        int numeroHabitacion;
        boolean activa;

        public reserva(String nombreCliente, String fechaEntrada, String fechaSalida, int numeroHabitacion){
            this.nombreCliente = nombreCliente;
            this.fechaEntrada = fechaEntrada;
            this.fechaSalida = fechaSalida;
            this.numeroHabitacion = numeroHabitacion;
            this.activa = true;
        }
        public void nuevaReserva(){
            System.out.println(" reserva para " + nombreCliente);
            System.out.println(" habitacion " + numeroHabitacion);
            System.out.println(" entrada " + fechaEntrada);
            System.out.println(" salida " + fechaSalida);
        }

        public void cancelarReserva(){
            activa = false;
            System.out.println(" la reserva de " + nombreCliente + " ha sido cancelda ");
        }

        public void consultarReserva(){
            if (activa) {
                System.out.println(" cliente " + nombreCliente);
                System.out.println(" habitacion " + numeroHabitacion);
                System.out.println(" entrada " + fechaEntrada);
                System.out.println(" salida " + fechaSalida);
            } else {
                System.out.println(" la reserva fue cancelada ");
            }
        }
}
