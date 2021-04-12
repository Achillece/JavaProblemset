package test;
//no.58
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
    	String[] list=s.split(" ");
    	if(list.length==0)return 0;
    	return list[list.length-1].length();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   ";
		LengthOfLastWord lengthOfLastWord=new LengthOfLastWord();
		System.out.println(lengthOfLastWord.lengthOfLastWord(s));
	}

}
