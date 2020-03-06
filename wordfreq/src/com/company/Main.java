package com.company;

import edu.duke.FileResource;

import java.util.ArrayList;

class WordFrequencies
{
     ArrayList <String> mywords;
    ArrayList <Integer> myfreqs;

public WordFrequencies()
{
    mywords = new ArrayList <String>();
    myfreqs = new ArrayList <Integer>();
}
public void findUnique()
{
    FileResource resource = new FileResource();
    for(String s : resource.words()) {
        s = s.toLowerCase();
        int index = mywords.indexOf(s);
        if (index == -1) {
            mywords.add(s);
            myfreqs.add(1);
        } else {
            int freq = myfreqs.get(index);
            myfreqs.set(index, freq + 1);
        }
    }
        System.out.println("unique words"+mywords.size());
    for(int k=0;k<mywords.size();k++) {
        System.out.println(myfreqs .get(k)+ " " + mywords.get(k));
    }


}
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        WordFrequencies wf = new WordFrequencies();
        wf.findUnique();

    }
}
