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

        Person Javier = new Person("Javier", "Perez Perez", "85245691Z", 1985, 'H', "España");
        Person Susana = new Person("Susana", "Alonso Alonso", "25845695X", 1977, 'M', "Canadá");

        System.err.println("----");
        Javier.printPerson();
        System.err.println("----");
        Susana.printPerson();
        
    }

   
}
