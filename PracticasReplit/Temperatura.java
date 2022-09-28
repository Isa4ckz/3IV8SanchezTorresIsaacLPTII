import java.util.Scanner;
class Temp {
  public static void main(String[] args) {
    //aaaaaaa, favor de hacer java Temp, porque sino muero, graciassss
  //Declarar variables
    Scanner teclado;
    double f;
    double c;
    double k;
    double r;
    char continuar;
    continuar = 'S';
    int opcion;
    String user;
    //Inicializar variables
  teclado= new Scanner (System.in);
    //bienvenida
    System.out.println("Programa para hacer conversion de grados celsius a fahrenheit, kelvin y rankine ");
    System.out.println("¿Tienes nombre? Escribelo");
    user= teclado.nextLine();
    System.out.println("Pase usted "+ user);
  do{
    f= 0;
    k= 0;
    c= 0;
    r= 0;
    
    //pedir grados celcius
    System.out.println("Introduce temperatura en grados Celsius");
    c = teclado.nextDouble();
    System.out.println("¿A que tipo de grados quieres convertir?");
		
		System.out.println("1. Fahrenheit");
		System.out.println("2. Kelvin");
		System.out.println("3. Rankine");
		
		opcion = teclado.nextInt();

    switch(opcion){
			case 1:
				f = c *9/5 + 32;
				System.out.println("Los grados Fahrenheit son : "  + f);
				break;
			case 2:
				k= c +273.15;
				System.out.println("Los grados Kelvin son : "  + k);
				break;
			case 3:
				r = c * 9/5 +491.67;
				System.out.println("Los grados Rankine son : "   + r);
				break;
		
		}
    System.out.println("Quiere convertir otra vez? (S/N)");
		continuar = teclado.next(). charAt(0);
	}while (continuar == 'S');
    //cuando finaliza el programa aparece el autor
    System.out.println("Elaborado por un niño llamado Isaac");
  }
}