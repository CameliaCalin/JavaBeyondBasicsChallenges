package JavaAdditionalTopics;
/*Create a program to represent enum constants in string.*/
public enum RepresentEnumConstantsInString {
    //add constants
    WINDOWS, MACOS, LINUX;
}

class Main1{
    public static void main(String[] args) {
        //create a variable
        String osType;
        osType = RepresentEnumConstantsInString.MACOS.toString();

        System.out.println(osType);
    }
}
