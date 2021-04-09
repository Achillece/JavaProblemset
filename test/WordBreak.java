package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class WordBreak {
	static Set<String> set;
    static List<String> ans;
    public static List<String> wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>();
        ans = new ArrayList<>();
        if(wordBreak_check(s,wordDict)==false){
            return ans;
        }
        for(String tmpS:wordDict){
            set.add(tmpS);
        }
        String cur = "";
        dfs(s,cur);
        return ans;
    }
    public static void dfs(String last, String pre){
        if(set.contains(last)){
            ans.add(pre.concat(last));
        }
        int len = last.length();
        for(int i=1;i<len;i++){
            if(set.contains(last.substring(0,i))){
                dfs(last.substring(i, len), pre.concat(last.substring(0, i)).concat(" "));
            }
        }
    }
    public static boolean wordBreak_check(String s, List<String> wordDict) {
        int maxWordLength = 0;
        for(int i=0;i<wordDict.size();i++){
            maxWordLength = Math.max(maxWordLength,wordDict.get(i).length());
        }
        boolean[] dp = new boolean [s.length()+1];
        dp[0] = true;
        for(int i=1;i<s.length()+1;i++){
            int x = i-maxWordLength>0?i-maxWordLength:0;
            for(int j=x;j<i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="leetcode";
		List<String> wordDict=new ArrayList<>();
		wordDict.add("leet");wordDict.add("code");wordDict.add("leetcode");
		System.out.println(wordBreak(s,wordDict));
	}

}
