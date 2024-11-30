import java.util.Arrays;

public class StringTutorial {

    public static void main(String[] arg){
        int[] arr = {2, 33, 4, 5, 6, 7, 33, 8, 91, 1};
        int num [] = Arrays.stream(arr).sorted().toArray();



        System.out.println("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]); // Take absolute value to handle modifications
            if (index < arr.length) {
                if (arr[index] < 0) {
                    // If the value is already negative, it's a duplicate
                    System.out.print(index + " ");
                } else {
                    // Mark this index as visited
                    arr[index] = -arr[index];
                }
            }
        }
    }
}
