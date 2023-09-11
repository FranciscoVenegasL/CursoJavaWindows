import java.util.Arrays;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento
        int i = 1;
        System.out.println("Valor inicial de i = " + i);
        int j = ++i; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post incremento
        i = 2;
        System.out.println("Valor inicial de i = " + i);
        j = i++; //después que se asigna la i a la j incrementa su valor
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        i = 3;
        System.out.println("Valor inicial de i = " + i);
        j = --i; // i = i - 2 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        i = 4;
        System.out.println("Valor inicial de i = " + i);
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j); // Primero se asigna a la j y luego se decrementa la i

        System.out.println("++j = " + ++j);
        System.out.println("j++ = " + j++);
        System.out.println("despues de j = " + j);

    }
}
