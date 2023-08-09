public class EjemploString {
    public static void main(String[] args) {
        
        String curso = "Programación Java";
        String curso2= new String("Programación Java");
        
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);
        
        esIgual = curso.equals(curso2);//compara con el equals(metodo) dos string
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);//compara con el equals(metodo) dos string, pero con el IgnoreCase no compara
        //caracterer a caracter sus diferencias
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
        
    }
}
