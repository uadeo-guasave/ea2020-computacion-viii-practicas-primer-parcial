/**
 * Decisiones - switch Realice una aplicación que solicite el número de un mes
 * y de acuerdo a éste, diga el número de días que contiene el mes.
 */
public class MesDias {
    private int año;
    private int mes;

    public MesDias(int año, int mes) {
        this.año = año;
        this.mes = mes;
        imprimirDiasDelMes();
    }

    public void imprimirDiasDelMes() {
        switch (mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("El mes " + this.mes + " tiene 31 días.");
            break;

        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("El mes " + this.mes + " tiene 30 días.");
            break;

        case 2:
            // preguntar si el año es divisible entre 4
            if (año % 4 == 0) {
                System.out.println("El mes " + this.mes + " tiene 29 días.");
            } else {
                System.out.println("El mes " + this.mes + " tiene 28 días.");
            }
            break;

        default:
            System.out.println(
                    "El número de mes ingresado " + this.mes + " debe ser mayor o igual a 1 y menor o igual a 12.");
            break;
        }
    }

    public static void main(String[] args) {
        int año, mes;
        System.out.print("Ingresa el año: ");
        año = Integer.parseInt(System.console().readLine());
        System.out.print("Ingresa el mes: ");
        mes = Integer.parseInt(System.console().readLine());
        new MesDias(año, mes);
    }
}