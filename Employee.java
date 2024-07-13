package Car_Showroom;

import Car_Showroom.Main.utility;
import java.util.*;

public class Employee extends Shworoom implements utility{

    String Emp_name;
    String Emp_Id;
    int Emp_age;
    String Emp_Department;
    

        @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================*** ENTER EMPLOYEEIS DETAILS ***==================");

        System.out.println("EMPLOYEE NAME: ");
        Emp_name = sc.nextLine();

        System.out.println("EMPLOYEE ID: ");
        Emp_Id = sc.nextLine();

        System.out.println("EMPLOYEE AGE: ");
        Emp_age = sc.nextInt();

        System.out.println("EMPLOYEE DEPARTMENT: ");
        Emp_Department = sc.nextLine();

        System.out.println("SHOWROOM NAME: ");
        Shworoom_Name = sc.nextLine();
        
    }
    @Override
    public void get_details() {
        System.out.println("SHOWROOM NAME: "+Shworoom_Name);
        System.out.println("SHOWROOM ADDRESS: "+Shworoom_Address);
        System.out.println("SHOWROOM MANAGER NAME: "+Shworoom_Manager);
        System.out.println("TOTAL CARS IN ORDERD: "+Total_cars_in_order);   
        System.out.println("TOTAL EMPLOYEES WORK: "+Total_Employees);
        
    }
}
