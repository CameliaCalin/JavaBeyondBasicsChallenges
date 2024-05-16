package JavaCollections;

import java.util.LinkedList;
import java.util.Scanner;

public class AccessElementsOfAnLinkedList {
    public static void main(String[] args) {
        LinkedList<String> series = new LinkedList<>();

        Scanner input = new Scanner(System.in);

        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        series.add(input1);
        series.add(input2);
        series.add(input3);

        String name = series.get(2);

        System.out.println(name);

    }

}
