package test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        BigDecimal a = in.nextBigDecimal();
        a = a.stripTrailingZeros();
        int b = in.nextInt();
        String s;
        BigDecimal c = a.pow(b);
        if(c.compareTo(BigDecimal.ONE) == -1)
            s = c.toPlainString().replaceFirst("0", "");
        else
            s = c.toPlainString();
        System.out.println(s);
        }
	}

}
