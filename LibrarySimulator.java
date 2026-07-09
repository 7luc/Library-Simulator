import java.util.Scanner;

public class LibrarySimulator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Member user1 = new Member(1134, "Faisal", 0);
		Member user2 = new Member(1135, "Abdullah", 0);
		Member user3 = new Member(1136, "Omar", 0);

		int choice;

		System.out.println("---- Welcome to the Library Simulator ----\n");

		do {

			System.out.println("1. Login as " + user1.getName() + "-" + user1.getId());
			System.out.println("2. Login as " + user2.getName() + "-" + user2.getId());
			System.out.println("3. Login as " + user3.getName() + "-" + user3.getId());
			System.out.println("4. Login as Administrator");
			System.out.println("5. Exit the Library Simulator");
			System.out.print("Enter choice: ");

			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n---- Welcome Back Mr " + user1.getName() + " ----");
				break;

			case 2:
				System.out.println("\n---- Welcome Back Mr " + user2.getName() + " ----");
				break;

			case 3:
				System.out.println("\n---- Welcome Back Mr " + user3.getName() + " ----");
				break;

			case 4:
				System.out.println("\n---- Welcome to the Administrator Menu ----");
				break;

			case 5:
				System.out.println("\n---- See you later ----");
				break;

			default:
				System.out.println("Invalid choice, Please try again.");
			}

		} while (choice != 5);

	}
}