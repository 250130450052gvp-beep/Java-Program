public class VehicleMain {
    public static void main(String[] args) {

        Vehicle Thar, Fortuner;
        Thar = new Vehicle();
        Fortuner = new Vehicle();

        Thar.setName("Thar");
        Thar.setBrand("Mahindra");
        Thar.setWheelNo(4);
        Thar.setColor("Black");

        Fortuner.setName("Fortuner");
        Fortuner.setBrand("Toyota");
        Fortuner.setWheelNo(4);
        Fortuner.setColor("White");

        System.out.println("FIRST CAR INFO");

        String Name;
        Name = Thar.getName();
        System.out.println(Name);

        String Brand;
        Brand = Thar.getBrand();
        System.out.println(Brand);

        int WheelNo;
        WheelNo = Thar.getWheelNo();
        System.out.println(WheelNo);

        String Color;
        Color = Thar.getColor();
        System.out.println(Color);

        System.out.println("--------SECOND CAR INFO--------");

        String Name2;
        Name2 = Fortuner.getName();
        System.out.println(Name2);

        String Brand2;
        Brand2 = Fortuner.getBrand();
        System.out.println(Brand2);

        int WheelNo2;
        WheelNo2 = Fortuner.getWheelNo();
        System.out.println(WheelNo2);

        String Color2;
        Color2 = Fortuner.getColor();
        System.out.println(Color2);
    }
}
