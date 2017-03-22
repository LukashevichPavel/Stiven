package by.htp.library.dz;


public class Main {

	public static void main(String[] args) {
		
	/*	Book book = new Book();
		book.setPrice(105.3);
		book.setTitle("50 ottenkov serogo");
		book.setType("book");
		
		Magazine magazine = new Magazine();
		magazine.setPrice(10);
		magazine.setTitle("Cool magazine");
		
		PrintedEdition printEdition = new Book();
		Object obj = new Book();
		//Book book = new PrintedEdition();
		
		PrintedEdition prints[];
		*/
		Book book = new Book("Book","50 ottenkov serogo", 105.3);
		Book book2 = new Book("Book", "Maugli", 103.75);
		Magazine magazine = new Magazine ("Magazine","Playboy",220.25);
		Magazine magazine2 = new Magazine ("Magazine","Java for student",325.55);
		Magazine magazine3 = new Magazine ("Magazine","The secret of Universe",103.15);
		//System.out.println(book.getType()+" \"" + book.getTitle() + "\"" + " -> price = "+ book.getPrice());
		//System.out.println(book2.getType()+ " \"" + book2.getTitle() + "\"" + " -> price = "+ book2.getPrice());
				
		Library lib = new Library(5); //Создаю библиотеку
		lib.addItem(0, book); //Заполняю библиотеку
		lib.addItem(1, book2);
		lib.addItem(2, magazine);
		lib.addItem(3, magazine2);
		lib.addItem(4, magazine3);
		//System.out.println(lib.getItem(1).getTitle());
		lib.printLibrary();// Вывожу библиотеку
		//System.out.println(lib.Size()); 
	}

}
