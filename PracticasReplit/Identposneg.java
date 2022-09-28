import java.util.Scanner;
class menos {
  public static void main(String[] args) {
    //aaaaaaa, favor de hacer java menos, porque sino muero, graciassss
  //Declarar variables
  Scanner teclado;
  double num, posit;
  String user;
  char continuar;
  continuar = 'Y';
  //Inicializar variables
  teclado = new Scanner (System.in);
  //bienvenida
    System.out.println("Programa para saber que numeros ingresados son negativos y positivos ");
  System.out.println("¿Tienes nombre? Escribelo");
    user= teclado.nextLine();
    System.out.println("Pase usted "+ user);
do{
  num= 0;

    System.out.println("Introduzca el tamaño de la serie ");
    num= teclado.nextDouble();
    if (num>0){
      for (double i =1 ; i<=num ;i++){
        
    System.out.println("Metamosle nitro");
    posit= teclado.nextDouble();
      if(posit>0){
        System.out.println("Es positivo");
      }
      else if(posit<0){
        System.out.println("Es negativo");
      }
        else{
          System.out.println("Escribe uno diferente a cero");
        }
      }
      
    }
  System.out.println("¿Otra vez? Si y No (Y/N)");
      continuar = teclado.next(). charAt(0);
    }while(continuar == 'Y');
    //cuando finaliza el programa aparece el autor
    System.out.println("Elaborado por un niño llamado Isaac");
  }
}