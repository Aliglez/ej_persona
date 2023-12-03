package dev.ali.ej_persona;

public class Person {

    private String name;
    private String surname;
    private String nif;
    private int birthYear;
    private char gender; // H, M , O
    private String country;

    public Person(String name, String surname, String nif, int birthYear, char gender, String country) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.birthYear = birthYear;
        this.gender = gender;
        this.country = country;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNif() {
        return nif;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public char getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void printPerson() {
        System.out.println("Usuario: " + getName() + " " + getSurname() + ", " + getGender() + ", con Nif " + getNif()
                + ". Nacido en " + getBirthYear() + ", con residencia en " + getCountry());

    }

}
