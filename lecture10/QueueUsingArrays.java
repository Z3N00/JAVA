package lecture10;

public class QueueUsingArrays {

	protected int[] data;
	protected int size;
	protected int front;
	public static final int DEFAULT_CAPACITY = 10;

	public QueueUsingArrays() throws Exception {
		this(DEFAULT_CAPACITY);

	}

	public QueueUsingArrays(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("invalid capacity");
		}
		this.data = new int[capacity];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void Enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("queue is full");

		}
		int ai=this.front+this.size %this.data.length;
		this.data[ai]=item;
	}

	public int Dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("queue is empty");
		}

		int retval = this.data[this.front];
		
		
		return retval;

	}

	public int front() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int retVal = this.data[this.front];
		return retVal;
	}
	 public void  display(){
    	 for(int i=0;i<this.size;i++){
    		 int ai=(this.front+i)%this.data.length;
    		 System.out.println(this.data[ai]+",");
    	 }
    	 System.out.println();
     }
}
