import java.util.Scanner;

public class EmployM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        int salary = sc.nextInt();

        sc.nextLine();

        System.out.print("Employee Gender? (true/false): ");
        boolean isPermanent = sc.nextBoolean();

        Employ emp = new Employ(name, id, salary, isPermanent);

        emp.display();

        sc.close();
    }
}