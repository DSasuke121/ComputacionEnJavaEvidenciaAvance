package entidades;

import java.io.Serializable;

public class Paciente implements Serializable {
    private String numcuenta, nombre, apellidoPaterno, apellidoMaterno;
    private int edad;

    public Paciente(){
        System.out.println("Se mandó llamar el constructor");
    }
    public Paciente(String n){
        this.nombre = n;
    }

    public String getCuenta() {
        return numcuenta;
    }

    public void setCuenta(String cuenta) {
        this.numcuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPaterno;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPaterno = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMaterno;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMaterno = apellidoMat;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}