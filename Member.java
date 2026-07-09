public class Member {
	private int id;
	private String name;
	private int borrowedCount;
    private int numViewBorrowed;
    private int numBorrows;
    private int numReturns;
    private double sessionFees;
    public static double TotalRevenue;
    public static int TotalViewBorrowed;
    public static int TotalBorrows;
    public static int TotalReturns;

	public Member(int id, String name, int borrowedCount) {
	    this.id = id;
	    this.name = name;
	    this.borrowedCount = borrowedCount;
	}
    private boolean canBorrow() {
        if(borrowedCount>=5)
            return(false);
        else
            return(true);
    }

    private boolean canReturn() {
        if(borrowedCount<1)
            return(false);
        else
            return(true);
    }

    public boolean borrowOne() {
        if(canBorrow()) {
            borrowedCount++;
            TotalBorrows++;
            numBorrows++;
            sessionFees+=.50;
            TotalRevenue+=.50;
            System.out.println("Borrowed one book successfully.");
            System.out.println("You have now "+borrowedCount+" book(s)");
            return(true);
        }
        else {
            System.out.println("Sorry, You can't borrow more than 5 books.");
            return(false);
        }
    }

    public boolean returnOne() {
        if(canReturn()) {
            borrowedCount--;
            TotalReturns++;
            numReturns++;
            System.out.println("Returned one book successfully.");
            System.out.println("You have now "+borrowedCount+" book(s)");
            return(true);
        }
        else {
            System.out.println("Sorry, You need to have at least 1 book.");
            return(false);
        }
    }
    
	public int getId() {
		return (id);
	}

	public String getName() {
		return (name);
	}

	public int getBorrowedCount() {
		return (borrowedCount);
	}
}