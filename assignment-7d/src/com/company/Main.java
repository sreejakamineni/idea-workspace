package com.company;

import static java.sql.DriverManager.println;

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public void ride() { println("Ride Unicycle"); }
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    public void ride() { println("Ride Bicycle"); }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}


class Tricycle implements Cycle {
    Tricycle() { println("Tricycle()"); }
    public void ride() { println("Ride Tricycle"); }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class Main {
    public static void rideCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.ride();
    }
    public static void main(String [] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
