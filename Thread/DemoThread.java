package Thread;


import java.util.ArrayList;

public class DemoThread {
    public static void show() {

        ArrayList<Thread> threads = new ArrayList<>();
        Arithmetic arithmetic = new Arithmetic();
        int num1 = 2, num2 = 2;
        for (int i = 0; i < 4; i++) {
            Thread t = new Thread(new command(new Arithmetic(),num1,num2));
            t.start();
            threads.add(t);
        }


        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("doneeeee");

    }
}
