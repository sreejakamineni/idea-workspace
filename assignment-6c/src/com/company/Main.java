package com.company;
class con
{
    public con(String s)
    {
        System.out.println(s);
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        con cc[] = new con[10];
        for (int i = 0; i < 10; i++) {
            cc[i] = new con(String.valueOf(i));
        }
    }
}
