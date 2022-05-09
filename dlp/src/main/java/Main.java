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
            System.out.println("0.- Exit");

            btn = Integer.valueOf(scan.nextInt());

            if (btn == 0){
                break;
            } else if (btn == 1){
                createNewRide(scan,conexion);
            } else if (btn == 2){
                listAllRides(conexion);
            } else {
                System.out.println("Invalid Command");
            }
        }

    }

    private static void listAllRides(Conexion conexion) throws SQLException {
        String sql = "SELECT * FROM rides";
        Statement statement = conexion.conexionHecha().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;
        while (resultSet.next()) {
            count++;
            int ID = resultSet.getInt("ID");
            String name = resultSet.getString("name");
            String type = resultSet.getString("type");
            double maxHeight = resultSet.getDouble("maxHeight");
            String park = resultSet.getString("park");
            String land = resultSet.getString("land");


            System.out.println("users #" + count + ": " + ID + ", " + name + " "  + type + ", " + maxHeight + ", " + park + ", " + land + ".");
        }


    }

    public static void createNewRide(Scanner scan, Conexion conexion) throws Exception {
        System.out.println("**** Create a new ride ****");
        System.out.println("Enter the name");
        String name = scan.nextLine();
        System.out.println("Enter type");
        String type = scan.nextLine();;
        System.out.println("Enter maximum height");
        Double maxHeight = scan.nextDouble();
        System.out.println("Which park is located?");
        String park = scan.nextLine();
        System.out.println("Which land?");
        String land = scan.nextLine();

        Rides ride = new Rides(name,type,maxHeight,park,land);
        addNewRide(ride, conexion);

    }

    public static void addNewRide(Rides ride, Conexion conexion) throws Exception{
        String sql = "INSERT INTO rides (name, type, maxHeight, park, land) VALUES ('"+ride.getName()+"', '"+ride.getType()+"', "+ride.getMaxHeight()+ ",'"+ride.getPark()+"', '"+ride.getLand()+"' )";
        Statement statement = conexion.conexionHecha().createStatement();
        int result = statement.executeUpdate(sql);
        System.out.println("Operation write to DB: " +  result);
    }

}
