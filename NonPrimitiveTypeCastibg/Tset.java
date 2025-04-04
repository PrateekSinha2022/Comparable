package NonPrimitiveTypeCastibg;
class A{
	
	void hell()
	{
		System.out.println("Hello");
	}
}
class B extends A{}
class C extends A{
	
	void hell()
	{
		System.out.println("Hello");
	}
}
class D extends C{}
class E{}

public class Tset {
	
	
	public static void main(String[] args) {
		
		A c = new D();
		C d = (C)c;
		c.hell();
		System.out.println(c instanceof D);
		
		
	}

}
