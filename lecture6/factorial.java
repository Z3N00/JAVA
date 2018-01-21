package lecture6;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		System.out.println(fibbonacci(5));
		System.out.println(power(2,5));

	}

	public static int fact(int num) {
		int fac = 1;
		if (num == 0) {
			return 1;
		}

		fac=num*fact(num - 1);
		return fac;

	}
	public static int fibbonacci(int num){
		int n;
		if(num==0||num==1){
			return num;
			
		}
		fibbonacci(num-1);
		n=fibbonacci(num-1)+fibbonacci(num-2);
		return n;
		
	}
          public static int power(int x,int n){
        	  if(n==0){
        		  return 1;
        	  }
        	  int pow=power(x,n-1)*x;
        	  return pow;
        	  
          }
}