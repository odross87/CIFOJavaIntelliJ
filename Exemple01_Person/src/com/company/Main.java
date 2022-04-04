package com.company;

public class Main {

    public static void main(String[] args) {
        hello();
        //I dont know the value of the fields of this person david
        Person david = new Person();

        Person alex = new Person("Alex", "Lopez", 28    , true);

        System.out.println("Person: " + david);

        alex.sayHello();

        alex.printName();

        System.out.println("Alex age to drive: " + alex.idAdult());

        System.out.println("David age to drive: " + david.idAdult());

        david.printName();

        hello();

        david.setName("David");
        david.setSurname ("Web");
        david.setAge(25);
        david.setVegan(true);

        Car carAlex = new Car("Peugeot", "308", 125, false);
        Dog dogAlex = new Dog("Bruno", 7, "Brown");

        alex.setCar(carAlex);
        alex.setDog(dogAlex);

        Car carDavid = new Car("Mercedes", "Clase A", 180, false);
        Dog dogDavid = new Dog("Lando", 9, "Black");

        david.setCar(carDavid);
        david.setDog(dogDavid);


         Person[] arrayPerson = {david, alex};

        for (Person i : arrayPerson
             ) {
            System.out.println("La persona " + i.getName() + " " + i.getSurname() + " te "+ i.getAge() +
                    " anys. El seu gos es diu " + i.getDog().getName()  + " y el seu cotxe es un " + i.getCar().getBrand() +
                    " " + i.getCar().getModel() + ".");
        }



    }

    public static void hello (){

        System.out.println("Hello I am a static method");
    }
}
