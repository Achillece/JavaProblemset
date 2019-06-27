package test;

public class convertZ {
	public static String convert(String s, int numRows) {
		 if (numRows == 1) return s;

	        StringBuilder ret = new StringBuilder();
	        int n = s.length();
	        int cycleLen = 2 * numRows - 2;

	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j + i < n; j += cycleLen) {
	                ret.append(s.charAt(j + i));
	                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
	                    ret.append(s.charAt(j + cycleLen - i));
	            }
	        }
	        return ret.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ASFASFAS";
		System.out.println(convert(a,4));
	}

}
