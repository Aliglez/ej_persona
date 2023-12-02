package dev.ali.ej_persona;



public class Persona {

    // Atributos

    public String nombre;
    public String apellidos;
    public String dni;
    public int añonacimiento;

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
       System.out.println("Nombre: " + nombre);
       System.out.println("Apellidos: " + apellidos);
       System.out.println("DNI: " + dni);
       System.out.println("Año de nacimiento: " + añonacimiento);
    }

}
