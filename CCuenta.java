/*
 * @version 2021-2022
 * @author DAM
 */



public class CCuenta {


    
    /** 
     * @return String get cuenta()
     */
    public String getCuenta() {
        return cuenta;
    }

    
    /** 
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    
    /** 
     * @return double getsaldo()
     */
    public double getSaldo() {
        return saldo;
    }

    
    /** 
     * @param saldo setsaldo()
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    
    /** 
     * @param nom setnombre(nom)
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    
    /** 
     * @return String obtenerNombre()
     */
    public String obtenerNombre()
    {
        return getNombre();
    }


    
    /** 
     * @return double estado()
     */
    public double estado()
    {
        return saldo;
    }


    
    /** 
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    
    /** 
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }


    
    /** 
     * @return String obtenerCuenta()
     */
    public String obtenerCuenta()
    {
        return cuenta;
    }


    
    /** 
     * @return String getNombre
     */
    public String getNombre() {
        return nombre;
    }


    
    /** 
     * @param nombre setNombre(String NOmbre)
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    /** 
     * @return double getTipoInteres()
     */
    public double getTipoInteres() {
        return tipoInteres;
    }


    
    /** 
     * @param tipoInteres setTipoInteres(double tipoInteres)
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
