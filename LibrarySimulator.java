/*
student 1:Faisal Alabduljabbar, ID:446101097
student 2:Naif Aljabr, ID:446106414
student 3:Abdulrahman Alessa, ID:446103654
 */
import java.util.Scanner;
public class LibrarySimulator {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        //Predefined accounts:
		  Member user1=new Member(1134, "Faisal",0);
		  Member user2=new Member(1135, "Abdullah",0);
		  Member user3=new Member(1136, "Omar",0);
	        int choice;
	        Member currentUser = null;
	        System.out.println("---- Welcome to the Library Simulator ----\n");
	        do {
	            System.out.println("1. Login as " +user1.getName() + "-" + user1.getId());
	            System.out.println("2. Login as " +user2.getName() + "-" + user2.getId());
	            System.out.println("3. Login as " +user3.getName() + "-" + user3.getId());
	            System.out.println("4. Login as Administrator");
	            System.out.println("5. Exit the Library Simulator");
	            System.out.print("Enter choice: ");
	            choice = scan.nextInt();
	            switch (choice) {
		            case 1:
		            	System.out.println("\n---- Welcome Back Mr "+user1.getName()+" ----");
		            	currentUser=user1;
		            	break;
		            case 2:
		            	System.out.println("\n---- Welcome Back Mr "+user2.getName()+" ----");
		            	currentUser=user2;
		            	break;
		            case 3:
		            	System.out.println("\n---- Welcome Back Mr "+user3.getName()+" ----");
		            	currentUser=user3;
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
	            int user_choice;
	            boolean exitUserMenu = false;
	            while (choice>=1 && choice<=3 && !exitUserMenu) {
	            	//User Interface
		            	System.out.println("\nWhat would you like to do?");
		            	System.out.println("1-View the number of Borrowed Books.");
		            	System.out.println("2-Borrow a Book.");
		            	System.out.println("3-Return a Book.");
		            	System.out.println("4-View a Session Summary.");
		            	System.out.println("5-Exit to the Main Menu.");
		            
		            System.out.print("Enter choice: ");
		            user_choice = scan.nextInt();
		            System.out.println("");
		            switch (user_choice) {
		            case 1:
		            	System.out.println("You have "+currentUser.getBorrowedCount()+" books.");
		            	break;
		            case 2:
		            	System.out.println("Please note that each book have a 0.50sr fee.");
		            	currentUser.borrowOne();
		            	break;
		            case 3:
		            	currentUser.returnOne();
		            	break;
		            case 4:
		            	currentUser.displayStatistics();
		            	break;
		            case 5:
		            	exitUserMenu=true;
		            	currentUser.reset();
		            	break;
		            default:
		            	System.out.println("Invalid choice, Please try again.");
		            	break;
		            	}
		            }
	            //Admin's password
	            String password = null;
	            if(choice == 4) {
	            	scan.nextLine();
	            	System.out.print("Enter admin password: ");  
	                 password = scan.nextLine();  
	                 
	                 if (!password.equals("admin")) {
	                     System.out.println("Invalid password, Access denied.");
	                     System.out.println("");
	                 }
	            }
	            int admin_choice;
	            boolean exitAdminMenu = false;
	            while (choice==4 && !exitAdminMenu && password.equals("admin") ) {
	            	//Admin Interface
	            	System.out.println("\nWhat would you like to do?");
	            	System.out.println("1-View the Total Revenues.");
	            	System.out.println("2-View the Most Frequent Operation.");
	            	System.out.println("3-Exit to the Main Menu.");
	            	
	            	System.out.print("Enter choice: ");
	            	admin_choice=scan.nextInt();
	            	System.out.println("");
	            	
	            	switch(admin_choice) {
	            	case 1:
	            		System.out.printf("The Total Revenues is %.2f\n", Member.TotalRevenue);
	            		break;
	            	case 2:
	            		if (Member.TotalBorrows>Member.TotalReturns)
	            			System.out.println("the most commonly performed user operation is borrow with "+Member.TotalBorrows+" times.");      
	            		else if (Member.TotalBorrows<Member.TotalReturns)
	            			System.out.println("the most commonly performed user operation is return with "+Member.TotalReturns+" times.");
	            		else
	            			System.out.println("Borrow and return operations are tied, with "+Member.TotalBorrows+" for both.");
	            		break;
	            	case 3:
	            		exitAdminMenu=true;
		            	break;
	            	default:
		            	System.out.println("Invalid choice, Please try again.");
		            	break;
		            	}
	                 }
	            } 
	        while(choice!=5);
	       
	}
	}


