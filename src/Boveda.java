import java.util.HashMap;
import java.util.Map;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;
import java.util.Scanner;

public class Boveda {
    private Map<String,String> mapClaves= new HashMap<>();
    private Map<String,String> mapUsuarios= new HashMap<>();
    Encriptar encriptar1=new Encriptar();

    public void guardarClave (String plat, String clave){

        mapClaves.put(plat, encriptar1.encriptarAES(clave));
    }
    public void guardarUsuario (String plat, String clave){
        mapUsuarios.put(plat,clave);
    }

    public void mostrarClave (String plat){
        System.out.println("La clave es:"+encriptar1.desencriptarAES(mapClaves.get(plat)));
    }
    public void mostrarUsuario (String plat){
        System.out.println("El usuario es:"+mapUsuarios.get(plat));
    }
    public void cambiarClave(String plat){
        System.out.println("Ingrese la nueva clave");
        Scanner scanner = new Scanner(System.in);
        String claven = scanner.next();
        mapClaves.put(plat, claven);
        System.out.println("La clave nueva es:"+mapClaves.get(plat));
    }

    public void cambiarUsuario(String plat){
        System.out.println("Ingrese el nuevo usuario");
        Scanner scanner = new Scanner(System.in);
        String usuarion = scanner.next();
        mapUsuarios.put(plat, usuarion);
        System.out.println("La clave nueva es:"+mapUsuarios.get(plat));
    }


}
