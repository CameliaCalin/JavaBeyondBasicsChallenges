package JavaAdditionalTopics;
//Create a program to print value of any data type.

import java.util.Scanner;

//create a genrics class
     class PrintAnyTypeOfData<T> {
         //create constructor with parameter T data
    public PrintAnyTypeOfData(T data){
        System.out.println(data);
    }

}

class Main3{
    public static void main(String[] args) {
        //take an integer input
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();

        //craete an object of PrintData object with integer data
        PrintAnyTypeOfData<Integer> intObj = new PrintAnyTypeOfData<>(input1);
    }
}
