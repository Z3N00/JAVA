package Lecture12;
import  Lecture11.DynamicStack;


public class revclient {

	public static void main(String[] args) throws Exception {
		DynamicStack stack=new DynamicStack(5);
		DynamicStack stack1=new DynamicStack(5);
           for(int i=1;i<=5;i++){
        	   stack.push(i);
        	   
           }
           stack.display();
           reverse(stack,stack1,0);
           stack.display();

	}
	public static void reverse(DynamicStack stack,DynamicStack stack1,int idx) throws Exception{
		if(stack.isEmpty()){
			return;
		}
		int item =stack.pop();
		reverse(stack,stack1,idx+1);
		stack1.push(item);
		if(idx==0){
			while(!stack1.isEmpty()){
				stack.push(stack1.pop());
				
				
			}
		}
	}

}
