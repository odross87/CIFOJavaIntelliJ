package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

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
                    list();
                    break;
                case 4:
                    modify();
                    break;
                case 5:
                    delete();
                    break;
                default:
                    break;
            }

        } while(btn==0);
    }

    private static void create() {
    }

    private static void add() {
    }

    private static void list() {
    }

    private static void modify() {
    }

    private static void delete() {
    }





}
