package Railway;

import java.util.Scanner;

class InvalidTrainException extends Exception {
	public InvalidTrainException(String message) {
		super(message);
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

class TicketLimitException extends Exception {
	public TicketLimitException(String message) {
		super(message);
	}
}

class Passenger 
{
	private String name;
	private int age;

	public Passenger(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge() 
	{
		return age;
	}

	public void displayPassenger() 
	{
		System.out.println("Passenger Name : " + name);
		System.out.println("Age : " + age);
	}
}

interface RailwayOperations 
{
	void bookTicket(int trainNumber, int numberOfTickets) throws InvalidTrainException, InvalidAgeException, TicketLimitException;
	void cancelTicket();
	void displayTicket();
}

class RailwayReservation implements RailwayOperations 
{

	private int trainNumber;
	private String trainName;
	private String source;
	private String destination;
	private int availableSeats;

	private Passenger[] passengers;
	private int passengerCount;

	public RailwayReservation(int trainNumber, String trainName,String source, String destination, int availableSeats) {

		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.availableSeats = availableSeats;

		passengers = new Passenger[6];
		passengerCount = 0;
	}

	public int getTrainNumber() 
	{
		return trainNumber;
	}

	public String getTrainName() 
	{
		return trainName;
	}

	public int getAvailableSeats() 
	{
		return availableSeats;
	}

	public void displayTrain() 
	{
		System.out.println("Train Number : " + trainNumber);
		System.out.println("Train Name : " + trainName);
		System.out.println("From : " + source);
		System.out.println("To : " + destination);
		System.out.println("Available Seats : " + availableSeats);
	}

	public void bookTicket(int trainNumber, int numberOfTickets) throws InvalidTrainException, InvalidAgeException, TicketLimitException {

		if (this.trainNumber != trainNumber) 
		{
			throw new InvalidTrainException("Invalid train number.");
		}

		if (numberOfTickets > 6) {
			throw new TicketLimitException("Maximum 6 tickets can be booked at a time.");
		}

		if (numberOfTickets <= 0) 
		{
			throw new TicketLimitException("Number of tickets must be greater than zero.");
		}

		if (numberOfTickets > availableSeats) {
			throw new TicketLimitException(
					"Not enough seats available.");
		}

		System.out.println("\nEnter passenger details");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numberOfTickets; i++) {

			System.out.println("\nPassenger " + (i + 1));

			System.out.print("Enter passenger name: ");
			String name = sc.nextLine();

			if (name == null || name.trim().equals("")) {
				throw new NullPointerException(
						"Passenger name cannot be empty.");
			}

			System.out.print("Enter passenger age: ");
			int age;

			try {
				age = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Age must be a number.");
				return;
			}

			if (age < 5) {
				throw new InvalidAgeException(
						"Passenger age must be at least 5 years.");
			}

			passengers[passengerCount] =
					new Passenger(name, age);

			passengerCount++;
		}

		availableSeats =
				availableSeats - numberOfTickets;

		System.out.println("\nTicket booked successfully.");
		System.out.println("Train : " + trainName);
		System.out.println("Number of tickets : "
				+ numberOfTickets);
	}

	public void cancelTicket() {

		if (passengerCount == 0) {
			System.out.println("No tickets are booked.");
			return;
		}

		System.out.println("\nCancelling booking...");

		availableSeats =
				availableSeats + passengerCount;

		for (int i = 0; i < passengerCount; i++) {
			passengers[i] = null;
		}

		passengerCount = 0;

		System.out.println("Ticket cancelled successfully.");
	}

	public void displayTicket() {

		if (passengerCount == 0) {
			System.out.println("No ticket has been booked.");
			return;
		}

		System.out.println("\n================================");
		System.out.println("       TICKET DETAILS");
		System.out.println("================================");

		System.out.println("Train Number : " + trainNumber);
		System.out.println("Train Name : " + trainName);
		System.out.println("From : " + source);
		System.out.println("To : " + destination);

		System.out.println("\nPassenger Details");

		for (int i = 0; i < passengerCount; i++) {

			System.out.println("\nPassenger "
					+ (i + 1));

			passengers[i].displayPassenger();
		}

		System.out.println("\nTotal Tickets : "
				+ passengerCount);

		System.out.println("Available Seats : "
				+ availableSeats);
	}
}

public class Railway_project {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		RailwayReservation[] trains =
				new RailwayReservation[3];

		trains[0] = new RailwayReservation(
				12675,
				"Chennai Express",
				"Chennai",
				"Bangalore",
				50
		);

		trains[1] = new RailwayReservation(
				12608,
				"Chennai Mail",
				"Chennai",
				"Coimbatore",
				40
		);

		trains[2] = new RailwayReservation(
				12609,
				"Intercity Express",
				"Chennai",
				"Madurai",
				60
		);

		int choice = 0;

		do {

			System.out.println("\n================================");
			System.out.println("   RAILWAY TICKET RESERVATION");
			System.out.println("================================");

			System.out.println("1. Display Trains");
			System.out.println("2. Book Ticket");
			System.out.println("3. Display Ticket");
			System.out.println("4. Cancel Ticket");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");

			try {

				choice = Integer.parseInt(sc.nextLine());

				if (choice == 1) {

					System.out.println("\nAvailable Trains");

					for (int i = 0; i < trains.length; i++) {

						System.out.println("\nTrain "
								+ (i + 1));

						trains[i].displayTrain();
					}

				} else if (choice == 2) {

					System.out.print(
							"Enter train number: ");

					int trainNumber =
							Integer.parseInt(sc.nextLine());

					RailwayReservation selectedTrain = null;

					for (int i = 0; i < trains.length; i++) {

						if (trains[i].getTrainNumber()
								== trainNumber) {

							selectedTrain = trains[i];
							break;
						}
					}

					if (selectedTrain == null) {

						throw new InvalidTrainException(
								"Train number does not exist.");
					}

					System.out.print(
							"Enter number of tickets: ");

					int tickets =
							Integer.parseInt(sc.nextLine());

					try {

						selectedTrain.bookTicket(
								trainNumber,
								tickets
						);

					} catch (InvalidAgeException e) {

						System.out.println(
								"Age Error: "
								+ e.getMessage());

					} catch (TicketLimitException e) {

						System.out.println(
								"Ticket Error: "
								+ e.getMessage());

					} catch (NullPointerException e) {

						System.out.println(
								"Name Error: "
								+ e.getMessage());
					}

				} else if (choice == 3) {

					System.out.print(
							"Enter train number: ");

					int trainNumber =
							Integer.parseInt(sc.nextLine());

					boolean found = false;

					for (int i = 0; i < trains.length; i++) {

						if (trains[i].getTrainNumber()
								== trainNumber) {

							trains[i].displayTicket();
							found = true;
							break;
						}
					}

					if (!found) {

						throw new InvalidTrainException(
								"Train number does not exist.");
					}

				} else if (choice == 4) {

					System.out.print(
							"Enter train number: ");

					int trainNumber =
							Integer.parseInt(sc.nextLine());

					boolean found = false;

					for (int i = 0; i < trains.length; i++) {

						if (trains[i].getTrainNumber()
								== trainNumber) {

							trains[i].cancelTicket();
							found = true;
							break;
						}
					}

					if (!found) {

						throw new InvalidTrainException(
								"Train number does not exist.");
					}

				} else if (choice == 5) {

					System.out.println(
							"Thank you for using Railway Reservation System.");

				} else {

					System.out.println(
							"Invalid choice.");
				}

			} catch (InvalidTrainException e) {

				System.out.println(
						"Train Error: "
						+ e.getMessage());

			} catch (NumberFormatException e) {

				System.out.println(
						"Please enter numbers only.");

			} finally {

				System.out.println(
						"\n--------------------------------");
			}

		} while (choice != 5);

		sc.close();
	}
}