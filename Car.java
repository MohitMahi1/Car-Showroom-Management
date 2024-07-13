package Car_Showroom;

import Car_Showroom.Main.utility;
import java.util.*;

public class Car extends Shworoom implements utility {
    String Car_Brand;
    String Car_fule_type;
    String Car_type;
    String car_color;
    int Price;
    


    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR BRAND NAME: ");
        Car_Brand = sc.nextLine();
        System.out.print(("CAR COLOR: "));
        car_color = sc.nextLine();
        System.out.print("WHAT'S THE CAR TYPE ('MICRO /  HATCHBACK / SEDAN / SUV / MPV / LUXURY / COUPE / ELECTRIC CAR')");
        Car_type = sc.nextLine();
        System.out.print("CAR PRICE: ");
        Price = sc.nextInt();
        sc.nextLine();
        System.out.print("CAR FUEL TYPE ('PETROLE / DIESEL / ELECTRIC / CNG'): ");
        Car_fule_type = sc.nextLine();
        
    }

    @Override
    public void get_details(){
        System.out.println("CAR BRAND NAME: "+Car_Brand);
        System.out.println("CAR COLOR: "+car_color);
        System.out.println("WHAT'S THE CAR TYPE ('MICRO /  HATCHBACK / SEDAN / SUV / MPV / LUXURY / COUPE / ELECTRIC CAR')"+Car_type);
        System.out.println("CAR FUEL TYPE ('PETROLE / DIESEL / ELECTRIC / CNG'): "+Car_fule_type);
        System.out.println("CAR PRICE :"+Price);
        
        
    }

    
}
