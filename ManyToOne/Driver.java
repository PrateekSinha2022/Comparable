package ManyToOne;

public class Driver {
	public static void main(String[] args) {
		
		Product product = new Product("Mobile");
		Review r1 = new Review("Average ",product);
		r1.display();
	}

}
