package Doubly;

public class DoubleLLDriver {
	public static void main(String[] args) {
		DoublyLL list=new DoublyLL();
		list.append(5);
		list.append(10);
		list.append(50);
		list.append(60);
		list.display();
		list.delete(0);
		list.display();
		
	}

}
