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
                System.out.println("2. Ingresar contraseña propia");
                System.out.println("3. Ver contraseñas");
                System.out.println("4. Editar contraseña");
                System.out.println("5. Salir");

                menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        Generador clave1 = new Generador();
                        String contra1 = clave1.ingresar();
                        int menu2=0;
                            System.out.println("1. Guardar contraseña");
                            System.out.println("2.Salir");
                            menu2 = scanner.nextInt();
                            if (menu2==1){
                                String usuario = clave1.generarUsuario();
                                String plat = clave1.generarPalabraClave();
                                boveda1.guardarClave(plat, contra1);
                                boveda1.guardarUsuario(plat, usuario);
                                break;

                            } else if (menu2==2) {
                                break;
                            }
                            else {
                                System.out.println("Numero inválido");
                                break;
                            }
                    case 3:
                        System.out.println("Ingrese la plataforma de la que quiere conocer las credenciales");
                        String plat = scanner.next();
                        try {
                            boveda1.mostrarUsuario(plat);
                            boveda1.mostrarClave(plat);
                            /*System.out.println("1.Editar contraseña");
                            System.out.println("2. Editar usuario");
                            System.out.println("3.Salir");
                            int b =scanner.nextInt();

                            switch (b){
                                case 1:
                                    boveda1.cambiarClave(plat);
                                    break;
                                case 2:
                                    boveda1.cambiarUsuario(plat);
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Opción inválida");
                                    break;
                            }*/
                            break;
                        }catch (Exception noHayDatos){
                            System.out.println("No hay datos ingresados");
                            break;
                        }
                    case 2:
                        ClaveExistente clave2 = new ClaveExistente();
                        String contra2 = clave2.ingresar();
                        String usuario2= clave2.generarUsuario();
                        String plat2 = clave2.generarPalabraClave();
                        boveda1.guardarClave(plat2, contra2);
                        boveda1.guardarUsuario(plat2, usuario2);
                        break;
                    case 5:
                        System.out.println("Saliendo de la bóveda de claves.");
                        break;
                    case 4:
                        System.out.println("Ingrese la plataforma de la que quiere cambair las credenciales");
                        String plat3 = scanner.next();
                        ClaveExistente clave3 = new ClaveExistente();
                        String contra3 = clave3.ingresar();
                        String usuario3= clave3.generarUsuario();
                        boveda1.guardarClave(plat3, contra3);
                        boveda1.guardarUsuario(plat3, usuario3);
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            } while (menu != 4);
        }
    }

