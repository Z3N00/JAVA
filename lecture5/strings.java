package lecture5;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		 printchars(str);
          System.out.println("**********************************************");
		 printsubstring(str);
		
		// System.out.println(str.length());
		// System.out.println(str.charAt(0));

	}

	public static void printchars(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));

		}

	}

	public static void printsubstring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}

		}
	}

	
}
