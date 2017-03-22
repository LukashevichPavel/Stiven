package by.htp.library.dz;



public class Book extends PrintedEdition {

	public Book(){
		super();
	}
	/*public Book(double price, String title){
		this.setPrice(price);
		this.setTitle(title);
	}*/
	
	public Book(String type, String title, double price){
		super(type, title, price);
	}

}