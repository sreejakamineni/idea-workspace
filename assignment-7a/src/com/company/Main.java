package com.company;
abstract class rodent
{
    abstract public void animal();

}
class Mouse extends rodent
{
    public void animal()
    {
        System.out.println("derived class");
    }
    public Mouse()
    {
        System.out.println("i am mouse");
    }
}
class Grible extends rodent
{
    public void animal()
    {
        System.out.println("derived class");
    }
    public Grible()
    {
        System.out.println("i am grible");
    }
}
class Hamster extends rodent
{
    public void animal()
    {
        System.out.println("derived class");
    }
    public Hamster()
    {
        System.out.println("i am hamster");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        rodent r[] = new rodent[3];
        r[0]= new Mouse();
        r[0].animal();
        r[1]= new Grible();
        r[2]=new Hamster();

    }
}
