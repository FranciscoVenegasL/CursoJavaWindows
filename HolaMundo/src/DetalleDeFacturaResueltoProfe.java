import java.util.Scanner;
public class DetalleDeFacturaResueltoProfe {
    public static String nombreFactura;
    public static double precioProducto1;
    public static double precioProducto2;

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            if (nombreFactura == null || nombreFactura.trim().isEmpty()){
                System.out.println("Ingrese el nombre de la factura: ");
                nombreFactura = scanner.nextLine();
            }
            if (precioProducto1 == 0){
                System.out.println("Ingrese el precio del producto 1:");
                precioProducto1 = scanner.nextDouble();
            }
            if (precioProducto2 == 0){
                System.out.println("Ingrese el precio del producto 2:");
                precioProducto2 = scanner.nextDouble();
            }
        }
        catch(Exception ex){
            if (nombreFactura == null || nombreFactura.trim().isEmpty()){
                System.out.println("Error: El nombre de la factura es incorrecto.");
            }
            if (precioProducto1 == 0){
                System.out.println("Error: El precio del producto 1 tiene que se decimal.");
            }
            if (precioProducto2 == 0){
                System.out.println("Error: El precio del producto 2 tiene que se decimal.");
            }
            main(args);
            System.exit(0);
        }
        int impuesto = 19;
        double montoTotalBruto = precioProducto1 + precioProducto2;
        double montoImpuesto = montoTotalBruto*impuesto/100;
        double montoTotalNeto = montoTotalBruto + montoImpuesto;

        var respuesta = "\nLa factura " + nombreFactura +
                " tiene un total bruto de " +  montoTotalBruto +
                ", con un impuesto de " + montoImpuesto +
                " y el monto después de impuesto es de " + montoTotalNeto;

        System.out.println(respuesta);
    }
}
