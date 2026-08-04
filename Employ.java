class Employ {
    private String Name;
    private int Salary;
    private int IdNum;
    private boolean Permenant;
    private String Gender;

    Employ(String Name, int Salary, int IdNum, boolean Permenant) {
        this.Name = Name;
        this.Salary = Salary;
        this.IdNum = IdNum;
        if (Permenant == true) {
            this.Gender = "male";
        } else {
            this.Gender = "female";
        }

        // this.Permenant = Permenant;
    }

    public void display() {
        System.out.println("Name:- " + Name);
        System.out.println("Salary:- " + Salary);
        System.out.println("IdNum:- " + IdNum);
        System.out.println("Gender:- " + Gender);
    }
}
