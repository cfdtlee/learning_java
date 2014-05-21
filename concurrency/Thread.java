/*************************************************************************
 > File Name: Thread.java
 > Author: Eric
 > Mail: cfdtlee@gmail.com 
 > Created Time: Wed May 21 10:22:10 2014
 ************************************************************************/
public class Thread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}

class Lift Off implements Runnable() {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff() {

    }
    public LiftOff() {
        this.countDown = countDown;
    }
    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }
    public void run() {
        while(countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }
}
