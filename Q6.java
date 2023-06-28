import java.util.*;

public class Q6 {
    public static int singleNumber(int[] nums){

        int singleNum = nums[0];

        for(int i=1; i<nums.length; i++){
            singleNum = singleNum ^ nums[i];


        }
        return singleNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int result = singleNumber(nums);
        System.out.println("The number having single occurence is "+result);

    }
    
}
