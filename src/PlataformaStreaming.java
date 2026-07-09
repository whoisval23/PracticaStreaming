import java.util.ArrayList;

public class PlataformaStreaming {
    public static ArrayList<CuentaUsuario>  CuentasUsuarios = new ArrayList<>();

    public void registrarUsuarios(CuentaUsuario cuentaUsuario){
        CuentasUsuarios.add(cuentaUsuario);
    }
    public void imprimirCuenta(){
        double Total = 0;
        for (CuentaUsuario cuentaUsuario : CuentasUsuarios){
        double Costo = cuentaUsuario.obtenerTotalAPagar();
            System.out.println("Correo : " + cuentaUsuario.getCorreoElectronico());
            System.out.println("Meses activo : " + cuentaUsuario.getMesesActivo());
            System.out.println("Costo : " + Costo);
            Total = Costo + Total;
            System.out.println("Total de las cuentas : " + Total);
            System.out.println("==========================================================");
        }
    }
}
