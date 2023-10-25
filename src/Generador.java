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

    public Generador(String minusculas, String mayusculas, String num, String especiales){
        this.minusculas=minusculas;
        this.mayusculas=mayusculas;
        this.num=num;
        this.especiales=especiales;
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

    public void generar(){
        int i=0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor, ingrese la longitud de su contraseña a ser generada: ");
            int longitud = scanner.nextInt();

            if (longitud <= 0) {
                System.out.println("Valor inválido");

            } else if (longitud < 8 && longitud > 0) {
                System.out.println("Su contraseña no será segura, debe tener minimo 8 caracteres");

            } else {
                String pswgen = pswgen(longitud);
                System.out.println("Contraseñaa generada con éxito: " + pswgen);
                i=1;

            }
        }while (i!=1);
    }

    }
