/*	Take as input the following 
a.	A number 
b.	A digit 
Write a function that returns the number of times digit is found in the number. Print the value returned.*/ 




package lecture3;

public class count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println(count(121541,1));
	}
	
	public static int count(int num, int digit){
		int rem;
		int count=0;
		while(num!=0){
		rem=num%10;
		if(rem==digit){
			count++;
		}
		num=num/10;
		}
		return count;
	}

}
