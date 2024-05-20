package fs.content03;

public class Book implements Comparable<Book> {

	private String name;
	private int page;

	public Book(String name, int page) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.page = page;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.page - o.page;
	}

	@Override
	public String toString() {
		return "Kitap [isim=" + name + ", sayfa=" + page + "]";
	}
}
