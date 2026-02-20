
package com.mycompany.cuentabank;

 public class Cuenta_Ahorro extends CuentaBank {
    private String fechaCreacion;

    public Cuenta_Ahorro() {}

    public Cuenta_Ahorro(String numeroCuenta, long Cedula, double saldoActual, String fechaCreacion) {
        super(numeroCuenta, Cedula, saldoActual);
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Cuenta Ahorro {" +
                "numeroCuenta='" + getNumeroCuenta() + '\'' +
                ", Cedula=" + getDniCliente() +
                ", saldoActual=" + getSaldoActual() +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                '}';
    }
}

    

