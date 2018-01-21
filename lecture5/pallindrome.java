package lecture5;
public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
	boolean ans=pallindrome(str);
	System.out.println(ans);

	}
	public static boolean pallindrome(String str){
		int left=0;
		int right=str.length()-1;
		boolean flag=true;
		while(left<right){
			
			if(str.charAt(left)==str.charAt(right)){
				flag=true;
				break;
				
			}
			else{
				flag=false;
			}
			
			left++;
			right--;
		}
		if(flag==true){
			System.out.println("pallindrome");
			return true;
		}
		else{
			System.out.println("not pallindrome");
			return false;
		}
	}

}
