package Thread;

public class command implements Runnable {
    private Arithmetic arithmetic;
    private int num1;
    private int num2;

    public command(Arithmetic arithmetic, int num1, int num2) {
        this.arithmetic = arithmetic;
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        String currentThread = Thread.currentThread().getName();
        switch (currentThread) {
            case "Thread-0": {
                arithmetic.add(num1, num2);
                System.out.println(Thread.currentThread().getName()+" "+arithmetic.getResult());
                break;
            }
            case "Thread-1": {
                arithmetic.min(num1, num2);
                System.out.println(Thread.currentThread().getName()+" "+arithmetic.getResult());
                break;
            }
            case "Thread-2": {
                arithmetic.mul(num1, num2);
                System.out.println(Thread.currentThread().getName()+" "+arithmetic.getResult());
                break;
            }
            case "Thread-3": {
                arithmetic.div(num1, num2);
                System.out.println(Thread.currentThread().getName()+" "+arithmetic.getResult());
                break;
            }
        }
    }
}
