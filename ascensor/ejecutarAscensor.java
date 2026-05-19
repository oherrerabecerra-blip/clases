package ascensor;
import java.util.Scanner;
public class ejecutarAscensor {   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ascensor ascensor = new ascensor(10);
        persona persona = new persona("antonio");
        int opcion;
        do{
            System.out.println(" BIENVENIDO AL ASCENSOR ");
            System.out.println("1 llamar ascensor ");
            System.out.println("2 ver piso actual ");
            System.out.println("3 salir ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 :  
                        System.out.println(persona.getnombre()+ " esta en el piso ");
                        int LlamarAscensor = entrada.nextInt();
                        ascensor.movimientoAscensor(LlamarAscensor);
                        ascensor.Llegada();
                        System.out.println(persona.getnombre() + " presiona el boton");
                        System.out.println("hacia donde vas (arriba/abajo");
                        String direccion = entrada.next();
                        System.out.println(persona.getnombre() + " entra en el ascensor ");
                        ascensor.movimiento();
                        System.out.println(" ¿a que pisos vas? ");
                        int pisos = entrada.nextInt();
                        ascensor.movimientoAscensor(pisos);
                        ascensor.Llegada();
                        System.out.println(persona.getnombre() + " sale del ascensor ");
                        break;
            
                case 2:
                        System.out.println(" el ascensor esta en el piso " + ascensor.getpisoActual());// arregar este tambien

                         break;

                case 3 : 
                        System.out.println("salir ");
                        break;
                            default:
                                System.out.println("opcion invalida");
                            }
        }while (opcion != 3); 
                entrada.close();
    }

}
    
   
        
        

    


