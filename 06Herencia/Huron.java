import java.util.Scanner;
public class Huron extends Animal {
    /** la palabra reservada extends es para heredar */

    private String explorador;
    Scanner entrada = new Scanner(System.in);
    public Huron() {

    }

    public Huron(String nombre, String raza, String tipo_alimento, int edad, String jugueton) {
        /**
         * para poder obtener o acceder a los atributos heredados debemos hacer uso de
         * la palabra reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.explorador = explorador;
    }

    public String getExplorador() {
        return explorador;
    }

    // set
    public void setExplorador(String explorador) {
        this.explorador = explorador;
    }
    public void DatosHuron(){
        System.out.println("¿Cuantas veces recorre su cuarto al dia?");
        explorador = entrada.nextLine();
    }
    public void mostrarHuron() {
        System.out.println("El nombre del huron es: " + getNombre() + "\n"
                + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n"
                + "Su edad es: " + getEdad() + "\n"
                + "Recorre un cuarto : " + explorador + "\n"+" al dia");
    }

}