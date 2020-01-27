import java.util.Random;

/**
 * Trabajo extraclase: Modifica el programa anterior para que los valores sean
 * ingresados por el teclado de tal forma que si dan un 23, se redondee a 20, un
 * 27 a 30.
 * 
 * Trabajo en aula: Corregir el método despliega, para que muestre correctamente
 * los valores de 10 hasta el 100, ya que inicia desde 0
 * 
 * Modifica el ejercicio para que los valores sean generados aleatoriamente
 * Random class
 * 
 * Agregar un método que determine el promedio de los valores dentro del vector
 * Un método para que devuelva el máximo
 * Otro para el mínimo
 * Otro que imprima los valores dentro del vector
 * Otro que calcule la moda
 */
public class Estadistica {
    int vector[] = new int[10];
    int fre[] = new int[10];

    void frecuencia() {
        for (int i = 0; i < vector.length; i++) {
            ++fre[(vector[i]) / 10 - 1];
        }
    }

    void despliega() {
        for (int i = 0; i < fre.length; i++)
            System.out.println((i + 1) * 10 + " Frecuencia " + fre[i]);
    }

    void generarNumerosAleatorios() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (new Random().nextInt(9) + 1) * 10;
        }
    }

    public static void main(String[] args) {
        Estadistica obj = new Estadistica();
        obj.generarNumerosAleatorios();
        obj.frecuencia();
        obj.despliega();
    }
}
