package lecture21;

public class DPDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cbp=count board path

	}

	public static int cbp(int end, int curr) {
		if (end == curr) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + cbp(end, curr + dice);
		}
		return count;
	}

	public static int cbpRS(int end, int curr, int[] strg) {
		if (end == curr) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + cbpRS(end, curr + dice, strg);
		}
		strg[curr] = count;
		return count;
	}

	public static int cbpIT(int end, int curr) {
		int[] strg = new int[end + 1];
		// seed
		strg[end] = 1;

		for (int i = end - 1; i >= 0; i--) {
			int sum = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
				sum = sum + strg[dice + 1];
			}
			strg[i] = sum;

		}
		return strg[0];
	}

	public static int countmazepath(int er, int ec, int cr, int cc) {
		int count = 0;
		if (er == cr && cc == ec) {

			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		count = count + countmazepath(er, ec, cr + 1, cc);
		count = count + countmazepath(er, ec, cr, cc + 1);

		return count;

	}

	public static int countmazepathRS(int er, int ec, int cr, int cc, int[][] strg) {
		int count = 0;
		if (er == cr && cc == ec) {

			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		count = count + countmazepathRS(er, ec, cr + 1, cc, strg);
		count = count + countmazepathRS(er, ec, cr, cc + 1, strg);
		strg[cr][cc] = count;
		return count;

	}

	public static int countmazepathIT(int er, int ec, int cr, int cc) {
		int[][] strg = new int[er + 1][er + 1];
		// seed
		strg[er][ec] = 1;
		for (int i = er; i >= 0; i++) {
			for (int j = ec; j >= 0; j--) {
				if (i == er || j == ec) {
					strg[i][j] = 1;
					strg[i][j] = strg[i + 1][j] + strg[i][j + 1];
				}
			}

		}
		return strg[cr][cc];
	}

	public int lcs(String s1, String s2) {

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int rv = 0;
		if (s1.charAt(0) == s2.charAt(0)) {
			rv = 1 + lcs(ros1, ros2);
		} else {
			int f1 = lcs(ros1, s2);
			int f2 = lcs(s1, ros2);
			rv = Math.max(f1, f2);
		}
		return rv;
	}

	public int lcsIT(String s1,String s2){
		int [][] strg=new int[s1.length()+1][s2.length()+1];
		//seed
		strg[s1.length()][s2.length()]=0;
		for(int i=;i>=0;i++){
			
		}
			
		
	}

	public int editDistanceI(String s1,String s2){
		int [][]strg=new int[s1.length()+1][s2.length()+1];
		//seed
		strg[s1.length()][s2.length()]=0;
		
		for(int i=s1.length();i>=0;i--){
		for(int j=s2.length();j>=0;j--){
			if(i==s1.length()){
				strg[i][j]=s2.length()-j;
				continue;
			}if(j==s2.length()){
				strg[i][j]=s1.length()-i;
				continue;
			}
			if(s1.charAt(i)==s2.charAt(j)){
				strg[i][j]=strg[i+1][j+1];
			}else{
				int f1=
			}
		}
		}
	}
}
