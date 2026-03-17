public class CuentaBancaria {  
    public static void main(String[] args) {
        
    } 
        String numeroCuenta;
        String titular; 
        double saldo;

        public CuentaBancaria( String numeroCuenta , String titular , double saldo ) {
            this.numeroCuenta = numeroCuenta; 
            this.titular = titular;
            this.saldo = saldo;
    }
    public void depositar(double cantidad ) {
        saldo = saldo + cantidad;
        System.out.println(" deposito realizado " + cantidad );
    }
    public void retirar(double cantidad) {
        if(cantidad <= saldo) {
            saldo = saldo - cantidad; 
            System.out.println(" retiro realizado " + cantidad);
        }else{ 
            System.out.println(" saldo insufisiente ");
        }    
    }    
    public void consultarSaldo(){
        System.out.println(" saldo actual " + saldo);
    }
    }


