import java.util.Scanner;

public class ClaveExistente extends Claves {


    @Override
    public String ingresar() {
        boolean a;
        String clave;
        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la contraseña que desea guardar, debe tener mínimo 8 caracteres");
        clave= scanner.next();
        int longitud = clave.length();
        a = Longitud(longitud);
        }while (a==false);
        return clave;
    }
}
