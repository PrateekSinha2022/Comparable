package calci;

public class CalciDriver {
	
	public static void main(String[] args) {
		Calculator ob =new Calculator(26.7,33.3);
		
		Calculator.add(ob).multiply(ob);
		System.out.println(ob.getResult());
		
	}
	
	
	

}
