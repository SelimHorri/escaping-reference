import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookCollection {

	private List<Book> books;

	public BookCollection() {
		books = new ArrayList<Book>();
		
		books.add(new Book(1,"Don Quixote","Miguel De Cervantes",3.99));
		books.add(new Book(2,"Pilgrim's Progress","John Bunyan",4.45));
		books.add(new Book(3,"Robinson Crusoe","Daniel Defoe",3.99));
		books.add(new Book(4,"Gulliver's Travels","Jonathan Swift",7.60));
		books.add(new Book(5,"Tom Jones","Henry Fielding",9.99));
		books.add(new Book(6,"Clarissa","Samuel Richardson",4.45));
		books.add(new Book(7,"Dangerous Liaisons","Pierre Choderlos De Laclos",11.50));
		books.add(new Book(8,"Emma","Jane Austen",3.99));
		books.add(new Book(9,"Frankenstein","Mary Shelley",7.60));
		books.add(new Book(10,"The Count of Monte Christo","Alexandre Dumas",3.99));
	}

	public BookReadOnly findBookByName(String title) {
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}

	public void printAllBooks() {
		for (Book book : books) {
			System.out.println(book.getTitle() + ": " + book.getPrice());
		}
	}

}
