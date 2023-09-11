import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Ingrese Nombre 1: ");
        String nombreA1 = scanner.nextLine();
        String nombreA2 = nombreA1.toUpperCase().charAt(1) + "." + nombreA1.substring(nombreA1.length()-2);*/

        System.out.println("Ingrese Nombre 1: ");
        String nombreA1 = scanner.nextLine();
        String nombreA2 = nombreA1.toUpperCase().charAt(1) + "." + nombreA1.substring(nombreA1.length()-2);

        System.out.println("Ingrese Nombre 2: ");
        String nombreB1 = scanner.nextLine();
        String nombreB2 = nombreB1.toUpperCase().charAt(1) + "." + nombreB1.substring( nombreB1.length()-2);

        System.out.println("Ingrese Nombre 3: ");
        String nombreC1 = scanner.nextLine();
        String nombreC2 = nombreC1.toUpperCase().charAt(1) + "." + nombreC1.substring( nombreC1.length()-2);
    
        String resultado = nombreA2 + " " + nombreB2 + " " + nombreC2;
        System.out.println("resultado = " + resultado);

    }
}
