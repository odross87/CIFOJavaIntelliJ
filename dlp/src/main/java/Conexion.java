import java.sql.*;
import java.sql.Connection;

public class Conexion  {

    private String stringURLConnection;
    private String username;
    private String password;
    private Connection connection;

    public Conexion() throws SQLException {
        this.stringURLConnection = "jdbc:h2:tcp://localhost/../../../Users/Alumne_mati1/h2/prueba";
        this.username = "alex";
        this.password = "1234";

        this.connection = DriverManager.getConnection(stringURLConnection, username, password);
        System.out.println("Connected to DB");
        createTable();
    }

    public Connection conexionHecha(){
        return this.connection;
    }

    public void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS  rides (ID int AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), minHeight DOUBLE, park VARCHAR(50), land VARCHAR(50) )";
        System.out.println("Created table cards");

        Statement statement = connection.createStatement();
        statement.execute(sql);
        System.out.println("Created table cards");

    }



}
