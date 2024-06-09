package JavaAdditionalTopics;

import java.util.Scanner;

interface LambdaExpressionWithParameters {
    //create abstract method
    void multiply(int x, int y);

}

class Main4 {
    public static void main(String[] args) {
        //implement the functional interface usinbg lamda
        LambdaExpressionWithParameters obj = (x, y) ->{
            System.out.println(x*y);
        };

        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();

        //call the multiply method
        obj.multiply(input1, input2);
    }
}
