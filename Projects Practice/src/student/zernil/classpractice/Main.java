package student.zernil.classpractice;



public class Main {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int result = 1;
//        System.out.println("input number of items");
//        int numOutput;
//        if(input.hasNextInt()){
//            numOutput = input.nextInt();
//        }
//        else {
//            input.next();
//            numOutput = 0;
//            System.out.println("You did not put in a number. Now exiting.");
//        }
//        for(int i = 0; Math.random() > 0.1d;){
//            if(i >= numOutput){
//                result = i;
//                break;
//            }
//            else{
//                i++;
//                result = i;
//            }
//        }
//        System.out.println(result);
        RandomCalculation newRandom = new RandomCalculation();
        newRandom.runRandom();

    }
}
