public class obj {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new
        CuentaBancaria("12345","oscar",20000);
        cuenta1.consultarSaldo();
        cuenta1.depositar(3000);
        cuenta1.retirar(2000);
        cuenta1.consultarSaldo();
    }
}
