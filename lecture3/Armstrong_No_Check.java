/* Take as input a number. Write a functions which returns true if the number is Armstrong number and false otherwise. 
   Print the value returned. 
   An Armstrong number is defined as follows 
   E.g. 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3 */ 
package lecture3;

public class Armstrong_No_Check {

	public static void main(String[] args) {
		System.out.println(check(371));

	}
	public static boolean check(int num){
		int digit=num;
		int rem=0;
		int n=0;
		while(num!=0){
		rem=num%10;
		
		
		rem=rem*rem*rem;
		n=n+rem;
		num=num/10;
		}
		if(n==digit){
			System.out.println(n+ "  it is an armstrong number");
			return true;
		}
		else{
			System.out.println(n+ " it is not an armstrong number");
			return false;
		}
	}

}
