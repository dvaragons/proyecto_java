
package cuentas;

/**
 * Clase CCuenta. Representa una cuenta bancaria.
 * Permite realizar operaciones de ingreso y retirada.
 * 
 * @author Diego
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta()
    {
    } 

    /**
     * Constructor de parámetros.
     * 
     * @param nom Nombre
     * @param cue Numero de cuenta
     * @param sal Saldo
     * @param tipo Tipo de Interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        return getNombre();
    }

    public double estado()
    {
        return getSaldo();
    }

   /**
    * Ingresa cantidad de la cuenta.
    * @param cantidad
    * @throws Exception 
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Retira cantidad de la cuenta.
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    
    
    /*
     *-------- GETTERS & SETTERS -------------
     */
    
    /**
     * @return 
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
     /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
