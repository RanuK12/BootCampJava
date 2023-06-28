import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BuildingBuilder builder = new BuildingBuilder();

        System.out.print("Ingrese el número de pisos: ");
        int floors = input.nextInt();
        builder.setFloors(floors);

        System.out.print("Ingrese el tamaño de la parcela: ");
        double plotSize = input.nextDouble();
        builder.setPlotSize(plotSize);

        System.out.print("Ingrese el número de habitaciones: ");
        int bedrooms = input.nextInt();
        builder.setBedrooms(bedrooms);

        Building house = builder.build();

        System.out.println(house);
    }
}

