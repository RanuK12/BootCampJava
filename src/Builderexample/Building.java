public class Building {
    private int floors;
    private double plotSize;
    private int bedrooms;
    
    public Building(int floors, double plotSize, int bedrooms) {
        this.floors = floors;
        this.plotSize = plotSize;
        this.bedrooms = bedrooms;
    }

    // Getters and setters omitted for brevity

    @Override
    public String toString() {
        return "Building{" +
                "floors=" + floors +
                ", plotSize=" + plotSize +
                ", bedrooms=" + bedrooms +
                '}';
    }
}