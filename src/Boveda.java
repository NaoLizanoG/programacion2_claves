import java.util.HashMap;
import java.util.Map;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;

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


}
