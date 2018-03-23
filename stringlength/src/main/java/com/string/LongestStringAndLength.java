package com.string;

public class LongestStringAndLength {
    String longestString;
    int stringLength;
    public LongestStringAndLength(String longestStr,int stringLen){
        this.longestString = longestStr;
        this.stringLength = stringLen;
    }

    public String toString(){
        if(longestString == null) return null;
        return stringLength+" and "+longestString;
    }
}
