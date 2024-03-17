package module4;

// Omer Ahmer, ID 2014063

public class House {
    private int numberOfRooms;
    private double squareFootage;

    private static int totalHouses = 0;

    public House(int rooms, double sqFootage) {
        this.numberOfRooms = rooms;
        this.squareFootage = sqFootage;
        totalHouses++;
    }

    public void displayDetails() {
        System.out.println("House Details:");
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Square Footage: " + squareFootage + " square feet");
        System.out.println("Cost: " + calculateCost());
    }

    private double calculateCost() {
        return squareFootage * 600;
    }

    public static int getTotalHouses() {
        return totalHouses;
    }
    
    public static void main(String[] args) {
        House myHouse = new House(3, 2000.0);
        House oldHouse = new House(2, 900.0);
        House newHouse = new House(5, 3400.0);

        newHouse.displayDetails();

        System.out.println("Total Houses: " + House.getTotalHouses());
    }
}
