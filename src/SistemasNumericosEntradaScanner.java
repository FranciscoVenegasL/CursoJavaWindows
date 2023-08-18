import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");

        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Error debe ingresar un número entero: ");
            main(args);
            System.exit(0);
        }
    }
}
