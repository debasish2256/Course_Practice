package March11;

public class MainDriver {
	public static void main(String[] args) {
		Author auth=new Author("chetan bhagat","abc@gmail.com",'M');
//		System.out.println(auth);
		
		Book b1=new Book("3 Mistake of Life",auth,230,10);
//		System.out.println(b1);
		
		System.out.println("Author Name:"+b1.getAuthor().getName());
		System.out.println("Gender:"+b1.getAuthor().getGender());
		System.out.println("Email:"+b1.getAuthor().getEmail());


	}
}
