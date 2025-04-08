package Ll;

public class CllDriver {
	
	public static void main(String[] args) {
		
		Cll list=new Cll();
		list.append(20);
		list.append(30);
		list.append(50);
		list.append(60);
		list.display();
		list.deletePos(2);
		list.display();
		list.reverse();
		list.display();
	}

}
