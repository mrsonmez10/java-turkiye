package fs.content03;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {

	@Override
	public int compare(Book m1, Book m2) {
		return m1.getName().compareTo(m2.getName());
	}
}
