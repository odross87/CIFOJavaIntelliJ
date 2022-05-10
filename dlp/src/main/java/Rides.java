public class Rides {

    private String name;
    private double minHeight;
    private String park;
    private String land;

    public Rides(String name, Double minHeight, String park, String land) {
        this.name = name;
        this.minHeight = minHeight;
        this.park = park;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(double maxHeight) {
        this.minHeight = maxHeight;
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
