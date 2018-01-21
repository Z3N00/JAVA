package lecture8;

import java.util.ArrayList;

public class rec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countmazepath(2, 2, 0, 0));
		System.out.println("********************************************");
		System.out.println(getmazepath(2, 2, 0, 0));
		System.out.println("********************************************");
		printmazepath(2, 2, 0, 0, " ");
		System.out.println("********************************************");
		System.out.println(countdiagmazepath(2, 2, 0, 0));
		System.out.println("********************************************");
		System.out.println(getmazepathwd(2, 2, 0, 0));
	}

	public static int countmazepath(int er, int ec, int cr, int cc) {

		int count = 0;
		if (er == cr && cc == ec) {

			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		if (cr <= er && cc <= ec) {

			count = count + countmazepath(er, ec, cr + 1, cc) + countmazepath(er, ec, cr, cc + 1);

		}
		return count;

	}

	public static ArrayList<String> getmazepath(int er, int ec, int cr, int cc) {

		if (cr == er && cc == ec) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add(" ");
			return baseresult;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> baseresult = new ArrayList<>();
			return baseresult;
		}
		ArrayList<String> hresult = getmazepath(er, ec, cr, cc + 1);
		ArrayList<String> vresult = getmazepath(er, ec, cr + 1, cc);
		ArrayList<String> myresult = new ArrayList<>();
		for (int i = 0; i < hresult.size(); i++) {
			myresult.add("H" + hresult.get(i));
		}
		for (int i = 0; i < vresult.size(); i++) {
			myresult.add("V" + vresult.get(i));
		}

		return myresult;
	}
	
	public static void printmazepath(int er,int ec,int cr,int cc,String path){
		if(er==cr&&ec==cc){
			System.out.println(path);
			return;
		}
		if(cr>er||cc>ec){
			return;
		}
		printmazepath(er, ec, cr+1, cc,path+"V");
		printmazepath(er, ec, cr, cc+1,path+"H");
	}
	
	public static int countdiagmazepath(int er,int ec,int cr,int cc){
		int count = 0;
		if (er == cr && cc == ec) {

			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		if (cr <= er && cc <= ec) {

			count = count + countdiagmazepath(er, ec, cr + 1, cc) + countdiagmazepath(er, ec, cr, cc + 1)+countdiagmazepath(er, ec, cr+1, cc+1);

		}
		return count;

		
	}
	public static ArrayList<String> getmazepathwd(int er, int ec, int cr, int cc) {

		if (cr == er && cc == ec) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add(" ");
			return baseresult;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> baseresult = new ArrayList<>();
			return baseresult;
		}
		ArrayList<String> hresult = getmazepathwd(er, ec, cr, cc + 1);
		ArrayList<String> vresult = getmazepathwd(er, ec, cr + 1, cc);
		ArrayList<String> dresult = getmazepathwd(er, ec, cr + 1, cc+1);
		
		ArrayList<String> myresult = new ArrayList<>();
		for (int i = 0; i < hresult.size(); i++) {
			myresult.add("H" + hresult.get(i));
		}
		for (int i = 0; i < vresult.size(); i++) {
			myresult.add("V" + vresult.get(i));
		}
		for (int i = 0; i < dresult.size(); i++) {
			myresult.add("D" + dresult.get(i));
		}

		return myresult;
	}
}
