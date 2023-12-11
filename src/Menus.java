import java.util.Scanner;

public class Menus {
        private Generador clave;
        private Boveda boveda;


        public void menu(){
            Boveda boveda1 = new Boveda();
            Scanner scanner = new Scanner(System.in);
            int menu = 0;
            System.out.println("Bienvenido a su bóveda de claves");


            do {
                System.out.println("Seleccione una opción");
                System.out.println("1. Crear una nueva contraseña");
                System.out.println("2. Ver contraseñas");
                System.out.println("3. Ingresar contraseña propia");
                System.out.println("4. Salir");
                menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        Generador clave1 = new Generador();
                        String contra1 = clave1.ingresar();
                        String usuario = clave1.generarUsuario();
                        String plat = clave1.generarPalabraClave();
                        boveda1.guardarClave(plat, contra1);
                        boveda1.guardarUsuario(plat, usuario);
                        break;
                    case 2:
                        System.out.println("Ingrese la plataforma de la que quiere conocer las credenciales");
                        plat = scanner.next();
                        try {
                            boveda1.mostrarUsuario(plat);
                            boveda1.mostrarClave(plat);
                            break;
                        }catch (Exception noHayDatos){
                            System.out.println("No hay datos ingresados");
                            break;
                        }
                    case 3:
                        ClaveExistente clave2 = new ClaveExistente();
                        String contra2 = clave2.ingresar();
                        String usuario2= clave2.generarUsuario();
                        String plat2 = clave2.generarPalabraClave();
                        boveda1.guardarClave(plat2, contra2);
                        boveda1.guardarUsuario(plat2, usuario2);
                        break;
                    case 4:
                        System.out.println("Saliendo de la bóveda de claves.");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            } while (menu != 4);
        }
    }

