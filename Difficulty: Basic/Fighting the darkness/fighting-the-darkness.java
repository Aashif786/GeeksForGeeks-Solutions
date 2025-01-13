//{ Driver Code Starts
import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    long maxDays(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

//{ Driver Code Starts.

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String input = br.readLine();
            String[] numbers = input.split("\\s+");
            int[] arr = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxDays(arr));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends