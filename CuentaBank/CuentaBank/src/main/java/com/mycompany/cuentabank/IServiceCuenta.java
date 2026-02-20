
package com.mycompany.cuentabank;

import java.util.List;

public interface IServiceCuenta {

    List<CuentaBank> listarCuentas();

    CuentaBank obtenerCuenta(String numeroCuenta);

    void crearCuenta(CuentaBank cuentaBank);
}