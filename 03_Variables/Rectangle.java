// Laboratorio
public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 10;
        this.width = 2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int area = rectangle.length * rectangle.width;
        System.out.println("Area: " + area);
    }
}