import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase("MyBirdDatabase");

        Bird bird1 = new Bird("Martinet", "Martinus Martinus");
        Bird bird2 = new Bird("Colom", "Palominus Palominus");
        Bird bird3 = new Bird("Gavina", "Gavius Gavius");
        db.addBirdToDatabase(bird1);
        db.addBirdToDatabase(bird2);
        db.addBirdToDatabase(bird3);

        while (true) {
            String command = ask(scanner, "Option?");
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scanner,db);
            } else if (command.equals("Observation")) {
                observation(scanner,db);
            } else if (command.equals("Show")) {
                show(scanner,db);
            } else if (command.equals("Statistics")) {
                statistics(db);
            } else {
                System.out.println("Unknown command!");
            }
        }
    }

    public static String ask(Scanner input, String option) {
        System.out.println(option);
        String data = input.nextLine();
        return data;
    }

    public static void add(Scanner input, BirdDatabase db) {
        String birdName = ask(input, "Give bird's name: ");
        String birdNameLatin = ask(input, "Give bird's Latin name: ");
        Bird bird = new Bird(birdName, birdNameLatin);
        db.addBirdToDatabase(bird);
        System.out.println("New bird added to database: " + bird.toString());
    }

    public static void observation(Scanner input, BirdDatabase db) {
        String birdName = ask(input, "Give seen bird's name: ");
        Bird bird = db.getBirdsDatabase().get(birdName);
        bird.addObservation();
        System.out.println("Current observations for " + birdName + " are " + bird.getObservations());
    }

    public static void show(Scanner input, BirdDatabase db) {
        String birdname = ask(input, "Give bird's name to show: ");
        Bird bird = db.getBirdsDatabase().get(birdname);
        System.out.println(bird.toString());
    }

    public static void statistics(BirdDatabase db) {
        /*String birdName = ask(input, "Give bird's name to display observations count: ");
        Bird bird = db.getBirdsDatabase().get(birdName);
        System.out.println("Current observations for " + birdName + " are " + bird.getObservations());*/
        System.out.println(db);
    }

}
