package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
    	Map<String,List<String>> map=new HashMap<>();
    	for(String str:strs){
    		char[] array = str.toCharArray();
    		Arrays.sort(array);
    		String key = new String(array);
    		List<String> list = map.getOrDefault(key, new ArrayList<String>());
    		list.add(str);
    		map.put(key, list);
    	}
    	
    	return new ArrayList<List<String>>(map.values());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(a));
	}

}
