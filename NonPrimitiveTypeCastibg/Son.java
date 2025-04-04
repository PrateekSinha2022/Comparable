package NonPrimitiveTypeCastibg;

public class Son extends Father{
	
	@Override
	Son createObject()
	{
		System.out.println("hello");
		return new Son();
	}

}
