import java.sql.*;
import java.util.Scanner;

public class Main {



    public static void main (String [ ] args) throws Exception {

        Conexion conexion = new Conexion();
        Scanner scan = new Scanner(System.in);
        int btn;

        while(true){

            System.out.println("Choose and option");
            System.out.println("1.- Create a new ride");
            System.out.println("2.- List all rides");
            System.out.println("3.- Update a ride");
            System.out.println("0.- Exit");

            btn = scan.nextInt();

            if (btn == 0){
                break;
            } else if (btn == 1){
                createNewRide(scan,conexion);
            } else if (btn == 2) {
                listAllRides(conexion);
            } else if (btn == 3){
                updateARide(scan, conexion);
            } else {
                System.out.println("Invalid Command");
            }
        }

    }

    private static void updateARide(Scanner scan, Conexion conexion) throws SQLException {
        int btn;
        int id;
        String column;
        String newValue;
        System.out.println("**** Update an existing ride ****");
        System.out.println("Enter the ID of the ride");
        String fake =scan.nextLine();
        id = Integer.valueOf(scan.nextLine());

        Rides ride = findRide(id, conexion);
        System.out.println(ride.toString());

        System.out.println("Which field do you want to update?");
        System.out.println("1.- Name");
        System.out.println("2.- Height");
        System.out.println("3.- Park");
        System.out.println("4.- Land");
        System.out.println("0.- Cancel");

        btn = Integer.valueOf(scan.nextLine());
        btn = Integer.valueOf(scan.nextLine());

        while (true) {


            if (btn == 0) {
                break;
            } else if (btn == 1) {
                column = "name";
                System.out.println("Write a new name");
                newValue = scan.nextLine();

            } else if (btn == 2) {
                column = "minHeight";
                System.out.println("Write a height");
                newValue = scan.nextLine();
            } else if (btn == 3) {
                column = "park";
                System.out.println("Write a new park name");
                newValue = scan.nextLine();

            } else if (btn == 4) {
                column = "land";
                System.out.println("Write a new land name");
                newValue = scan.nextLine();
            } else {
                System.out.println("Canceling");
                break;
            }

            String sql = "UPDATE rides SET "+ column +" = '" + newValue + "' WHERE ID=" + id;
            Statement statement = conexion.conexionHecha().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
        }



    }

    public static Rides findRide(int id,Conexion conexion) throws SQLException {
        String sql = "SELECT * FROM RIDES WHERE ID=4";
        Statement statement = conexion.conexionHecha().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        Rides ride = new Rides(resultSet.getNString("name"), resultSet.getDouble("minHeight"), resultSet.getNString("park"), resultSet.getNString("land"));

        return ride;
    }

    private static void listAllRides(Conexion conexion) throws SQLException {
        String sql = "SELECT * FROM rides";
        Statement statement = conexion.conexionHecha().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int ID = resultSet.getInt("ID");
            String name = resultSet.getString("name");
            double maxHeight = resultSet.getDouble("minHeight");
            String park = resultSet.getString("park");
            String land = resultSet.getString("land");


            System.out.println("Ride #" + ID + " - Name: " + name + " - Minimum Height " + maxHeight + " - " + park + ", " + land + ".");
        }


    }

    public static void createNewRide(Scanner scan, Conexion conexion) throws Exception {
        String name, park, land;
        double minHeight;
        System.out.println("**** Create a new ride **** \nEnter the name of the new ride");
        name = scan.nextLine();
        name = scan.nextLine();
        System.out.println("How long is the minimum height?");
        minHeight = Double.valueOf(scan.nextLine());
        System.out.println("In which park is located?");
        park = scan.nextLine();
        System.out.println("In which land?");
        land = scan.nextLine();

        Rides ride = new Rides(name, minHeight, park,land);
        addNewRide(ride, conexion);

    }

    public static void addNewRide(Rides ride, Conexion conexion) throws Exception{
        String sql = "INSERT INTO rides (name, minHeight, park, land) VALUES ('"+ride.getName()+"', "+ride.getMinHeight()+ ",'"+ride.getPark()+"', '"+ride.getLand()+"' )";
        Statement statement = conexion.conexionHecha().createStatement();
        int result = statement.executeUpdate(sql);
        System.out.println("Operation write to DB: " +  result);
    }



}
