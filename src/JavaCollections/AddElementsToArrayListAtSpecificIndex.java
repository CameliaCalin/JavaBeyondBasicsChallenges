package JavaCollections;

import java.util.ArrayList;

/*ex. 2 Create a program to add elements to ArrayList at specific index.*/
public class AddElementsToArrayListAtSpecificIndex {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Catch if you can");

        System.out.println(movies);

        movies.add(0, "Batman");

        System.out.println(movies);
    }
}
