import java.util.Scanner;

class Library {
	
	private int acc_num;
	private String title;
	private String author;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter accession number, title and author");
		acc_num = sc.nextInt();
		sc.nextLine();
		title = sc.nextLine();
		author = sc.nextLine();
	}
	
	public void compute(int NoOfDaysLate) {
		int fine = NoOfDaysLate * 2;
		System.out.println("\nFine = " + fine);
	}
	
	public void display() {
		String header = String.format("%-20s%-20s%-20s", "Accession Number", "Title", "Author");
		String divider = String.format("%-20s%-20s%-20s", "-----------------", "-------", "-------");
		String data = String.format("%-20d%-20s%-20s", acc_num, title, author);

		System.out.println(header);
		System.out.println(divider);
		System.out.println(data);
	}

}

public class LibraryApp {
	public static void main(String[] args) {
		Library library = new Library();
		library.input();
		library.display();
		library.compute(5);
	}
}