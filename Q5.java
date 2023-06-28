import java.util.*;

public class Q5 {
    public static int[] increment(int[] nums){
        
        int n = nums.length;
        for(int i=n-1; i>=0; i--){
            if(nums[i] < 9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array in sorted order");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The new array is "+ Arrays.toString(increment(nums)));
    }
    
}