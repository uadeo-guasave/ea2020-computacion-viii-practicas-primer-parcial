/**
 * Diseña una programa que inicialice un arreglo, de la sig. Forma: int
 * cal[]={100,80,100,70,50,50,80,80,70,80}; Y mediante otro arreglo, de
 * frecuencias, señale cuantos 10, 20, 30... 100 existen.
 */
public class Calificacion {

    public static void main(String[] args) {
        int cal[] = { 100, 80, 100, 70, 50, 50, 80, 80, 70, 80 };
        int fre[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        for (int f = 0; f < fre.length; f++) {
            int contador = 0;
            for (int c = 0; c < cal.length; c++) {
                if (fre[f] == cal[c]) {
                    contador++;
                }
            }
            System.out.println("El valor " + fre[f] + " se encuentra " + contador + " veces.");
        }

    }
}