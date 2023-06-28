public class BuildingBuilder {
    private int floors;
    private double plotSize;
    private int bedrooms;

    public BuildingBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public BuildingBuilder setPlotSize(double plotSize) {
        this.plotSize = plotSize;
        return this;
    }

    public BuildingBuilder setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
        return this;
    }

    public Building build() {
        return new Building(floors, plotSize, bedrooms);
    }
}