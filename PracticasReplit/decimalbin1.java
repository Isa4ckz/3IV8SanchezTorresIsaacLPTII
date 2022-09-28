import java.util.Scanner;
class bin {
  public static void main(String[] args) {
    //aaaaaaa, favor de hacer java bin, porque sino muero, graciassss
  //Declarar variables
    Scanner teclado;
    int numbin;
    String binario = "";
    String user;
    char agn;
    agn = 'Y';
    //inicializar variables
    teclado= new Scanner (System.in);
    //alo
    System.out.println("Programa para convertir numeros a binario");
    System.out.println("¿Tienes nombre? Escribelo");
    user= teclado.nextLine();
    System.out.println("Pase usted "+ user);
    do{
    numbin= 0;
System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                    numbin = teclado.nextInt();
    
                    binario = "";
                    if (numbin > 0) {
                        // Aplicar algoritmo
                        while (numbin > 0) {
                            if (numbin % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbin = (int) numbin / 2;
                        }
                    } else if (numbin == 0) {
                        binario = "0";
                    } else {
                        binario = "No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero binario es : " + binario);
     System.out.println("¿Otra vez? Si y No (Y/N)");
      agn = teclado.next(). charAt(0);
    }while(agn == 'Y');
    //cuando finaliza el programa aparece el autor
    System.out.println("Elaborado por un niño llamado Isaac");
  }
}