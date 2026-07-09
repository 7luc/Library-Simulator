public class Member {
	private int id;
	private String name;
	private int borrowedCount;

	public Member(int id, String name, int borrowedCount) {
	    this.id = id;
	    this.name = name;
	    this.borrowedCount = borrowedCount;
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