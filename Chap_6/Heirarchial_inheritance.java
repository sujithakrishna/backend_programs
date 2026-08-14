package Ch_6;

import java.util.Scanner;

class Vehicle
{
    int veh_no;

    void display()
    {
        System.out.println("Vehicle number: " + veh_no);
    }
}

class Car extends Vehicle
{
    String veh_type;
    String fuel;

    void car_disp()
    {
    	System.out.println("");
        System.out.println("Car Details");
        System.out.println("Vehicle type: " + veh_type);
        System.out.println("Fuel type: " + fuel);
    }
}

class Bike extends Vehicle
{
    String veh_type;
    String fuel;

    Bike()
    {
        
    }

    Bike(String veh_type, String fuel)
    {
        this.veh_type = veh_type;
        this.fuel = fuel;
    }

    void bike_disp()
    {
    	System.out.println(" ");
    	System.out.println("Bike Details");
        System.out.println("Vehicle Type: " + veh_type);
        System.out.println("Fuel type: " + fuel);
    }
}

public class Heirarchial_inheritance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the vehicle number: ");
        int veh_no = sc.nextInt();
        sc.nextLine();

        // Car details
        System.out.println("Enter car vehicle type: ");
        String car_type = sc.nextLine();

        System.out.println("Enter car fuel type: ");
        String car_fuel = sc.nextLine();

        // Bike details
        System.out.println("Enter bike vehicle type: ");
        String bike_type = sc.nextLine();

        System.out.println("Enter bike fuel type: ");
        String bike_fuel = sc.nextLine();

      
        Car c = new Car();
        c.veh_no = veh_no;
        c.veh_type = car_type;
        c.fuel = car_fuel;
        c.display();
        c.car_disp();

      
        Bike b = new Bike(bike_type, bike_fuel);
        b.veh_no = veh_no;       
        b.display();
        b.bike_disp();

   
    }
}