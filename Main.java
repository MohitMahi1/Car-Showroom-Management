package Car_Showroom;

import java.util.*;

public class Main {

    interface utility{
        public void set_details();
        public void get_details();
    }

    // It is the main menu for the Admin
    public void main_menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===================================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** =====================================");
        // int main = sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Shworoom_counter = 0;
        int Emp_counter = 0;
        int Car_counter = 0;
        
        Main main1 = new Main();
        Shworoom shworoom1 = new Shworoom();
        
        Employee Emp = new Employee();
        Car car = new Car();

        main1.main_menu();

        int main = sc.nextInt();

        // int main = sc.nextInt();

        while (main != 0){
         switch(main){
            case 1:
                shworoom1.set_details();
                Shworoom_counter++;
                System.out.println();
                System.out.println("1].ADD NEW SHOWROOM");
                System.out.println("9].GO BACK TO MAIN MENU");
                System.out.println("0].EXIT");
                main = sc.nextInt();
                

                break;

            case 2:
                Emp.set_details();
                Emp_counter++;
                System.out.println();
                System.out.println("2].ADD NEW EMPLOYEE");
                System.out.println("9].GO BACK TO MAIN MENU");
                System.out.println("0].EXIT");
                main = sc.nextInt();
                break;

                case 3:
                    car.set_details();
                    Car_counter++;
                    System.out.println();
                    System.out.println("3].ADD NEW CAR");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    main = sc.nextInt();
                    break;

                case 4:
                    System.out.println("TOTAL SHOWROOM IS AVAILABLE:" +Shworoom_counter);
                    shworoom1.get_details();
                    System.out.println(); 
                    System.out.println("1].ADD NEW SHOWROOM");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    main = sc.nextInt();
                    break;                   
                
                case 5:
                    System.out.println("TOTAL EMPLOYEES IS AVAILABLE:"+Emp_counter );
                    Emp.get_details();
                    System.out.println();
                    System.out.println("2].ADD NEW EMPLOYEE");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    main = sc.nextInt();
                    break;
                
                case 6:
                System.out.println("TOTAL CAR IS AVAILABLE:" +Car_counter);
                car.get_details();
                System.out.println();
                System.out.println("3].ADD NEW CAR");
                System.out.println("9].GO BACK TO MAIN MENU");
                System.out.println("0].EXIT");
                main = sc.nextInt();
                break;


                case 9:
                main1.main_menu();
                main = sc.nextInt();
         }
        }
    }
}
