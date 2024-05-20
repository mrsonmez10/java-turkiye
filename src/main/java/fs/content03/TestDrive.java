package fs.content03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDrive {

	public static void main(String[] args) {

		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("Shibumi", 432));
		bookList.add(new Book("Sahip Olmak Yada Olmak", 256));
		bookList.add(new Book("Otomatik Portakal", 176));
		bookList.add(new Book("Zamir", 152));

		Collections.sort(bookList);
		System.out.println("Sıralama1");
		for (Book kitap : bookList) {
			System.out.println(kitap.toString());
		}


		/*
		// Sıralama 2
		System.out.println("Sıralama2");
		BookNameComparator nameComparator = new BookNameComparator();

		Collections.sort(bookList, nameComparator);
		for (Book kitap : bookList) {
			System.out.println(kitap.toString());
		}

		 */
	}
}
