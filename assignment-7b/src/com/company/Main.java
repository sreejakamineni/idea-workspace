package com.company;
class Cycle
{
    public void balance()
    {
        System.out.println("this is cycle class");
    }
}
class Unicycle extends Cycle
{
    public void balance() {
        System.out.println("this is unicycle class ");
    }
}
class Bicycle extends Cycle
{
    public void balance()
    {
        System.out.println("this is a bicycle");
    }
}
class Tricycle extends Cycle
{
    public void balance()
    {
        System.out.println("this is a tricycle");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Cycle c[] = new Cycle[3];
        c[0]= new Unicycle();
        c[1]= new Bicycle();
        c[2]= new Tricycle();
      Cycle  cc = c[0];
      cc.balance();
        Cycle  c1 = c[1];
        c1.balance();
        Cycle  c2 = c[2];
        c2.balance();
        Cycle cy = new Unicycle();
        Unicycle u = (Unicycle) cy;
        u.balance();
    }
}
