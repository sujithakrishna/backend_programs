package ch_3_switch;
import java.util.*;

public class Season_finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
	        System.out.println("Enter month number: ");
	        System.out.println("1. January.");
	        System.out.println("2. February.");
	        System.out.println("3. March.");
	        System.out.println("4. April.");
	        System.out.println("5. May.");
	        System.out.println("6. June.");
	        System.out.println("7. July.");
	        System.out.println("8. Auguest.");
	        System.out.println("9. September.");
	        System.out.println("10. October.");
	        System.out.println("11. November.");
	        System.out.println("12. December.");
	        int month = sc.nextInt();
	        

	        String season;
	        switch (month) {
	            case 12:
	            case 1:
	            case 2:
	                season = "Winter";
	                break;
	            case 3:
	            case 4:
	            case 5:
	                season = "Summer";
	                break;
	            case 6:
	            case 7:
	            case 8:
	                season = "Rainy";
	                break;
	            case 9:
	            case 10:
	            case 11:
	                season = "Autumn";
	                break;
	            default:
	                season = "Invalid month number";
	        }

	        System.out.println("Season: " + season);

	}

}
