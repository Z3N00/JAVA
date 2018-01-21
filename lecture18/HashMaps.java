package lecture18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbccddeaaa";
		int[] arr={1,3,1,4,5,2,3,4,5};

	}

	public static char MaxFreq(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++){
			char cc=str.charAt(i);
			if(map.containsKey(cc)){
				int ov=map.get(cc);
				ov=ov+1;
				map.put(cc,ov);
			}else{
				map.put(cc, 1);
			}
		}
		set<Map.Entry<Character,Integer>>enteries=map.entrySet();
		int maxvalue=0;
		int maxchar='\0';
		for(Map.Entry<Character,Integer>entry:enteries){
			if(entry.getvalue()>maxvalue){
				maxvalue=entry.getValue();
				maxchar=entry.getKey();
			}
		}
		return maxchar;
	}
	public static ArrayList<Integer>getUniqueElement(int[] arr){
	          HashMap<Integer,Integer> map=new HashMap<>();	
	         for(int value:arr)
	        	 map.put(value, 1);
	         ArrayList<Integer>list=new ArrayList<>();
	         Set<Integer>
	          
	}

}
