package lecture10;



public class QueueUsingArraysClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingArrays queue = new QueueUsingArrays(5);
		for (int i = 1; i <= 5; i++) {
			queue.Enqueue(i);
			displayQueueInfo(queue);
		}
		System.out.println(queue.Dequeue());
		queue.Enqueue(6);
		displayQueueInfo(queue);
		while (!queue.isEmpty()) {
			displayQueueInfo(queue);
			queue.Dequeue();
		}
		
		queue.Dequeue();

	}

	public static void displayQueueInfo(QueueUsingArrays q) throws Exception {
		System.out.println("****************************************");
		q.display();
		System.out.println(q.front());
		System.out.println(q.size());
		System.out.println("****************************************");
	}

}
