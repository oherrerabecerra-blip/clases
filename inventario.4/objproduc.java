public class objproduc {
    public static void main(String[] args) {
        
        producto producto1 = new producto("telefono", "8973652", 14, 700000);
        producto1.añadirStock(7);
        producto1.reducirStock(2); 
        
        double valor = producto1.valorInventario();
            System.out.println(" valor tatal del inventario " + valor);
    }
}
