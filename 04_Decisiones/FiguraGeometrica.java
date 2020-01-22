/**
 * Decisiones - switch
 * Diseña una aplicación que pida el número de lados de una
 * figura geométrica y de acuerdo a éstos, señale que tipo
 * de polígono es. Si se trata de 4 lados, determinar si
 * se trata de un cuadrado o rectángulo.
 */
public class FiguraGeometrica {

    private int lados;

    public FiguraGeometrica(int lados) {
        this.lados = lados;
        imprimirTipo();
    }

    public void imprimirTipo() {
        switch (this.lados) {
            case 3:
                System.out.println("La figura es un triángulo.");
                break;
            case 4:
                System.out.print("¿El tamaño de los lados es igual? si/no ");
                String ladosIguales = System.console().readLine();
                // == compara por referencia
                // equals() compara valor
                if (ladosIguales.equals("si")) {
                    System.out.println("La figura es un cuadrado.");
                } else {
                    System.out.println("La figura es un rectángulo.");
                }
                break;
            case 5:
                System.out.println("La figura es un pentágono.");
                break;
        
            default:
                System.out.println("El número de lados de ser >=3 y <=5");
                break;
        }
    }

    public static void main(String[] args) {
        new FiguraGeometrica(4);
    }
}