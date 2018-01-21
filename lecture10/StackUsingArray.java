package lecture10;

public class StackUsingArray {

	protected int[] data;
	protected int tos;
	public static final int DEFAULT_CAPACITY=10;
	public StackUsingArray() throws Exception{
		this(DEFAULT_CAPACITY);
	
	}
	public StackUsingArray(int capacity) throws Exception{
		if(capacity<1){
			throw new Exception("enter valid capacity");
		}
		else {
			this.tos=-1;
			this.data=new int[capacity];
		}
		
	}
     public int size(){
    	 return tos+1;
     }
     public boolean isEmpty(){
    	 if(tos==-1){
    		 return true;
    	 }
    	 else{
    		 return false;
    	 }
     }
     public void push(int item)throws Exception{
    	 if(this.size()==this.data.length){
    		 throw new Exception("stack is full");
    	 }
    	 else{
    		 tos++;
    		 data[tos]=item;
    		 
    	 }
     }
     public int pop()throws Exception
     {
    	 if(this.size()==0){
    		 throw new Exception ("stack is empty");
    	 }
    	 int retval=this.data[tos];
    	 this.data[tos]=0;
    	 this.tos--;
    	 return retval;
     }
     
     public int top()throws Exception
     {
    	 if(this.size()==0){
    		 throw new Exception ("stack is empty");
    	 }
    	 int retval=this.data[tos];
    	 
    	 return retval;
     }
     public void  display(){
    	 for(int i=this.tos;i>=0;i--){
    		 System.out.print(this.data[i]+",");
    	 }
    	 System.out.println("END");
     }
}
