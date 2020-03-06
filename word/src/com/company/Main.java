package com.company;

import edu.duke.FileResource;

import java.util.Arrays;

class Wordlength
{
    public void countWordLengths(FileResource resource, int[] counts) {
        //FileResource resource = new FileResource("data/common.txt");
        int index = 0;
        for (String s : resource.words()) {
            counts[index] = s.length();
            index += 1;
        }
        int k;
        for (int i = 0; i < index; i++) {
            k = 1;
            for (int j = i + 1; j < index; j++) {
                if (counts[i] == counts[j]) {
                    k++;
                    System.out.println(k + "words of length" + counts[i]);
                }
            }

        }
    }
    public void indexOfMax(int[] value)
    {
        int max = Arrays.stream(value).max().getAsInt();
        System.out.println("Largest in given array is " +max);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Wordlength w = new Wordlength();
        int[] counts = new int[31];
        FileResource resource = new FileResource();
        w.countWordLengths(resource,counts);
         w.indexOfMax(counts);
    }
}
