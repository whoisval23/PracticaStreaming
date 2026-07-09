import java.util.Scanner;
public static void main(String[] args) {{
    Scanner Leer = new Scanner(System.in);
    PlataformaStreaming plataforma = new PlataformaStreaming();
    int opcion = 0;
    do {
        System.out.println("--- Plan de Streaming ---");
        System.out.println("Elije la opcion que desas realizar");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Mostrar reporte");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        try {
            opcion = Leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su Correo Electronico : ");
                    String correo = Leer.nextLine();
                    System.out.println("Ingrese la cantidad de meses : ");
                    int mesesActivo = Leer.nextInt();
                    Leer.nextLine();
                    PlanSuscripcion plan = null;

                    switch (opcion) {
                        case 1:
                            plan = new PlanBasico();
                            break;

                        case 2:
                            plan = new PlanEstandar();
                            break;

                        case 3:
                            plan = new PlanPremium();
                            break;

                        default:
                            System.out.println("Plan inválido.");
                            break;
                    }

                    if (plan != null) {
                        UsuarioStreaming usuario =
                                new UsuarioStreaming(correo, mesesActivo, plan);

                        plataforma.registrarUsuarios(usuario);

                        System.out.println("Usuario registrado correctamente.");
                    }

                    break;

            }
        }catch (Exception e){
            System.out.println("Ingrese una opcion valida");
            Leer.nextLine();

        }

    } while (opcion != 3);
}