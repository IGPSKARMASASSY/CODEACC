package com.string;

public class StringLength {

    public  LongestStringAndLength findLongestString(String str) {
        if(str == null) return null;
        String splitStr[]=str.split(" ");
        int maxLength = 0;
        String longestString = null;
        for (String s : splitStr) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return new LongestStringAndLength(longestString,maxLength);
    }

}
