abstract class CuentaUsuario {

    private String correoElectronico;
    private int mesesActivo;
    PlanSuscripcion planSuscripcion;

    // Constructor

    public CuentaUsuario(String correoElectronico, int mesesActivo, PlanSuscripcion planSuscripcion) {
        this.correoElectronico = correoElectronico;
        this.mesesActivo = mesesActivo;
        this.planSuscripcion = planSuscripcion;
    }

    public double obtenerTotalAPagar() {
        return planSuscripcion.calcularCosto(mesesActivo);
    }
}
