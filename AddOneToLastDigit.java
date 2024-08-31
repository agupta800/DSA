import java.util.Arrays;

public class AddOneToLastDigit {
    public static void main(String[] args) {
        int[] array = {1, 2, 50}; // Example array
        int[] result = addOne(array);
        System.out.println("Resulting Array: " + Arrays.toString(result));
    }

    public static int[] addOne(int[] array) {
        int n = array.length;

        // Add 1 to the last element
        array[n - 1] += 1;
        
        // Return the modified array
        return array;
    }
}
