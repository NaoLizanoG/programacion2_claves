import java.util.HashMap;
import java.util.Map;

public class Boveda {
   private Map<String,String> mapClaves= new HashMap<>();

    public void guardarClave (String usuario, String clave){

        mapClaves.put(usuario,clave);
    }

    public void mostrarClave (String usuario){

        System.out.println("El usuario es: "+usuario);
        System.out.println("La clave es:"+mapClaves.get(usuario));
    }


}
