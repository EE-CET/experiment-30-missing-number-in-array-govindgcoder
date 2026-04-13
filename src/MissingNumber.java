import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int expected_sum = (n * (n+1))/2;
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i = 0; i<n; i++){
            sum+=arr[i];
        }
        int missing = expected_sum-sum;
        System.out.print(missing);
    }
        // TODO: Read n
        // TODO: Calculate the expected sum of numbers from 0 to n: (n * (n + 1)) / 2
        // TODO: Read n integers and calculate the actual sum of the array elements
        // TODO: The missing number is (expectedSum - actualSum)
        // TODO: Print the result
    
}
