import java.util.Arrays;

/**
 * R02_EXP02_J
 * https://wiki.sei.cmu.edu/confluence/display/java/EXP02-J.+Do+not+use+the+Object.equals%28%29+method+to+compare+two+arrays
 */
public class R02_EXP02_J {

    public static void main(String[] args) {
        checkArrayEquality();
    }

    /**
     * Non-compliant code
     */
    private static void checkArrayEquality() {
        
        int[] arr1 = new int[20]; // Initialized to 0
        int[] arr2 = new int[20]; // Initialized to 0
        System.out.println(arr1.equals(arr2)); // Prints false. Wrong
    }

}