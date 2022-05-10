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

    private static void updateARide(Scanner scan, Conexion conexion) {
        int id;
        System.out.println("**** Update an existing ride ****");
        System.out.println("Enter the ID of the ride");
        id = Integer.valueOf(scan.nextLine());

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
