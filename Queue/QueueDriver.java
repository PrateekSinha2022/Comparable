package Queue;

public class QueueDriver {
	public static void main(String[] args) {
		
		Queue q=new Queue();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.display();
		q.delete();
		q.display();
		q.insert(50);
		q.display();
	}

}
