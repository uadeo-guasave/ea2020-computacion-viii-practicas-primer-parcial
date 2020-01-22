/**
 * Decisiones if
 * Diseña una aplicación que dadas 3 calificaciones calcule el promedio.
 * señale si el estudiante se encuentra aprobado o no según el promedio
 * sea mayor o igual a 70.
 */
public class Promedio {

    public Promedio(int cal1, int cal2, int cal3) {
        // 70, 80, 100 = 83.33
        double promedio = (cal1 + cal2 + cal3)/3;
        System.out.println("El promedio es " + promedio);
        if (promedio >= 70) {
            System.out.println("El alumno está aprobado.");
        } else {
            System.out.println("El alumno está reprobado.");
        }
    }
    
    public static void main(String[] args) {
        new Promedio(70, 50, 50);
    }
}