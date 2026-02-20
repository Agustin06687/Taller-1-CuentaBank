
package com.mycompany.cuentabank;

import java.util.ArrayList;
import java.util.List;

public class Service_Cuenta implements IServiceCuenta {

    private final List<CuentaBank> cuentas = new ArrayList<>();

    @Override
    public List<CuentaBank> listarCuentas() {
        return cuentas;
    }
    @Override
    public CuentaBank obtenerCuenta(String numeroCuenta) {
        for (CuentaBank c : cuentas) {
            if (c.getNumeroCuenta().equals(numeroCuenta)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void crearCuenta(CuentaBank cuentaBank) {
        cuentas.add(cuentaBank);
    }
}