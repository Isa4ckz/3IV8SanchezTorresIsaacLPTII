import java.util.Scanner;
public class Tarea {

  //variables globales
  char h;
  //objeto
  Scanner entrada = new Scanner(System.in);

  //metodos
  public void menu(){
//aqui debe de ir el do pero aun no tengo la idea centrada
    System.out.println("Bienvenido a la tarea que aun no termino");
    System.out.println("Elije uno de los siguientes programas");
    System.out.println("1. Calcular edad");
    System.out.println("2. Area y perimetro de figuras");
    System.out.println("3. Costo de llamadas ");
    System.out.println("4. Sueldo de empleado");
	//valiendo roña
    h = entrada.next().charAt(0);
//aaaa
    switch(h){
      case 1:
        Calcular();
        break;
      case 2:
        Areayp();
        break;
      case 3:
        Costo();
        break;
      case 4:
        Sueldo();
        break;
        
    }
    
  }
  //case 1
  public void Calcular(){
    
    
  }
  
}
