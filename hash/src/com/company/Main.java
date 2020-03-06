package com.company;

import java.util.HashMap;
import edu.duke.FileResource;


class Problem {

    private HashMap<String, Integer> map;

    public Problem() {
        map = new HashMap<String,Integer>();
    }

    public void cod(String codon, String dna, int start) {
        int count = 0;
        int val = dna.indexOf(codon);
        while (val != -1) {
            count++;
            val = dna.indexOf(codon, val + 3);
        }
        System.out.println(codon + " " + count);
      //  map.put("TCA",1);
       // map.put("CGT",2);
       // map.put("AGT",3);
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        Problem p = new Problem();
        p.cod("CGT","CGTTCAAGTTCAA",1);
    }
}