/* Realiza un ejercicio con cadenas como: “TRUE”,”101,136.99”,”67” y puedas realizar operaciones con ellos.
El valor true, puedas usarlo dentro de una condición
El valor doble, calcularle el iva
Y el valor entero, asígnalo a una variable de tipo byte e incrementalo en 1. */

public class Wrapper {
    private String sb = "true";
    private String sd = "101136.99";
    private String si = "67";

    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        // convertir de String a Boolean
        boolean b = Boolean.valueOf(w.sb);
        System.out.println(b ? "Verdadero" : "Falso");
        // ternary if (condition) ? true : false;
        // if (b) {
        // System.out.println("Verdadero");
        // } else {
        // System.out.println("Falso");
        // }

        // convertir de String a Double y calcular IVA
        double d = Double.parseDouble(w.sd);
        System.out.println("El IVA de " + d + " es " + d * 0.16);

        // convertir de String a Byte y sumar 1
        byte by = Byte.parseByte(w.si);
        System.out.println(by + 1);
    }
}