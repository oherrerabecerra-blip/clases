public class producto {
    public static void main(String[] args) {
        
    }
        String nombreProducto;
        String codigo;
        int stock;
        double presioProducto;

        public producto(String nombreProducto, String codigo, int stock, double presioProducto){
            this.nombreProducto = nombreProducto;
            this.codigo = codigo;
            this.stock = stock;
            this.presioProducto = presioProducto;
        }
        public void añadirStock(int cantidad){
            stock = stock + cantidad;
        }
        public void reducirStock(int cantidad){
            stock = stock - cantidad;
        }
        public double valorInventario(){
            return stock * presioProducto;
        }

}
