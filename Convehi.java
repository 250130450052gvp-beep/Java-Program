class Vehicle {
    private String Name;
    private String Brand;
    private int WheelNo;
    private String Color;

    Vehicle(String Name, String Brand, int WheelNo, String Color) {
        this.Name = Name;
        this.Brand = Brand;
        this.WheelNo = WheelNo;
        this.Color = Color;
    }

    public void display() {
        System.out.println("Name      : " + Name);
        System.out.println("Brand     : " + Brand);
        System.out.println("Wheel No. : " + WheelNo);
        System.out.println("Color     : " + Color);

    }
}