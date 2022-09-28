//esto es un comentario

/**
 * Todo el programa en java debe de tener el nombre de la clase tal cual como el
 * archivo
 */

class EntradadeTexto {
    // los limites de la clase

    // toda clase debe de tener un metodo principal
    /**
     * vamos a realizar un programa mediante el cual podemos introducir texto a
     * nuestra conveniencia
     */

    // metodo principal

    public static void main(String[] args) {
        // tipo de dato
        String nombre;
        // el ; es el fin de la linea
        int edad;
        // instancia
        System.out.println("Por favor introduce tu nombre");

        // vamos a obtener el nombre del usuario

        nombre = System.console().readLine();

        System.out.println("Por favor introduce tu edad");
        // como transformar un tipo de dato a otro en java
        edad = Integer.parseInt(System.console().readLine());

        System.out.println("Hola " + nombre + " bienvenido a tu programa tienes " + edad + " primaveras ");
    }
}