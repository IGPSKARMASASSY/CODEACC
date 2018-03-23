package com.string;

import org.junit.Test;
import static org.junit.Assert.*;


public class StringLengthTest {

    StringLength findLongestStringInStringArray = new StringLength();

    @Test
    public void StringCheckValidInput(){
        String input ="The cow jumped over the moon.";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        assertEquals(longestStringAndLength.toString(),"6 and jumped");
    }

    @Test
    public void StringCheckEmptyInput(){
        String input ="";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        System.out.println("Length and String "+longestStringAndLength);
        assertNull(longestStringAndLength.toString());
    }

    @Test
    public void StringCheckNulInput(){
        String input =null;
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        System.out.println("Length and String "+longestStringAndLength);
        assertNull(longestStringAndLength);
    }
    
    @Test
    public void StringCheckStringWithDoubleSpace(){
        String input ="The cow     jumped over the moon.";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        System.out.println("Length and String "+longestStringAndLength);
        assertEquals(longestStringAndLength.toString(),"6 and jumped");
    }
   
    @Test
    public void StringCheckStringWithSpecialCharacter(){
        String input ="The cow  &*&*&   jumped over the moon.";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        System.out.println("Length and String "+longestStringAndLength);
        assertEquals(longestStringAndLength.toString(),"6 and jumped");
    }
    
    @Test
    public void StringCheckSpecialCharacter(){
        String input ="&*&*& &&&&&&";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        System.out.println("Length and String "+longestStringAndLength);
        assertEquals(longestStringAndLength.toString(),"6 and &&&&&&");
    }
    
    @Test
    public void StringCheckFullStopBeforeJumped(){
        String input ="The cow .jumped over the moon";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        System.out.println("Length and String "+longestStringAndLength);
        assertEquals(longestStringAndLength.toString(),"7 and .jumped");
    }
    
    @Test
    public void StringCheckFullStopBeforemoon(){
        String input ="The cow jumped over the .()___moon";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        System.out.println("Length and String "+longestStringAndLength);
        assertEquals(longestStringAndLength.toString(),"10 and .()___moon");
    }
    
    @Test
    public void StringDoubleSpace(){
        String input ="      ";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        System.out.println("Length and String "+longestStringAndLength);
        assertEquals(longestStringAndLength.toString(),null);
    }
    
    @Test
    public void StringSpecialCharacter(){
        String input ="<>";
        LongestStringAndLength longestStringAndLength = findLongestStringInStringArray.findLongestString(input);
        System.out.println("Length and String "+longestStringAndLength);
        assertEquals(longestStringAndLength.toString(),"2 and <>");
    }
}
