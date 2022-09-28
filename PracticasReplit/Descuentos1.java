//los otros programas estan en files):)
import java.util.Scanner;
class Descuentos {
  public static void main(String[] args) {
  //Declarar variables
    Scanner teclado;
    String user;
    int edad;
    double abono;
    char socios;
    double abono1;
    char otravez;
    socios = 'S';
    otravez = 'Y';
    //aaaaaaa, favor de hacer java Descuentos , porque sino muero, graciassss
  //Inicializar variables
  teclado= new Scanner (System.in);
    //alo
    System.out.println("Programa para saber el descuento de un abono");
    System.out.println("¿Tienes nombre? Escribelo");
    user= teclado.nextLine();
    System.out.println("Pase usted "+ user);
    do{
    edad = 0;
    abono = 0;
    abono1 = 0;
    System.out.println("¿Cual es la cantidad de tu abono?");
      abono = teclado.nextDouble();
    System.out.println("Introduce tu edad");
      edad= teclado.nextInt();
    if (edad <=65 && edad<100) { 
      abono1 = abono *.40;
    }
      
    else  if (edad <=21 && edad>0){
      System.out.println("¿Sus padres son socios? Escribe (S/N) respectivamente ");
		  socios = teclado.next(). charAt(0);
    
     if (socios == 'S')
            {
        abono1 = abono * .45;
               abono = abono - abono1;
    System.out.println("El descuento a su abono es de :" + abono1 + " y su abono con descuento es : "+ abono);
      }}
      if (socios == 'N'){
        abono1 = abono*.25;
         abono = abono - abono1;
    System.out.println("El descuento a su abono es de :" + abono1 + " y su abono con descuento es : "+ abono);
      }
        if (edad>100){
        System.out.println("Felicidades por ser tan grande");
       }
         if (edad<0){
          System.out.println("¿Puedes escribir?");
        }
      System.out.println("¿Otra vez? Si y No (Y/N)");
      otravez = teclado.next(). charAt(0);
    }while(otravez == 'Y');
    //cuando finaliza el programa aparece el autor
    System.out.println("Elaborado por un niño llamado Isaac");
  }
}