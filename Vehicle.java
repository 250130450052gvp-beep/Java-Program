class Vehicle {
    private String Name;
    private String Brand;
    private int WheelNo;
    private String Color;

    public void setName(String Na) {
        this.Name = Na;
    }

    public void setBrand(String B) {
        this.Brand = B;
    }

    public void setWheelNo(int Wh) {
        this.WheelNo = Wh;
    }

    public void setColor(String C) {
        this.Color = C;
    }

    // ============= get method =============

    public String getName() {
        return Name;
    }

    public String getBrand() {
        return Brand;
    }

    public int getWheelNo() {
        return WheelNo;
    }

    public String getColor() {
        return Color;
    }
}
