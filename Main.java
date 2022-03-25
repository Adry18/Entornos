/*
 * @version 2021-2022
 * @author DAM
 */



public class Main {

    
    /** 
     * @param args 
     * float cantidad
     * Ccuenta miCuenta
     * double saldoActual
     */
    public static void main(String[] args) {
        operativa_cuenta();
    }
    public static void operativa_cuenta() {
        
        float cantidad;
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        CCuenta cuenta1 = miCuenta;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}


