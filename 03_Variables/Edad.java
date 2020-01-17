class Persona {
    private int edadEnAños = 40;
    private String nombre = "Bidkar";
    private String trabajo = "Docente";

    public void calcularEdad() {
        int edadEnDias = this.edadEnAños * 365;
        long edadEnSegundos = edadEnDias * 24 * 60 * 60;

        System.out.println("Tienes " + edadEnDias + " dias de nacido.");
        System.out.println("Tienes " + edadEnSegundos + " segundos de nacido.");
    }

    public void mostrar() {
        System.out.println("Mi nombre es " + this.nombre + " y soy " + this.trabajo);
    }
}

// DISEÑA UNA CLASE PUBLICA CON EL METODO MAIN, QUE INSTANCIE LA CLASE PERSONA.
// ENVIA UN MENSAJE A DISPLAY Y CALCULATEAGE
public class Edad {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.mostrar();
        persona.calcularEdad();
    }
}