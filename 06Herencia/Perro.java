import java.util.Scanner;
public class Perro extends Animal {
    /** la palabra reservada extends es para heredar */

    private String ladrido;
    Scanner entrada = new Scanner(System.in);
    public Perro() {

    }

    public Perro(String nombre, String raza, String tipo_alimento, int edad, String ladrido) {
        /**
         * para poder obtener o acceder a los atributos heredados debemos hacer uso de
         * la palabra reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.ladrido = ladrido;
    }

    public String getLadrido() {
        return ladrido;
    }

    // set
    public void setLadrido(String ladrido) {
        this.ladrido = ladrido;
    }
    public void DatosPerro(){
        System.out.println("¿Como ladra el perro?");
        ladrido = entrada.nextLine();
    }
    public void mostrarPerro() {
        System.out.println("El nombre del perro es: " + getNombre() + "\n"
                + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n"
                + "Su edad es: " + getEdad() + "\n"
                + "Su ladrido es: " + ladrido + "\n");
    }

}