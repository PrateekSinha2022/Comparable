package Queue;

public class QueueLLDriver {
	
	public static void main(String[] args) {
		
		QueueLL q=new QueueLL();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.display();
		System.out.println(q.delete());
		q.display();
	}

}
