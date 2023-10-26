import java.util.HashMap;
import java.util.Map;

public class Boveda {
   private Map<String,String> mapClaves= new HashMap<>();
    private Map<String,String> mapUsuarios= new HashMap<>();

    public void guardarClave (String plat, String clave){

        mapClaves.put(plat,clave);
    }
    public void guardarUsuario (String plat, String clave){

        mapUsuarios.put(plat,clave);
    }

    public void mostrarClave (String plat){

        System.out.println("La clave es:"+mapClaves.get(plat));
    }
    public void mostrarUsuario (String plat){

        System.out.println("El usuario es:"+mapUsuarios.get(plat));
    }
}
