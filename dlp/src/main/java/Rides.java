public class Rides {

    private String name;
    private String type;
    private double maxHeight;
    private String park;
    private String land;

    public Rides(String name, String type, double maxHeight, String park, String land) {
        this.name = name;
        this.type = type;
        this.maxHeight = maxHeight;
        this.park = park;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }



}
