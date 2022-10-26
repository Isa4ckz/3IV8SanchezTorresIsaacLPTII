import java.util.Scanner;
public class Animal {

    /**
     * Es poder restringir el acceso a los tipos de dato. Vamos a poder agrupar en
     * una clase el acceso a los diferentes metodos u objetos de clase, pára que no
     * puedan ser modificados
     */

    private String nombre, raza, tipo_alimento;
    private int edad;
    Scanner entrada = new Scanner(System.in);
    /**
     * Definimos el constructor
     * este nos sirve para poder declarar la exitencia de una clase, inicializar las
     * variables y poder crear instancias de objetos
     */

    public Animal() {
        // vacio
    }

    // sobrecarga de metodo
    public Animal(String nombre, String raza, String tipo_alimento, int edad) {
        // para poder definir los parametros de acceso a las variables
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;

    }

    /**
     * Poder enviar y obtener los valores correspondientes de las variables
     * getter y setter
     * get -> obtener -> recibir
     * set -> asignar -> enviar
     */

    /// get
    public String getNombre() {
        return nombre;
    }

    // set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /// get
    public String getRaza() {
        return raza;
    }

    // set
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /// get
    public String getTipo_alimento() {
        return tipo_alimento;
    }

    // set
    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

    /// get
    public int getEdad() {
        return edad;
    }

    // set
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void PedirDatos(){
        System.out.println("Ingrese el nombre de la mascota");
         nombre = entrada.nextLine();
        System.out.println("Ingrese la raza de la mascota");
         raza = entrada.nextLine();
        System.out.println("Ingrese el tipo de alimento de la mascota");
         tipo_alimento = entrada.nextLine();
        System.out.println("Ingrese la edad  de la mascota");
         edad = entrada.nextInt();
    }
}