
public class BookDiver {

	public static void main(String[] args) {
		/*Book book1 = new Book();
		book1.print();
		Book dictionary1 = new Dictionary();
		dictionary1.print();
		Book book2 = new Book();
		book2.words();
		Book dictionary2 = new Dictionary();
		dictionary2.words();
		Dictionary dictionary3 = new Dictionary();
		dictionary3.words();
		Dictionary dictionary4 = new Dictionary();
		dictionary4.print();
		Book book5 = new Book();
		Dictionary d1 = (Dictionary) book5;*/
		
		
		
		Book book6 = new Dictionary();
		Dictionary d2 = (Dictionary) book6;
		d2.words();
		
		Book book7 = new Book();
		if(book7 instanceof Dictionary) {
		   Dictionary d3 = (Dictionary) book7;
		}
		/*Book book8 = new Dictionary();
		if(book8 instanceof Dictionary) {
		   book8.words();
		}*/

	}

}
