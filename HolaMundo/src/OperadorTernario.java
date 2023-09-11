import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 8 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas en escala entre 2.0 y 7.0");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias en escala entre 2.0 y 7.0");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia en escala entre 2.0 y 7.0");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "Aprobado": "Rechazado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);

        /*if(promedio >= 5.49){ //mismo ejemplo pero con IF
            estado = "Aprobado";
        } else {
            estado = "Rechazado";
        }
        System.out.println("estado = " + estado);*/

    }
}
