package lecture6;

public class reccursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      pdi(5);
      System.out.println("*******************************************************************************");
      pdioe(5);
	}
	public static void pdi(int num){
		if(num==0){
			return;
		}
		
		System.out.println(num);
		pdi(num-1);
		System.out.println(num);
		
	}
	public static void pdioe(int num){
		if(num==0){
			return;
		}
		if(num%2!=0){
		System.out.println(num);
		
		}
		pdioe(num-1);
		if(num%2==0){
			System.out.println(num);
		}
		
	}
}

	


