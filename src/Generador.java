import java.awt.*;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
public class Generador {

    //declaramos con final para evitar modificación del contenido en cualquier parte del código:
   /* serán llamados en conjunto como libelementos a la hora de la generacion de claves*/
    private  String minusculas = "abcdefghijklmnñopqrstuvwxyz";
    private String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private  String num = "1234567890";
    private String especiales = "?¡¿'!|°#$%&/())=?¨*[]´+}{-*/;:_<>.";

////////////////////////////////////////////////////////////////////////////////////////
    public Generador(){
    }



    public String pswgen(int lenght) {

    /*StringBuilder para poder usar y modificar solo en pswgen las cadenas de caracteres que
    declaré al inicio */

        StringBuilder contrasena = new StringBuilder();
        String libelementos = this.minusculas + this.mayusculas + this.num +this.especiales;
        Random random = new SecureRandom();

        for (int i=0; i<lenght;i++){
            //randomiza el contenido de libelementos, es decir, minusculas, mayusculas, num y signos
            int index = random.nextInt(libelementos.length());
            contrasena.append(libelementos.charAt(index));
        }
        return contrasena.toString();

    }

    public String generar(){
        int i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese la longitud de su contraseña a ser generada: ");
        int longitud = scanner.nextInt();
        while (longitud<8) {
            System.out.println("Su contraseña no será segura, debe tener minimo 8 caracteres");
            System.out.println("Inténtelo de nuevo");
            longitud = scanner.nextInt();
        }
        String pswgen = pswgen(longitud);
        System.out.println("Contraseña generada con éxito: " + pswgen);
        return pswgen;
    }

    public String generarUsuario (){
        Scanner scanner = new Scanner(System.in);
        int menu2=0;
        String usuario="";
        do {
        System.out.println("1. Guardar contraseña");
        System.out.println("2.Salir");
        menu2 = scanner.nextInt();
        if (menu2==1){
            System.out.println("Ingrese el usuario correspondiente a esta contraseña");
            usuario = scanner.next();

        } else if (menu2==2) {
        break;
        }
        else {
            System.out.println("Numero inválido");
        }
        }while (menu2!=1);
        return usuario;
    }
    public String generarPalabraClave (){
        Scanner scanner = new Scanner(System.in);
        int menu2=0;
        String plat="";
                System.out.println("Ingrese la plataforma a la que corresponden estos datos");
                plat = scanner.next();

        return plat;
    }

    }
