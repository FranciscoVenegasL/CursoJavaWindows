import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ImprimirNombre {
    private static final Logger logger = Logger.getLogger(ImprimirNombre.class.getName());

    public static void main(String[] args){
        //Agregrar un manejador de archivos para logs
        try {
            FileHandler fileHandler = new FileHandler("logs.log", true);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al configurar el manejador de archivos para logs.", e);
        }

        //Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {

            //Que el usuario digite su nombre
            System.out.print("Por favor ingrese su nombre: ");

            //Leer el nombre
            String nombre = scanner.nextLine();

            //se imprimir en pantalla el nombre
            System.out.println("Mi nombre es: " + nombre);

            //Registramos el log de la cadena ingresada
            logger.info("El nombre ingresado es: " + nombre);
        } catch (Exception e){
            logger.log(Level.SEVERE, "Error durante la ejecución del programa.",e);
        }
            //Cerrar el objeto Scanner en el bloque finally para asegurar de que siempre se cierre
            if (scanner != null){
                scanner.close();
            }
    }
}
