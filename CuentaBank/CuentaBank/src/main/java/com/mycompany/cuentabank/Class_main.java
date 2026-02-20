
package com.mycompany.cuentabank;

import java.util.Scanner;

public class Class_main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Service_Cuenta service = new Service_Cuenta();
            int opcion;
            
            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Listar cuentas Ahorro");
                System.out.println("2. Listar cuentas Corriente");
                System.out.println("3. Crear cuenta Ahorro");
                System.out.println("4. Crear cuenta Corriente");
                System.out.println("5. Obtener cuenta por numero");
                System.out.println("0. Salir");
                System.out.print("Seleccione: ");
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch (opcion) {
                    case 1 -> {
                        for (CuentaBank c : service.listarCuentas()) {
                            if (c instanceof Cuenta_Ahorro) {
                                System.out.println(c);
                            }
                        }
                    }
                    
                    case 2 -> {
                        for (CuentaBank c : service.listarCuentas()) {
                            if (c instanceof Cuenta_Corriente) {
                                System.out.println(c);
                            }
                        }
                    }
                    
                    case 3 -> {
                        System.out.print("Numero cuenta: ");
                        String numA = sc.nextLine();
                        System.out.print("Cedula: ");
                        long dniA = sc.nextLong();
                        System.out.print("Saldo: ");
                        double saldoA = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Fecha creación: ");
                        String fecha = sc.nextLine();
                        
                        service.crearCuenta(new Cuenta_Ahorro(numA, dniA, saldoA, fecha));
                        System.out.println("Cuenta Ahorro creada.");
                    }
                    
                    case 4 -> {
                        System.out.print("Número cuenta: ");
                        String numC = sc.nextLine();
                        System.out.print("Cedula: ");
                        long dniC = sc.nextLong();
                        System.out.print("Saldo: ");
                        double saldoC = sc.nextDouble();
                        System.out.print("Impuesto: ");
                        double imp = sc.nextDouble();
                        
                        service.crearCuenta(new Cuenta_Corriente(numC, dniC, saldoC, imp));
                        System.out.println("Cuenta Corriente creada.");
                    }
                    
                    case 5 -> {
                        System.out.print("Numero cuenta a buscar: ");
                        String buscar = sc.nextLine();
                        CuentaBank cuenta = service.obtenerCuenta(buscar);
                        
                        if (cuenta != null) {
                            System.out.println(cuenta);
                        } else {
                            System.out.println("Cuenta no encontrada.");
                        }
                    }
                }
                
            } while (opcion != 0);
        }
    }
}


