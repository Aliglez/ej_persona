package dev.ali.ej_persona;



public final class App {
    private App() {
    }

   
    public static void main(String[] args) {

        Persona Maria = new Persona("Maria", "Gomez Gomez", "12345678A", 2012);
        Persona Jose = new Persona("Jose", "López López", "98765432B", 1999);

        Maria.printPersona();
        System.err.println("----");
        Jose.printPersona();
    }

   
}
