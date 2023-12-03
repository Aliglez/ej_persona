package dev.ali.ej_persona;


public class Persona {

    // Atributos

    private String nombre;
    private String apellidos;
    private String dni;
    private int añonacimiento;

    // constructor

    public Persona(String nombre, String apellidos, String dni, int añonacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.añonacimiento = añonacimiento;
       
    }

    // getters y setterns

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public int getAñonacimiento() {
        return añonacimiento;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public void setAñonacimiento(int añonacimiento){
        this.añonacimiento = añonacimiento;
    }

    //methods and accions

    public void printPersona(){
       System.out.println("Nombre: " + getNombre());
       System.out.println("Apellidos: " + getApellidos());
       System.out.println("DNI: " + getDni());
       System.out.println("Año de nacimiento: " + getAñonacimiento());
    }

}
