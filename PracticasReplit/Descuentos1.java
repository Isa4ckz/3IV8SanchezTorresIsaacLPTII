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
    
    
    System.out.println("¿Cual es la cantidad de tu abono?");
      abono = teclado.nextInt();
    System.out.println("Introduce tu edad");
      edad= teclado.nextInt();
  
       if (edad >=100){
     System.out.println("Felicidades por ser tan grande");
       }else{
      if(edad<=0){
          System.out.println("¿Puedes escribir?");}
         else{
     if(edad <=21 && edad>=1){
      System.out.println("¿Sus padres son socios? Escribe (S/N) respectivamente ");
		  socios = teclado.next(). charAt(0);
     
       if(socios == 'S')
            {
        abono = abono * .45;
        
    
            }
       else{
        abono = abono*.25;
         
      }}
       else {
         
       if (edad <=65 && edad<100) { 
      abono = abono *.40;
        
      }
     
    
    System.out.println("El descuento a su abono es de :" + abono);
      
         }}}
      System.out.println("¿Otra vez? Si y No (Y/N)");
      otravez = teclado.next(). charAt(0);
    }while(otravez == 'Y');
    //cuando finaliza el programa aparece el autor
    System.out.println("Elaborado por un niño llamado Isaac");
  
    }}