import java.util.HashMap;

public class BirdDatabase {

    private String databaseName;
    private HashMap<String,Bird> database;


    public BirdDatabase(String databaseName) {
        this.databaseName = databaseName;
        this.database = new HashMap();
    }

    @Override
    public String toString() {
        return "BirdDatabase{" +
                "birdsDatabase=" + database +
                '}';
    }

    public HashMap<String, Bird> getBirdsDatabase() {
        return database;
    }

    public void setBirdsDatabase(HashMap<String, Bird> birdsDatabase) {
        this.database = birdsDatabase;
    }

    public void addBirdToDatabase(Bird bird) {

        this.database.put(bird.getName(), bird);
    }


}
