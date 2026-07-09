abstract class CuentaUsuario {

    private String correoElectronico;
    private int mesesActivo;
  private PlanSuscripcion planSuscripcion;

    // Constructor

    public CuentaUsuario(String correoElectronico, int mesesActivo, PlanSuscripcion planSuscripcion) {
        this.correoElectronico = correoElectronico;
        this.mesesActivo = mesesActivo;
        this.planSuscripcion = planSuscripcion;
    }
    //Metodo
    public double obtenerTotalAPagar() {
        return planSuscripcion.calcularCosto(mesesActivo);
    }
    //Getters
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public int getMesesActivo() {
        return mesesActivo;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setMesesActivo(int mesesActivo) {
        this.mesesActivo = mesesActivo;
    }

    public void setPlanSuscripcion(PlanSuscripcion planSuscripcion) {
        this.planSuscripcion = planSuscripcion;
    }
}
