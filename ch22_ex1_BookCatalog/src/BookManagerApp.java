import java.util.List;

public class BookManagerApp {

	public static void main(String[] args) {
		BookManager manager = new BookManager();

		List<Book> booksByTitle = manager.getBooks(b -> b.getTitle() == ("Java Programming"));
		System.out.println("\nBOOKS BY TITLE:");
		printList(booksByTitle);

		List<Book> booksByCategory = manager.getBooks((Book b) -> b.getCategory().equals(Book.JAVA));
		System.out.println("\nBOOKS BY CATEGORY:");
		printList(booksByCategory);

		List<Book> paperBackBooks = manager.getBooks(b -> b.getFormat().equals(Book.PAPERBACK));
		System.out.println("\nPAPERBACK BOOKS:");
		printList(paperBackBooks);

		List<Book> electronicBooks = manager.getBooks(b -> b.getFormat() == Book.ELECTRONIC);
		System.out.println("\nELECTRONIC BOOKS:");
		printList(electronicBooks);
	}

	// uses a ForEach loop to print each Book object from List<Book> bookList
	public static void printList(List<Book> bookList) {
		for (Book b : bookList) {
			System.out.println(b);
		}
	}
}