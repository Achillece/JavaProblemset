package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindSubstring {
	public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return res;
        HashMap<String, Integer> map = new HashMap<>();
        int one_word = words[0].length();
        int word_num = words.length;
        int all_len = one_word * word_num;
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i < s.length() - all_len + 1; i++) {
            String tmp = s.substring(i, i + all_len);
            HashMap<String, Integer> tmp_map = new HashMap<>();
            for (int j = 0; j < all_len; j += one_word) {
                String w = tmp.substring(j, j + one_word);
                tmp_map.put(w, tmp_map.getOrDefault(w, 0) + 1);
            }
            if (map.equals(tmp_map)) res.add(i);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] words={"word","good","best","word"};
		String[] words={"foo","bar"};
		String  s = "barfoothefoobarman";
		//String s="wordgoodgoodgoodbestword";
		//String s="bcabbcaabbccacacbabccacaababcbb";
		//String[] words=	{"c","b","a","c","a","a","a","b","c"};
		System.out.println(findSubstring(s, words));
	}

}
