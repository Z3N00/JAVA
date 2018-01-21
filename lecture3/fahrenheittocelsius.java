package lecture3;

public class fahrenheittocelsius {

	public static void main(String[] args) {
		int c;
		int f=0;
		while(f<=300)
		{
		c=(5*(f-32)/9);
			f=f+20;
		
		System.out.println(f+"\t"+c);
		
		}
	}

}
