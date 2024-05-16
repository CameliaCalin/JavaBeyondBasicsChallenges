package JavaCollections;

import java.util.ArrayList;
/* ex. 1 Create a program to create and add elements to an arraylist.*/

public class CreateAndAddElementsToAnArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList to store strings
        ArrayList<String> series = new ArrayList<>();

        // Add elements to the ArrayList
        series.add("Game of Thrones");
        series.add("Breaking Bad");
        series.add("Stranger Things");

        // Print the ArrayList
        System.out.println("TV Series: " + series);
    }
}



