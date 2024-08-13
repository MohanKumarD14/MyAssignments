package week1.day2;

public class Library {


	public String addBook(String booktitle) {
		System.out.println("Book added successfully");
		//System.out.println(booktitle);

		return booktitle;


	}
	public void issueBook() {
		System.out.println("Book Issued successfully");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library lb=new Library();

		lb.addBook(null);

		//lb.addBook("Book added successfully from add Library class");

		//String s=lb.addBook("Book added successfully");
		//System.out.println(s);

		lb.issueBook();
	}

}
