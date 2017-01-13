package com.idea.cjyl.core.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

	private final static char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	
	public final static String MD5(String s) throws NoSuchAlgorithmException {

			byte[] btInput = s.getBytes();
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			mdInst.update(btInput);
			byte[] md = mdInst.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
	}
	public static void main(String[] args) throws NoSuchAlgorithmException {

		String s = MD5Util.MD5("1");
		System.out.println(s);
	}
}
