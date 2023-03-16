package org.system;

public class FindCharCount {
	public static void main(String[] args) {
		String s1="testleaf";
		int count =0;
		char[] charArray = s1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='e') {
				count++;
			}
		}
			System.out.println(count);
		}
		
	}


