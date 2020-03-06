package com.company;
 class MyException extends Exception
 {
     public MyException(String s)
     {
         super(s);
     }
     public MyException(int i)
     {
         System.out.println("i value : "+i);
     }
     public MyException(int i,String s)
     {
         System.out.println("i value : "+i);
         System.out.println("s is  : "+s);
     }
     }




     class ex1{

    public void text() {
        try {
            // Throw an object of user defined exception
            throw new MyException("GeeksGeeks");
        } catch (MyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex);
        }
    }
}
class ex2{

    public void settext() {

        try {
            // Throw an object of user defined exception
            throw new MyException(10);
        } catch (MyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex);
        }
    }
}
class ex3 {

    public void gettext() {

        try {
            // Throw an object of user defined exception
            throw new MyException(100, "sreeja");
        } catch (MyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex);
        } finally {
            System.out.println("this is finally block");
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        ex1 e1 = new ex1();
        e1.text();
        ex2 e2 = new ex2();
        e2.settext();
        ex3 e3 = new ex3();
        e3.gettext();



    }
}
