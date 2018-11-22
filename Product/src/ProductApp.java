
public class ProductApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		public Product() {
			
		}
		
		Product borisBook = new Product();
		borisBook.setCode("Java");
		borisBook.setDescription("Murach's Java Programming");
		borisBook.setPrice(57.50);
		
		System.out.println("Boris's book ="+
							borisBook.getCode()+
							", "+borisBook.getDescription()+
							", "+borisBook.getPrice());
		
//		Product zhiBook = new Product("Java", "Murach's Java Programming", 57.50);
//		
//		System.out.println(zhiBook);
		
		System.out.println(Math.PI);
		
		
		System.out.println("Bye");
	}

}
