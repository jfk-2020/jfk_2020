package com.jfk.human;

/**
 * @author William Arustamyan
 */

public class App {

    public static void main(String[] args) {
        Human human = new Human("name", 64);
        Worker worker = new Worker("Accouter", "worker", 54);
        System.out.println(worker);
        f(human);
    }

    public static void f(Human human) {
        human.getAge();
    }

    public static void foo(Worker worker) {
        worker.getAge();
        worker.getProfession();
    }
}
