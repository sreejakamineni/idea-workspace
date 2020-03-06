package com.company;
class con
{
    public con(int i)
    {
        System.out.println("i value : "+i);
        con c = new con("sreeja");
    }
    public con(String s)
    {
        System.out.println("string  is :" +s);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        con cc = new con(10);
    }
}
