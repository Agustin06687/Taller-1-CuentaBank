
package com.mycompany.cuentabank;

    public class Cuenta_Corriente extends CuentaBank {
    private double impuesto;

    public Cuenta_Corriente() {}

    public Cuenta_Corriente(String numeroCuenta, long dniCliente, double saldoActual, double impuesto) {
        super(numeroCuenta, dniCliente, saldoActual);
        this.impuesto = impuesto;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public String toString() {
        return "Cuenta Corriente {" +
                "numeroCuenta='" + getNumeroCuenta() + '\'' +
                ", dniCliente=" + getDniCliente() +
                ", saldoActual=" + getSaldoActual() +
                ", impuesto=" + impuesto +
                '}';
    }
}


