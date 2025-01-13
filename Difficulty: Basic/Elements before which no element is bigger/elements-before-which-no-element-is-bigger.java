//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];
            for (int j = 0; j < inputArray.length; j++) {
                arr[j] = Integer.parseInt(inputArray[j]);
            }

            Solution solution = new Solution();
            System.out.println(solution.countElements(arr));
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
    public int countElements(int[] arr) {
        if((arr.length==0)||(arr==null)) return 0;
        int sum =1;
        int max= arr[0];
        for (int i=0;i<arr.length ;i++){
            if (arr[i]>max) {
                sum++;
                max=arr[i];
            }
        }
        return sum;
    }
}
