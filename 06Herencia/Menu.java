import java.util.Scanner;
public class Menu{

Scanner entrada = new Scanner(System.in);
char ope;
int op;
       /* cat.PedirDatos();
        cat.DatosGato();
        cat.mostrarGato();*/
        //dog.mostrarPerro();
    public void menu(){
        //aqui va el do
        
        do{
         
Gato cat = new Gato();
Perro dog = new Perro();
        //Perro dog = new Perro("Pulgas", "de calle", "croquetas", 2, "hace guau guau");
Animal menu =new Animal();
Hamster ham =new Hamster();
Conejo con = new Conejo();
Huron hur = new Huron();
        System.out.println("Revista de mascotas, bienvenido");
        System.out.println("Elige el animal que tengas ");
        System.out.println("1 .-Perro ");
        System.out.println("2 .- Gato");
        System.out.println("3 .- Hamster");
        System.out.println("4 .- Conejo");
        System.out.println("5 .- Huron");

        op = entrada.nextInt();
        System.out.println(" ");
        System.out.println(" ");


        switch(op){
            case 1:
            dog.PedirDatos();
            dog.DatosPerro();
            //System.out.println(" ");
            dog.mostrarPerro();
                break;
            case 2:
            cat.PedirDatos();
            cat.DatosGato();
            System.out.println(" ");
            cat.mostrarGato();
                break;
            case 3:
            ham.PedirDatos();
            ham.DatosHamster();
            System.out.println(" ");
            ham.mostrarHamster();
                break;
            case 4:
            con.PedirDatos();
            con.DatosConejo();
            System.out.println(" ");
            con.mostrarConejo();
                break;
            case 5:
            hur.PedirDatos();
            hur.DatosHuron();
            System.out.println(" ");
            hur.mostrarHuron();
                break;
            default:
            System.out.println("No admitida mi rey");

            
        }
System.out.println("¿Deseas repetir el programa? Si lo desea escriba s");
            ope = entrada.next().charAt(0);


    }while (ope == 's' || ope == 'S');
    }
}