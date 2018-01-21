package lecture3;

public class FunWithQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 5));
		System.out.println(log(32, 2));
		System.out.println(inverse(4213));
	}

	public static int power(int x, int n) {
		int retVal=1;
		while(n!=0){
			retVal=retVal*x;
			n--;
		}
		return retVal;
	}

	public static int log(int x, int n) {
		int counter=0;
		while(x!=1){
			counter=counter+1;
			x=x/n;
		}
		return counter;
	}
	
	public static int inverse(int num){
		int counter=1;
		int inv=0;
		while(num!=0){
			int rem=num%10;
			int pow=1;
			while(rem!=1){
				pow=pow*10;
				rem--;
			}
			inv=inv+counter*pow;
			counter++;
			num=num/10;
		}
		return inv;
	}
	

}
