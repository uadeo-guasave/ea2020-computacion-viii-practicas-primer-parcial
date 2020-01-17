class MyDate {
    // variables miembro: definidas dentro de la clase y fuera de los métodos
    private int day = 1;
    private int month = 1;
    private int year = 2020;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void print() {
        System.out.println("Tu fecha de nacimiento es: " + day + '/' + month + '/' + year);
    }
}

public class TestMyDate {
    public static void main(String[] args) {
        MyDate birthday = new MyDate(1, 12, 1979);
        birthday.print();
    }
}