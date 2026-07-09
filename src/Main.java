import java.util.Scanner;
void main() {
    Scanner Leer = new Scanner(System.in);
    int opcion = 0;
    do {
        System.out.println("--- Plan de Streaming ---");
        System.out.println("Elije la opcion que desas realizar");
        System.out.println("1. Registrar");
        System.out.println("2. Reporte");
        System.out.println("3. Salir");
        try{
            opcion = Leer.nextInt();
        } catch (Exception e){
            System.out.println("Ingrese una opcion valida");
            Leer.nextLine();
        }
        switch (opcion){
            case 1:
                System.out.println("Ingrese su Correo Electronico : ");
                String correo = Leer.nextLine();
                System.out.println("Ingrese la cantidad de meses : ");
                int mesesActivo = Leer.nextInt();
                Leer.nextLine();
                System.out.println("Aqui termine de hacer un menu uwu");
        }
    } while (opcion != 3);
}