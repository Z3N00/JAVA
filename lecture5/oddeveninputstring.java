package lecture5;

/*4.	Take as input S, a string. Write a function that replaces every odd character with the character
 *  having just higher ascii code and every even character with the character having just lower ascii code.
 *   Print the value returned. */
public class oddeveninputstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		System.out.println(changestring(str));
	}

	public static String changestring(String str) {
		int counter = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char cc = str.charAt(i);
			while (counter<=i) {

				if (counter % 2 == 0) {
					if (cc >= 65 && cc <= 90) {
						char tbi = (char) (cc + 32);
						sb.append(tbi);
					}
				}
				else {
						if (cc >= 97 && cc <= 122) {
							char tbi = (char) (cc - 32);
							sb.append(tbi);
						}
					}
				}
			
				counter++;
			}
		

		return sb.toString();
	}

}
