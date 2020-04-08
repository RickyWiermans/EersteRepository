class Demo2{
	public static void main(String[] args){
	Book book = new Book();
	book.title = "Java is Cool";
	book.numberOfPages = 1359;
	new Demo2().printBook(book);
	}

	void printBook(Book book){
		System.out.println("Titel van het boek is: " + book.title);
		System.out.println("Aantal pagina's: " + book.numberOfPages);
	}
}


class Book{
	String title;
	int numberOfPages;
}