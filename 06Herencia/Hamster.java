import java.util.Scanner;
public class Hamster extends Animal {
    /** la palabra reservada extends es para heredar */

    private String acciones;
    Scanner entrada = new Scanner(System.in);
    public Hamster() {

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String acciones) {
        /**
         * para poder obtener o acceder a los atributos heredados debemos hacer uso de
         * la palabra reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.acciones = acciones;
    }

    public String getAcciones() {
        return acciones;
    }

    // set
    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }
    public void DatosHamster(){
        System.out.println("¿Cuantas veces camina en su rueda al dia?");
        acciones = entrada.nextLine();
    }
    public void mostrarHamster() {
        System.out.println("El nombre del hamster es: " + getNombre() + "\n"
                + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n"
                + "Su edad es: " + getEdad() + "\n"
                + "Camina en su rueda: " + acciones + "\n"+ " al dia");
    }

}