public class VehicleMain {
    public static void main(String[] args) {

        Vehicle Thar = new Vehicle("Thar", "Mahindra", 4, "Black");
        Vehicle Fortuner = new Vehicle("Fortuner", "Toyota", 4, "White");

        System.out.println("-------- FIRST CAR INFO --------");
        Thar.display();

        System.out.println();

        System.out.println("-------- SECOND CAR INFO --------");
        Fortuner.display();
    }
}