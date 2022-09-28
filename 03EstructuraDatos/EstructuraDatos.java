
/**
 * vamos a crear un programa que se encargue de realizar los siguientes
 * programas 
 * 1.- bono o descuento por la edad
 * 2.- Convertir numeros decimales a binarios
 * 3.-Convertir temperatura Celcius, Farenheit
 * 4.-Numeros positivos y negativos
 * 5.-La tiendita
 * 6.-Area y perimetro
 * 7.-Tabla
 * 8.-Factorial
 * 9.-Dibujito
 * 10.-Figuras huecas de codigo 
 * 11.-Patrones
 * 12.-Diamante 
 * 13.-Calculadora
 * 14.-Salir
 */

import java.util.Scanner;

class EstructuraDatos {
    // Programa 1
    public static void main(String[] args) {
        // declaro mi objeto
        Scanner entrada = new Scanner(System.in);

        // variables
        int edad, opcion, socio, numbinario, total, numtotal, num, a, b;
        int positivos = 0;
        int negativos = 0;
        double precio, bono;
        char letras, operacion;
        float precios = 0;
        float resultado = 0;
        int cantidad = 0;
        String binario = "";

        // vamos a crear un bucle para que se repita el programa
        do {
            // vamos a crear nuestro menu
            System.out.println("Bienvenido a la tarea que tenian que hacer ):)");
            System.out.println("Por favor elija la opcion deseada: ");
            System.out.println("1. Descuento por edad");
            System.out.println("2. Convertir numero decimal a binario");
            System.out.println("3. Conversiones de temperatura");
            System.out.println("4. Numeros positivos y negativos");
            System.out.println("5. La tiendita");
            System.out.println("6. Area y perimetro");
            System.out.println("7. Tabla");
            System.out.println("8. Factorial");
            System.out.println("9. Dibujitos");
            System.out.println("10. Figura hueca");
            System.out.println("11. Patrones");
            System.out.println("12. Diamante");
            System.out.println("13. Calculadora");
            System.out.println("14. Salir");

            opcion = entrada.nextInt();

            // nuestro switch
            switch (opcion) {
                case 1: // toca hacerlo
                    break;
                case 2:
                    System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    binario = "";
                    if (numbinario > 0) {
                        // Aplicar algoritmo
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2;
                        }
                    } else if (numbinario == 0) {
                        binario = "0";
                    } else {
                        binario = "No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero binario es : " + binario);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    // vamos a ver un for
                    for (num = 1; num <= 10; num++) {
                        System.out.println(num + " " + (num * 10) + " " + (num * 100) + " " + (num * 1000));
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Cuadrado Magico, hueco como el gran cañon");
                    System.out.println("Inserta el numero de unidades entre el 1 y el 20");
                    num = entrada.nextInt();
                    // linea superior
                    if (num >= 1 && num <= 20) {
                        for (int i = 0; i < num; i++) {
                            System.out.println(" * ");

                        }
                        System.out.println("");
                        // cuadrado interno
                        for (int j = 0; j > num - 2; j++) {
                            // fila
                            System.out.print(" ? ");
                            for (int k = 0; k > num - 2; k++) {
                                // columna
                                System.out.println(" ");
                            }
                            System.out.println(" * ");
                        }
                        // linea inferior
                        for (int i = 0; i < num; i++) {
                            System.out.println(" * ");
                        }
                        System.out.println("");
                    } else {
                        System.out.println("Error solo entre el 1 y 20, adiós");
                    }
                    break;
                case 11:
                     break;

                case 12:
                    break;
                case 13:
                //calculadora 
                System.out.println("Ingresa el primer numero");
                 a = entrada.nextInt();
                System.out.println("Ingresa el segundo numero");
                 b = entrada.nextInt();
                System.out.println("Ingresa el tipo de operacion (+ - * /");
                 operacion = entrada.next().charAt(0);
                switch(operacion){
                    case '+':
                    resultado = a+b;
                    System.out.println("La suma es : "+ resultado);
                    break;
                    case '-':
                    resultado = a-b;
                    System.out.println("La resta es : "+ resultado);
                    break;
                    case '*':
                    resultado = a*b;
                    System.out.println("La multiplicacion es : "+ resultado);
                    break;
                    case '/':
                    if(b!=0){
                        resultado = a/b;
                    System.out.println("La division es : "+ resultado);
                    }else{
                    System.out.println("no se puede");
                    }
                    break;
                    default:
                    System.out.println("Operacion no admitida solo sabemos + - * /");
                }
                break;
                case 14:
                    break;

                default:


            }
            // Debo preguntar
            System.out.println("¿Deseas repetir el programa? Si lo desea escriba s");
            letras = entrada.next().charAt(0);
        } while (letras == 's' || letras == 'S');

    }
}
