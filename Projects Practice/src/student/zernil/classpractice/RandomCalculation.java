package student.zernil.classpractice;
import java.util.Scanner;
public class RandomCalculation {
    private Scanner input = new Scanner(System.in);
    private int result = 1;
    private int number;
    private void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    private double random(){
        return Math.random();
    }

    private void randomGen() {
        for (int i = 0; random() > 0.1d; ) {
            if (i >= number) {
                setResult(i);
                break;
            } else {
                i++;
                setResult(i);
            }
        }
    }
    public void runRandom() {
        while (true) {
            System.out.println("Enter number:");
            if (input.hasNextInt()) {
                number = input.nextInt();
                break;
            }
            System.out.println("Please enter a valid number.");
            input.next();
        }
        randomGen();
        System.out.println(getResult());
    }
}
