package JavaAdditionalTopics;

import static javax.swing.text.StyleConstants.Size;

/*Create a program to create enum class.*/
public enum CreateEnumClass {
    //add constants
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;

    //create a method

    public String getSize(){
        //this refers o current object
        switch(this) {
            case SMALL:
                return "small";
            case MEDIUM:
                return "medium";
            case LARGE:
                return "large";
            case EXTRA_LARGE:
                return "extra large";
            default:
                return "nothing";
        }
    }
}

class Main{
    public static void main(String[] args) {
        System.out.println("Your card is:" + CreateEnumClass.MEDIUM.getSize());
    }
}
