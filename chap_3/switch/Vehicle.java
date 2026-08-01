package ch_3_switch;

import java.util.*;
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("Please select an option:");
      
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Bus");
        System.out.println("4. Truck");
        System.out.println("5. Electric Scooter");
       
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("BIKE DETAILS");
                System.out.println("Fuel Type      : Petrol");
                System.out.println("Mileage        : 45 km/l");
                System.out.println("Top Speed      : 120 km/h");
                System.out.println("Seating        : 2 Persons");
                break;

            case 2:
                System.out.println("CAR DETAILS");
                System.out.println("Fuel Type      : Petrol / Diesel");
                System.out.println("Mileage        : 18 km/l");
                System.out.println("Top Speed      : 180 km/h");
                System.out.println("Seating        : 5 Persons");
                break;

            case 3:
                System.out.println(" BUS DETAILS");
                System.out.println("Fuel Type      : Diesel");
                System.out.println("Mileage        : 6 km/l");
                System.out.println("Top Speed      : 100 km/h");
                System.out.println("Seating        : 50 Persons");
                break;

            case 4:
                System.out.println("TRUCK DETAILS");
                System.out.println("Fuel Type      : Diesel");
                System.out.println("Mileage        : 5 km/l");
                System.out.println("Top Speed      : 90 km/h");
                System.out.println("Load Capacity  : 20 Tons");
                break;

            case 5:
                System.out.println("ELECTRIC SCOOTER DETAILS");
                System.out.println("Fuel Type      : Battery");
                System.out.println("Range          : 120 km/charge");
                System.out.println("Top Speed      : 80 km/h");
                System.out.println("Charging Time  : 4 Hours");
                break;

            

            default:
                System.out.println(" Please select valid optioon.");
        }


	}

}
