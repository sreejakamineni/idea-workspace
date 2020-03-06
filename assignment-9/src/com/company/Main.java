package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

class Test
{
    public boolean write(String s)
    {
        String regex = "[A-Z].*[.]";
        Pattern pattern = Pattern.compile("regex");
       // Matcher m = pattern.matcher("s");
       // boolean b= m.matches();
        if (pattern.matches(regex,s))
        {
           return true;
        }
        else
        {
            return false;
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Test t = new Test();
        System.out.println(t.write("Sreeja."));
    }
}
