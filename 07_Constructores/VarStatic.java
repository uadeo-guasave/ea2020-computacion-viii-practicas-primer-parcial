class Miclass {
    public static int cuentaInstancias = 0;
    private int x = 0;

    public Miclass(int valor) {
        // cada vez que se invoca el constructor se incrementa una unidad al contador
        cuentaInstancias++;
        x = valor;
    }

    public static void cuentaReset() {
        cuentaInstancias = 0;
    }

    public int getx() {
        return x;
    }
}

public class VarStatic {
    public static void main(String[] args) {
        Miclass m = new Miclass(10);
        Miclass n = new Miclass(5);
        System.out.println("Hay " + Miclass.cuentaInstancias + " instancias de Mi Clase");
        System.out.println("x en m vale " + m.getx() + "\n" + "x en n vale " + n.getx());
    }

}

/**
 * Modifica el código anterior para q la variable cuetaInstancias no pueda ser
 * modificada intencionalmente. Es decir, se incremente solamente cuando se cree
 * una nueva instancia.
 */