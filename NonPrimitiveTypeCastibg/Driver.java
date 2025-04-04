package NonPrimitiveTypeCastibg;

public class Driver {
	public static void main(String[] args) {
		
		Father f = new Son().createObject();
		Son s = (Son)f;
		System.out.println(s);
	}

}
