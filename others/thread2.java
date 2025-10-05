class A implements Runnable {
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class B implements Runnable {
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class thread2 {
    public static void main(String[] args) {
        A runnable1 = new A();
        B runnable2 = new B();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();

    }
}
