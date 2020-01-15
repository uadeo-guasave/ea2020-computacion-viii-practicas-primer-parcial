class Miembros {
    boolean b;
    char c;
    byte bt;
    short sh;
    int i;
    long l;
    float f;
    double d;
    String s;
}

public class IniciaVariables {
    public static void main(String[] args) {
        Miembros campo = new Miembros();

        System.out.println("b=" + campo.b + "\n" +
                           "c=" + campo.c + "\n" +
                           "bt=" + campo.bt + "\n" +
                           "sh=" + campo.sh+ "\n" +
                           "i=" + campo.i + "\n" +
                           "l=" + campo.l + "\n" +
                           "f=" + campo.f + "\n" +
                           "d=" + campo.d + "\n" +
                           "s=" + campo.s + "\n");
    }
}