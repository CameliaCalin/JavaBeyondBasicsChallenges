package JavaAdditionalTopics;

import java.util.Scanner;

/*Create a program that prints any type of data.

 */
public class PrintValueOfAnyDataType {
    public <T> void display(T data){
        System.out.println(data);
    }

    public static void main(String[] args) {
        //create object
        PrintValueOfAnyDataType obj = new PrintValueOfAnyDataType();

        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        obj.<String>display(input1);
    }
}
