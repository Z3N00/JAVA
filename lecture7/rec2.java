package lecture7;

import java.util.ArrayList;

public class rec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(getSSWAscii("ab"));
		//System.out.println(getpermutation("abc"));
	//	printss("abc", " ");
		printpermutation("abc", "");
		printboardpath(end, current);
	}

	public static ArrayList<String> getSSWAscii(String str) {
		if (str.length() == 0) {
			ArrayList<String> a1 = new ArrayList<>();
			a1.add(" ");
			return a1;
		}

		char cc = str.charAt(0);
		int ch = (int) cc;
		String ros = str.substring(1);
		ArrayList<String> rec = getSSWAscii(ros);

		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < rec.size(); i++) {
			list.add(rec.get(i));
			list.add(cc + rec.get(i));
			list.add(ch + rec.get(i));
		}
		return list;
	}

	public static ArrayList<String> getpermutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> c1 = new ArrayList<>();
			c1.add(" ");
			return c1;
		}
		char cc = str.charAt(0);
		String s = str.substring(1);
		ArrayList<String> a1 = getpermutation(s);
		ArrayList<String> b1 = new ArrayList<>();
		for (int i = 0; i < a1.size(); i++) {
			String st = a1.get(i);
			for (int j = 0; j <= st.length(); j++) {
				String mystring = st.substring(0, j) + cc + a1;
				b1.add(mystring);
			}

		}
		return b1;
	}

	public static ArrayList<String>getboardpath(int end,int current){
	          ArrayList<String>b1=getboardpath(end, current)
   }

	public static void printss(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String s = str.substring(1);

		printss(s, result);
		printss(s, result + cc);

	}

	public static void printpermutation(String str,String result) {
		if(str.length()==0){
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String s = str.substring(1);
		
		for (int i = 0; i < str.length(); i++) {
			printpermutation(s,result);
			printpermutation(s, result+cc);
			
		}
}
	
	public static void printboardpath(int current,int end){
		if(current==end){
			System.out.println(current);
			return;
		}
		if(c)
		
		for(int i=1;i<=6;i++){
			printboardpath(end +i, current+i);
		}
	}
}

