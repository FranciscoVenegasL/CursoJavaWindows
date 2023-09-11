public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Francisco";
        System.out.println("nombre.length() = " + nombre.length()); //Largo del string
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //Convertir a mayúscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); //Convertir a minúscula
        System.out.println("nombre.equals(\"Francisco\") = " + nombre.equals("Francisco")); //es igual
        System.out.println("nombre.equals(\"Francisco\") = " + nombre.equals("francisco")); //es igual
        System.out.println("nombre.equalsIgnoreCase(\"Francisco\") = " + nombre.equalsIgnoreCase("Francisco"));
        System.out.println("nombre.compareTo(\"Francisco\") = " + nombre.compareTo("Francisco"));//si el valor es 0 son identicos
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(8));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(4,6) = " + nombre.substring(nombre.length()-1));//imprima el
        // ultimo caracter de manera dinamica, el -1 es para que tome realmente el ultimo caracter.

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));//Reemplaza el valor en el objeto pero
        // de la instancia, no el original

        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));//Retorna la primera ocurrencia
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));//Retorna la última ocurrencia
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));//cuando no está el caracter retorna -1
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));//busca si lo encuentra, en caso positivo
        //Retorna un true, es un boolean
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));//retorna un boolean también
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));//valida con qué termina, retorna un boolean
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());//metodo para eliminar espacios



    }
}
