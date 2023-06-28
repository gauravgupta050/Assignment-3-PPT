import java.util.Scanner;
import java.util.Arrays;

public class Q1 {
    public static int triSum(int[] nums, int target){
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[nums.length-1];

        for(int i=0; i<nums.length-2;i++){
            int lo = i+1;
            int hi = nums.length-1;
            int temp = 0;

            while(lo<hi){
                temp = nums[i] + nums[lo] + nums[hi];
                if(temp>target){
                    hi--;
                }
                else{
                    lo++;
                }

                if(Math.abs(sum - target)>Math.abs(temp - target)){
                    sum = temp;
                }
            }
        }return sum;

    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value to target");
        int target = sc.nextInt();
        int result = triSum(nums,target);
        System.out.println("The closet sum of the given target is "+result);
        
    }
    
}
