public class EjemploStringTestRendimientoConcatPractica {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c1 = a;
        String c2 = a;
        String c3 = a;
        int time = 100000;
        StringBuilder sb = new StringBuilder(a);

        /*-----------------------------------------*/
        long inicio1 = System.currentTimeMillis();
        for (int i = 0; i < time; i++ ){
            c1 = c1.concat(a).concat(b).concat("\n"); // 500 => 2 ms
        }
        long fin1 = System.currentTimeMillis();
        //System.out.println("concat c1 = " + c1);
        System.out.println("tiempo con c1= " + (fin1 - inicio1));


        /*-----------------------------------------*/
        long inicio2 = System.currentTimeMillis();
        for (int i = 0; i < time; i++ ){
            c2 = a + b +"\n"; // 500 => 2 ms
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("tiempo con c2= " + (fin2 - inicio2));

        /*----------------------------------------*/
        long inicio3 = System.currentTimeMillis();

        for (int i = 0; i < time; i++ ){
            sb.append(a).append(b).append("\n"); // 500 => 2 ms
        }

        long fin3 = System.currentTimeMillis();
        System.out.println("tiempo con c3= " + (fin3 - inicio3));

        //long resultado = fin - inicio;
        //System.out.println("resultado = " + resultado);
    }
}
