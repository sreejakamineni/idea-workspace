package com.company;


//import edu.duke.FileResource;

import java.util.HashMap;
import java.io.*;
import java.util.Map;

class Count
{
    public void letter() throws Exception
    {
        File f = new File("/home/sreeja/Desktop/f1");
        FileReader fr = new FileReader(f);
        HashMap<Character,Integer > map = new HashMap   <Character,Integer>();
        int i;
        char ch;
        while((i=fr.read())!=-1) {
            ch = (char) i;
            if (ch != ' ' || ch != '\t' || ch != '\n') {
                if (map.containsKey(ch)) {
                    map.put(ch, (int) map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }
            for (Map.Entry entry : map.entrySet())
            {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }




    }
}
public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Count l = new Count();
        l.letter();
      }
}
