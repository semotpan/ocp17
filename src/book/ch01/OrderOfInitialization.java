package book.ch01;


public class OrderOfInitialization {

	private String name = "Fluffy";


	{  System.out.println("setting field"); }
	

	OrderOfInitialization() {
		this.name = "Tiny";
		System.out.println("setting constructor");
	}

	public static void main(String [] main) {
		
		OrderOfInitialization o = new OrderOfInitialization();

		System.out.println(o.name);
	}
}

