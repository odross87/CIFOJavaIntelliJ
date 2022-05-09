package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        int btn;
        do {
            System.out.println("Enter a number to choose and option: /n" +
                    "1.- Create a new kind of bird. /n" +
                    "2.- Add a new view from an existing bird. /N" +
                    "3.- List all birds on data base. /n" +
                    "4.- Modify a bird. /n" +
                    "5.- Delete a kind of bird. /n" +
                    "0.- Exit.");
            btn = reader.nextInt();

            switch (btn){
                case 1:
                    create();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    System.out.println("List of birds");
                    list();
                    break;
                case 4:
                    modify();
                    break;
                case 5:
                    delete();
                    break;
                case 0:
                    System.out.println("Thank you for using our program. Bye.");
                    break;
                default:
                    System.out.println("Option not available. Write a valid one.");
                    break;
            }

        } while(btn==0);
    }

    public static void create() {
        System.out.println("Create a new kind of bird: /n" +
                "Write the name of the new bird specie.");
        String name = reader.nextLine();

        System.out.println("Write the latin name:");
        String latinName = reader.nextLine();

        System.out.println("Write the number of times you already saw:");
        int sights = reader.nextInt();

        Bird bird = new Bird(name, latinName, sights);
        BirdDB.ArrayListBirds.add(bird);
    }

    private static void add() {




    }

    private static void list() {
       for(int birdArrayIndex = 0; birdArrayIndex <= BirdDB.ArrayListBirds.size(); birdArrayIndex++){
           Bird bird =  BirdDB.ArrayListBirds.get(birdArrayIndex);
           System.out.println(birdArrayIndex + 1  +".- " + bird.getName() + " - " + bird.getNameLatin() + " - " + bird.getObservations());
        }
    }

    private static void modify() {
    }

    private static void delete() {
    }





}
