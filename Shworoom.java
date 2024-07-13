package Car_Showroom;

import java.util.*;

import Car_Showroom.Main.utility;

public class Shworoom implements utility {
    String Shworoom_Name;
    String Shworoom_Address;
    String Shworoom_Manager;
    int Total_cars_in_order;
    int Total_Employees;
    


    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================*** ENTER SHOWROOM DETAILS ***==================");

        System.out.println("SHOWROOM NAME: ");
        Shworoom_Name = sc.nextLine();

        System.out.println("SHOWROOM ADDRESS: ");
        Shworoom_Address = sc.nextLine();

        System.out.println("SHOWROOM MANAGER NAME: ");
        Shworoom_Manager = sc.nextLine();

        System.out.println("TOTAL CARS IN ORDERD: ");
        Total_cars_in_order = sc.nextInt();

        System.out.println("TOTAL EMPLOYEES WORK: ");
        Total_Employees = sc.nextInt();

        

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

