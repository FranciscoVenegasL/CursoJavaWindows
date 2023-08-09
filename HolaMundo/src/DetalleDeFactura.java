import java.util.Scanner;

public class DetalleDeFactura {

    //declaración de variables de Clase
    public static String facturaDetalle;
    public static double precio1;
    public static double precio2;

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            //Los if son para que no se ingrese ningún blanco en la factura.
            if (facturaDetalle == null || facturaDetalle.trim().isEmpty() ){
                System.out.println("Ingrese nombre de la Factura = ");
                facturaDetalle = scanner.nextLine();
            }

            if (precio1 == 0){
                System.out.println("Ingrese el precio del producto 1 = ");
                precio1 = scanner.nextDouble();
            }

            if (precio2 == 0){
                System.out.println("Ingrese el precio del producto 2 = ");
                precio2 = scanner.nextDouble();
            }

        } catch (Exception ex) {
            if (facturaDetalle == null || facturaDetalle.trim().isEmpty()){
                System.out.println("Error: El nombre de la factura es incorrecto");
            }
            if (precio1 == 0){
                System.out.println("Error: El precio del producto 1 tiene que ser decimal.");
            }
            if (precio2 == 0){
                System.out.println("Error: El precio del producto 2 tiene que ser decimal");
            }
            main(args);
            System.exit(0);
        }

        //Calculo, suma y 19%
        double sumaPrecios = precio1 + precio2;
        double impuesto = sumaPrecios * 0.19;
        double totalConImpuesto = sumaPrecios + impuesto;

        var respuesta = "\nLa factura " + facturaDetalle +
                " tiene un total bruto de " + sumaPrecios +
                ", con un impuesto de " + impuesto +
                " y el monto después de impuesto es de " + totalConImpuesto;

        System.out.println(respuesta);

    }
}
