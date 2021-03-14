package com.mek;

public class Main {

    public static void main(String[] args) {
	    byte byteValue = 120;
	    short shortValue = 15;
		int intValue = 250;

		long longValue = 50000L + (10 * (byteValue+shortValue+intValue));
		//System.out.println("total = "+ longValue);
		short shortTotal = (short)(byteValue+shortValue+intValue);
		byte byteTotal = (byte)(byteValue+shortValue+intValue);
		System.out.println("long value = "+ longValue + " short total = "+ shortTotal + " byte total = " + byteTotal);
    }
}
