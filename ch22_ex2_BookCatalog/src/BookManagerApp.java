import java.util.List;
import java.util.stream.Collectors;

public class BookManagerApp {

	public static void main(String[] args) {
		List<Book> bookList = new BookCatalog().getCatalog();

		List<Book> booksByTitle = bookList.stream().filter(b -> b.getTitle() == "Java Programming")
				.collect(Collectors.toList());
		System.out.println("\nBOOKS BY TITLE:");
		booksByTitle.stream().forEach(b -> System.out.println(b));

		List<Book> booksByCategory = bookList.stream().filter(b -> b.getCategory() == Book.DOTNET)
				.collect(Collectors.toList());
		System.out.println("\nBOOKS BY CATEGORY:");
		booksByCategory.stream().forEach(b -> System.out.println(b));
//		List<Book> booksByCategory = manager.getBooks(b -> b.getCategory().equals(Book.JAVA));

		List<Book> booksByDataBase = bookList.stream().filter(b -> b.getCategory() == Book.DATABASE).collect(Collectors.toList());
		booksByDataBase.stream().map(b -> b.getTitle());
		System.out.println("DATABASE BOOK TITLES:");
		booksByDataBase.stream().forEach(System.out::println);
//
//		List<Book> booksByFormat = manager.getBooks(b -> b.getFormat().equals(Book.PAPERBACK));
//		System.out.println("\nBOOKS BY FORMAT:");

	}
}