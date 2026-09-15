package Login_authentication;

import java.util.Scanner;


class InvalidUserException extends Exception {

    public InvalidUserException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String message) {
        super(message);
    }
}

class WeakPasswordException extends Exception {

    public WeakPasswordException(String message) {
        super(message);
    }
}


class AccountBlockedException extends Exception {

    public AccountBlockedException(String message) {
        super(message);
    }
}


interface LoginOperations {

    void login(String username, String password)  throws InvalidUserException,InvalidPasswordException,WeakPasswordException,AccountBlockedException;
    void logout();
    void displayDashboard();
}


class User 
{
    private int userId;
    private String username;
    private String password;
    private String email;
    protected boolean loggedIn;
    protected int loginAttempts;

    public User(int userId,String username,String password,String email) 
    {
        this.userId=userId;
        this.username=username;
        this.password=password;
        this.email=email;
        this.loggedIn=false;
        this.loginAttempts=0;
    }

    public int getUserId() {
        return userId;
    }


    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {

        this.email=email;
    }

    public void setPassword(String password) throws WeakPasswordException 
    {
        if (password==null) {

            throw new WeakPasswordException("Password cannot be null.");
        }
        if (password.length() < 8) {

            throw new WeakPasswordException("Password must contain at least 8 characters.");
        }

        this.password=password;
    }

    public void displayUser() {
    	System.out.println("");
        System.out.println("User details:");
        System.out.println("User ID: "+userId);
        System.out.println("Username: "+username);
        System.out.println("Email: "+email);
    }
    public void displayUser(boolean showPassword)
    {
        displayUser();
        if (showPassword == true) 
        {
           System.out.println("Password : " + password);
        }
    }
}

class Admin extends User
{
    private String department;

    public Admin(int userId,String username,String password,String email,String department)
    {

        super(userId,username,password,email);
        this.department=department;
    }

    public void adminDetails() 
    {

    	System.out.println("");
        System.out.println("Role:ADMIN");
        System.out.println("Department: " +department);
    }
    public void adminAccess() 
    {

    	System.out.println("");
        System.out.println("\nAdmin Access Granted");
        System.out.println("You can manage users.");
    }
}

class Customer extends User 
{

    private String city;
    private double accountBalance;

    public Customer(int userId,String username,String password,String email,String city,double accountBalance) 
    {

        super(userId,username,password,email);
        this.city=city;
        this.accountBalance=accountBalance;
    }

    public void customerDetails() {

    	System.out.println("");
        System.out.println("Role: CUSTOMER");
        System.out.println("City: "+city);
    }

    public void customerAccess() 
    {
    	System.out.println("");
        System.out.println("\nCustomer Access Granted");
        System.out.println("Welcome to your account.");
    }


    public void displayBalance() 
    {

        System.out.println("Account Balance : ₹"+ accountBalance);
    }
}



class AuthenticationSystem implements LoginOperations 
{
    private User[] users;
    private int userCount;
    private User currentUser;

    public AuthenticationSystem(int size)
    {
        users = new User[size];
        userCount = 0;
        currentUser = null;
    }

    public void addUser(User user) 
    {
        if (userCount<users.length)
        {
            users[userCount] = user;
            userCount++;
            System.out.println("User added successfully.");

        } 
        else 
        {

            System.out.println("User storage is full.");
        }
    }


    private User findUser(String username) throws InvalidUserException
    {
        for(int i=0;i<userCount;i++) 
        {
            if(users[i].getUsername().equals(username))
            {
                return users[i];
            }
        }

        throw new InvalidUserException("Username does not exist.");
    }

    public void login(String username,String password) throws InvalidUserException,InvalidPasswordException,WeakPasswordException,AccountBlockedException 
    {
        if (username==null || password==null) 
        {

            throw new NullPointerException("Username or password cannot be null.");
        }


        if (username.trim().equals("") || password.trim().equals("")) 
        {

            throw new NullPointerException("Username or password cannot be empty.");
        }

        if (password.length()<8) 
        {
            throw new WeakPasswordException("Password is too short. Minimum 8 characters required.");
        }

        User user = findUser(username);


        if(user.loginAttempts>=3) 
        {
            throw new AccountBlockedException("Account is blocked after 3 failed attempts.");
        }

        if (!user.getPassword().equals(password))
        {

            user.loginAttempts++;
            if (user.loginAttempts >= 3) 
            {
                throw new AccountBlockedException("Account blocked. Maximum login attempts exceeded.");
            }


            throw new InvalidPasswordException( "Incorrect password. Attempt "+ user.loginAttempts+ " of 3.");
        }


        user.loggedIn=true;
        user.loginAttempts=0;
        currentUser = user;
  
        System.out.println("");
        System.out.println("LOGIN SUCCESSFUL");
        System.out.println("Welcome "+ user.getUsername());
    }


    public void logout() 
    {
        if (currentUser!=null) 
        {
            currentUser.loggedIn=false;
            System.out.println("logged out successfully.");
            currentUser = null;
        }
        else
        {
            System.out.println("No user is currently logged in.");
        }
    }

    public void displayDashboard() {

        if (currentUser==null) 
        {
            System.out.println("Please login first.");
            return;
        }
        
        System.out.println("DASHBOARD");
        currentUser.displayUser();
        if (currentUser instanceof Admin) 
        {
            Admin admin=(Admin)currentUser;
            admin.adminDetails();
            admin.adminAccess();
        }


        else if (currentUser instanceof Customer)
        {

            Customer customer =(Customer) currentUser;
            customer.customerDetails();
            customer.customerAccess();
            customer.displayBalance();
        }
    }

    public void displayAllUsers() 
    {

    	System.out.println("");
        System.out.println("REGISTERED USERS");
        if (userCount==0) 
        {
            System.out.println("No users registered.");
        }
        
        for(int i=0;i<userCount;i++)
        {

            System.out.println("User " +(i+1));
            users[i].displayUser();

            if (users[i] instanceof Admin)
            {
                Admin admin =(Admin) users[i];
                admin.adminDetails();

            } 
            else if (users[i] instanceof Customer) 
            {

                Customer customer =(Customer) users[i];
                customer.customerDetails();
            }
        }
    }


    public void changePassword(String oldPassword,String newPassword) throws InvalidPasswordException,WeakPasswordException {


        if (currentUser==null) 
        {
            System.out.println("Please login first.");
            return;
        }

        if (!currentUser.getPassword().equals(oldPassword)) 
        {

            throw new InvalidPasswordException("Old password is incorrect.");
        }

        currentUser.setPassword(newPassword);

        System.out.println("Password changed successfully.");
    }

    public void searchUser(String username) {

        for (int i= 0;i<userCount;i++)
        {
            if (users[i].getUsername().equals(username)) 
            {
                System.out.println("\nUser Found!");
                users[i].displayUser();
                if (users[i] instanceof Admin) 
                {
                    Admin admin =(Admin) users[i];
                    admin.adminDetails();

                } 
                else if (users[i]instanceof Customer)
                {
                    Customer customer =(Customer) users[i];
                    customer.customerDetails();
                }

                return;
            }
        }


        System.out.println("User not found.");
    }
}


public class Loginauthentication {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        AuthenticationSystem system = new AuthenticationSystem(10);

        Admin admin =
                new Admin(
                        101,
                        "admin",
                        "admin1234",
                        "admin@gmail.com",
                        "IT Department"
                );


        Customer customer1 =
                new Customer(
                        102,
                        "sujitha",
                        "sujitha123",
                        "sujitha@gmail.com",
                        "Chennai",
                        25000
                );


        Customer customer2 =
                new Customer(
                        103,
                        "rahul",
                        "rahul1234",
                        "rahul@gmail.com",
                        "Bangalore",
                        18000
                );

        system.addUser(admin);
        system.addUser(customer1);
        system.addUser(customer2);

        int choice=0;

        do {
        	System.out.println("");
            System.out.println("LOGIN AUTHENTICATION SYSTEM");
            System.out.println( "1. Login");
            System.out.println("2. Dashboard");
            System.out.println("3. Change Password");
            System.out.println("4. Search User");
            System.out.println("5. Display All Users");
            System.out.println("6. Logout");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: " );
            try {

                choice =Integer.parseInt(sc.nextLine());


                if (choice == 1)
                {
                    System.out.print("Enter username: ");
                    String username =sc.nextLine();
                    System.out.print("Enter password: ");
                    String password =sc.nextLine();

                    try {

                        system.login(username,password);

                    } catch (
                            InvalidUserException |
                            InvalidPasswordException |
                            WeakPasswordException |
                            AccountBlockedException e) {

                        System.out.println("\nLOGIN ERROR: "+ e.getMessage());

                    } catch (
                            NullPointerException e) {
                        System.out.println("\nNULL ERROR: "+ e.getMessage());
                    }
                }

                else if (choice == 2)
                {

                    system.displayDashboard();
                }

                else if (choice == 3) 
                {

                    System.out.print("Enter old password: ");
                    String oldPassword =sc.nextLine();
                    System.out.print("Enter new password: " );
                    String newPassword =sc.nextLine();

                    try {

                        system.changePassword(oldPassword,newPassword);

                    } catch (
                            InvalidPasswordException |
                            WeakPasswordException e) {

                        System.out.println("PASSWORD ERROR: "+ e.getMessage()
                        );
                    }
                }


                else if (choice == 4) 
                {

                    System.out.print("Enter username to search: ");
                    String username =sc.nextLine();
                    system.searchUser(username);
                }


                else if (choice == 5)
                {

                    system.displayAllUsers();
                }


                else if (choice == 6)
                {

                    system.logout();
                }



                else if (choice == 7) {

                    System.out.println("\nThank you");

                } 
                else 
                {

                    System.out.println("Invalid menu choice.");
                }


            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number.");

            }


        } while (choice != 7);


        sc.close();
    }
}