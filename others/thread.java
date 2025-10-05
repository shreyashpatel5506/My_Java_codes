
class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A" + i + " is running");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread B" + i + " is running");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class thread {
    public static void main(String[] args) {
        A t1 = new A();
        t1.start();
        B t2 = new B();
        t2.start();
    }
}