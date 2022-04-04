package com.company;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean vegan;
    private Car car;
    private Dog dog;

    //First Constructor
    public Person(String name, String surname, int age, boolean vegan) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.vegan = vegan;

    }
    //Second Constructor
    public Person() {
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isVegan() {
        return vegan;
    }

    public Car getCar() {
        return car;
    }

    public Dog getDog() {
        return dog;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    //methods non-static
    public boolean idAdult (){

        boolean isAdult = false;
        if ( this.age > 18 ) isAdult = true;

        return isAdult;
    }

    public String sayHello(){

        return "Hello";
    }

    public String sayHelloPerson(){

        return "Hello " + this.name;
    }

    public void printName () {

        System.out.println("This person 's name is: " + " "  + this.name  + " "  + this.surname);

        Main.hello();
    }

}