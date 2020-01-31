/**
 * Constructores
 */
public class Constructores {

    public static void main(String[] args) {
        System.out.println("La área del cuadrado es: " + new Figura(10).a);
        System.out.println("La área del rectángulo es: " + new Figura(10,20).a);
    }
}

class Figura {
    private int x, y;
    public int a;

    public Figura(int x) {
        this.x = x;
        this.a = this.area(this.x);
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
        this.a = this.area(this.x, this.y);
    }

    private int area(int x) {
        return x ^ 2;
    }

    private int area(int x, int y) {
        return x * y;
    }
}