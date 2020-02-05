/**
 * Crea una clase llamada Figura con 2 metodos abstractos area() y perimetro()
 * Y otras 2 llamadas Rectangulo y Cuadrado que hereden de Figura
 * En otra clase llamada Geometria, dentro de su metodo principal, 
 * genera 1 objeto de tipo Rectangulo y otro Cuadrado
 */

public class Geometria {

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(4, 9);
        Cuadrado c = new Cuadrado(5);
        r.area();
        r.perimetro();
        c.area();
        c.perimetro();
    }
}

abstract class Figura {
    public abstract void area();
    public abstract void perimetro();
}

class Rectangulo extends Figura {
    private double x, y;

    public Rectangulo(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Todos los métodos abstractos de la clase padre deben definirse
    // dentro de la subclase
    public void area() {
        System.out.println("El área del rectángulo es " + x * y);
    }
    public void perimetro() {
        System.out.println("El perímetro del rectángulo es " + (x * 2 + y * 2));
    }
}

class Cuadrado extends Figura {
    private double x;

    public Cuadrado(double x) {
        this.x = x;
    }

    public void area() {
        System.out.println("El área del cuadrado es " + Math.pow(x, 2));
    }
    public void perimetro() {
        System.out.println("El perímetro del cuadrado es " + x * 4);
    }
}