package com.company;
class Alpha
{
    public void function(String s)
    {

        int val,t;
        int count =0;
        for(int i=0;i<s.length();i++)
        {
            val= s.indexOf(s.charAt(i));
            t= s.indexOf(val,s.charAt(i));
            if(t<val)
            {
                count++;
            }

        }
        if(count==26)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }


        }
    }


public class Main {

    public static void main(String[] args) {
	// write your code here
        Alpha a = new Alpha();
        a.function("abcdefghijklmno");
    }
}
