import java.util.Scanner;
public class Conejo extends Animal {
    /** la palabra reservada extends es para heredar */

    private String cava;
    Scanner entrada = new Scanner(System.in);
    public Conejo() {

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, String cava) {
        /**
         * para poder obtener o acceder a los atributos heredados debemos hacer uso de
         * la palabra reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.cava = cava;
    }

    public String getCava() {
        return cava;
    }

    // set
    public void setCava(String cava) {
        this.cava = cava;
    }
    public void DatosConejo(){
        System.out.println("¿Su conejo cava?");
        cava = entrada.nextLine();
    }
    public void mostrarConejo() {
        System.out.println("El nombre del conejo es: " + getNombre() + "\n"
                + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n"
                + "Su edad es: " + getEdad() + "\n"
                + "Normalmente: " + cava + "\n"+"cava");
    }

}