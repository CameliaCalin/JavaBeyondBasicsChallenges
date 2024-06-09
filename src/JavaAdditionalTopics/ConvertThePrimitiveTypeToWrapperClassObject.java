package JavaAdditionalTopics;


/*Create a program to convert the primitive type into their corresponding wrapper class object.*/
public class ConvertThePrimitiveTypeToWrapperClassObject {
    public static void main(String[] args) {
        char x = 'c';

        //convert the primitive type into object
        Character xObj = Character.valueOf(x);

        System.out.println(xObj);
    }

}
