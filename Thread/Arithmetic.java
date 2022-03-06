package Thread;

public class Arithmetic {
    private int result = 0;

    public void add(int num1, int num2) {
        this.result+= num1 + num2;
    }

    public void mul(int num1, int num2) {
        this.result+=  num1 * num2;
    }

    public void div(int num1, int num2) {
        try {
            this.result+= num1 / num2;
        }catch (ArithmeticException e){
            System.out.println ("cant divide by zero");
        }

    }

    public void min(int num1, int num2) {
        this.result+=num1 - num2;
    }

    public int getResult() {
        return result;
    }
}
