package com.javapoc.oops;


class Machine {

    class AI {
        public void activate() {
            System.out.println("Machine " + id + " is activated!");
        }
    }

    static class Tire {
        public void repair() {
            System.out.println("Tires are repaired ");
        }
    }

    private int id;

    public Machine(int id) {
        this.id = id;
    }

    public void run() {

        System.out.println("Run machine" + " " + id);

        AI ai = new AI();
        ai.activate();

        final String type = "Electric";

        class Test {

            public void example() {

                System.out.println("ID is " + id);
                System.out.println("Type is " + type);
            }
        }
        Test test = new Test();
        test.example();

    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Machine ma = new Machine(12);
        ma.run();

        Machine.Tire tire = new Machine.Tire();
        tire.repair();
    }
}
