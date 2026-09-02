package Test3;

import java.util.Scanner;

class View_plan
{
    private int plan_no;
    private String plan_name;
    private String days;
    private String price;

    View_plan(int plan_no, String plan_name, String days, String price)
    {
        this.plan_no = plan_no;
        this.plan_name = plan_name;
        this.days = days;
        this.price = price;
    }

    public int getplanno()
    {
        return plan_no;
    }

    public String getplanname()
    {
        return plan_name;
    }

    public String getdays()
    {
        return days;
    }

    public String getprice()
    {
        return price;
    }

    public void display()
    {
    	System.out.println("");
        System.out.println("Plan No: " + plan_no);
        System.out.println("Plan Name: " + plan_name);
        System.out.println("Validity: " + days);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class Select_plan
{
    public void selectplan(int choice)
    {
        switch(choice)
        {
        case 1:
            System.out.println("Plan 1 Selected");
            break;

        case 2:
            System.out.println("Plan 2 Selected");
            break;

        case 3:
            System.out.println("Plan 3 Selected");
            break;

        case 4:
            System.out.println("Plan 4 Selected");
            break;

        case 5:
            System.out.println("Plan 5 Selected");
            break;

        case 6:
            System.out.println("Plan 6 Selected");
            break;

        case 7:
            System.out.println("Plan 7 Selected");
            break;

        default:
            System.out.println("Invalid Plan");
        }
    }
}

public class MobileRechargeSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        View_plan plan1=new View_plan(1, "Data Plan", "28 days", "Rs 199");
        View_plan plan2=new View_plan(2, "Data Plan", "28 days", "Rs 299");
        View_plan plan3=new View_plan(3, "Unlimited Plan", "28 days", "Rs 399");
        View_plan plan4=new View_plan(4, "Unlimited Plan", "56 days", "Rs 599");
        View_plan plan5=new View_plan(5, "Data Plan", "56 days", "Rs 499");
        View_plan plan6=new View_plan(6, "Unlimited Plan", "84 days", "Rs 799");
        View_plan plan7=new View_plan(7, "Data Plan", "84 days", "Rs 699");

        View_plan selectedplan = null;

        int choice;

        do
        {
            System.out.println("Welcome to Mobile Recharge System");
            System.out.println("");
            System.out.println("1. View Plans");
            System.out.println("2. Select Plan");
            System.out.println("3. Recharge Summary");
            System.out.println("4. Exit");
            System.out.println("");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println("");
            
            switch(choice)
            {
            case 1:
                plan1.display();
                plan2.display();
                plan3.display();
                plan4.display();
                plan5.display();
                plan6.display();
                plan7.display();
                break;

            case 2:
            	System.out.println("");
                System.out.print("Enter Plan Number: ");
                int planchoice = sc.nextInt();

                switch(planchoice)
                {
                case 1:
                    selectedplan = plan1;
                    break;

                case 2:
                    selectedplan = plan2;
                    break;

                case 3:
                    selectedplan = plan3;
                    break;

                case 4:
                    selectedplan = plan4;
                    break;

                case 5:
                    selectedplan = plan5;
                    break;

                case 6:
                    selectedplan = plan6;
                    break;

                case 7:
                    selectedplan = plan7;
                    break;

                default:
                    System.out.println("Invalid Plan");
                }

                if(selectedplan != null)
                {
                    System.out.println("Plan Selected Successfully!");
                }
                break;

            case 3:
                if(selectedplan != null)
                {
                	System.out.println("");
                    System.out.println("RECHARGE SUMMARY");
                    System.out.println("Plan No: " + selectedplan.getplanno());
                    System.out.println("Plan Name: " + selectedplan.getplanname());
                    System.out.println("Validity: " + selectedplan.getdays());
                    System.out.println("Price: " + selectedplan.getprice());
                }
                else
                {
                    System.out.println("Please select a plan.");
                }
                break;

            case 4:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice");
            }

        } while(choice != 4);

        sc.close();
    }
}